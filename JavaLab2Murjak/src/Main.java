import java.io.*;
import java.nio.charset.StandardCharsets;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Main {
    static Scanner scanner = new Scanner(System.in);
    static String fileName = "D://Murjak.txt";

    public static void main(String[] args) {
        ChooseMenu();
    }

    static void ChooseMenu() {
        int index;
        do {
            System.out.println("1.Завдання з рядком\n2.Робота з файлом\n3.Вихід");
            index = scanner.nextByte();
            switch (index) {
                case 1: {
                    TaskOneA();
                }
                break;
                case 2: {
                    do {
                        System.out.println("1.Добавити в файл\n2.Вивести весь файл\n3.Назад в меню");
                        index = scanner.nextInt();
                        switch (index) {
                            case 1:
                                AddToFile();
                                break;
                            case 2:
                                ReadFile();
                                break;
                        }
                    } while (index != 3);
                    index = 0;
                }
                break;
            }
        } while (index != 3);
    }

    static void TaskOneA() {
        String str;
        System.out.print("Введіть текст: ");
        str = scanner.nextLine();
        str = scanner.nextLine();
        String result = str.toLowerCase();
        System.out.println("Речення: " + result);
        ArrayList<Integer> wordIndex = new ArrayList<Integer>();
        int index = 0;
        for(int i = 0; i < str.length();i++)
        {
            index = i;
            int j;
            for(j = i ; j < str.length();j++)
            {
                if(str.charAt(j) == ' ')
                {
                    if((j-index)%2 == 0)
                        wordIndex.add(index);
                   i=j;
                    break;
                }
                if(j+1 == str.length())
                {
                    if(((j+1)-index)%2 == 0)
                        wordIndex.add(index);
                }


            }
            i=j;
        }
        for(Integer i : wordIndex)
        {
            System.out.print("Слово: ");
            for(int j = i ; j< str.length();j++)
            {
                if(str.charAt(j) == ' ') break;
                System.out.print(str.charAt(j));

            }
            System.out.println();
        }
    }


    static void AddToFile() {
        String text;
        System.out.print("Введіть прізвище і оцінку: ");
        text = scanner.nextLine();
        text = scanner.nextLine();
        try {
            FileOutputStream outStream = new FileOutputStream(fileName, true);
            DataOutputStream dos = new DataOutputStream(outStream);
            dos.writeUTF(text);
            outStream.close();
        } catch (IOException e) {
            System.out.println("Error");
        }
    }

    static void ReadFile() {
        try {
            FileInputStream fis = new FileInputStream(fileName);
            DataInputStream dis = new DataInputStream(fis);
            Scanner sc = new Scanner(fis);
            String word;
            while (dis.available() > 0) {
                word = dis.readUTF();
                for(int i = 0; i < word.length();i++)
                {
                    if(word.charAt(i) == ' ')
                    {
                        String tmp = new String();
                        for(int j = i+1 ; j < word.length();j++)
                        {
                            tmp += word.charAt(j);
                            i = j;
                        }

                        System.out.println("\n"+(Integer.parseInt(tmp)+10));
                        break;
                    }
                    else
                    System.out.print(word.charAt(i));
                }
            }
            dis.close();
        } catch (IOException e) {
            System.out.println("Error");
        }
    }

}
