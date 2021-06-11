import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int index;
        do {
            System.out.println("1.Switch...case\n2.y=f(x) (while)\n3.y=f(x) (do...while)\n4.Array\n5.Array (Random)\n6.Matrix\n7.Matrix (Random)\n8.Exit");
            index = scanner.nextInt();
            switch (index) {
                case 1:
                    Task1();
                    break;
                case 2:
                    Task2VersionOne();
                    break;
                case 3:
                    Task2VersionTwo();
                    break;
                case 4:
                    Task3();
                    break;
                case 5:
                    Task3Random();
                    break;
                case 6:
                    Task4();
                    break;
                case 7:
                    Task4Random();
                    break;
                case 8:
                    System.out.println("Bye.");
                    ;
                    break;
                default:
                    System.out.println("Bad index.");
                    break;
            }
        } while (index != 8);

    }


    public static void Task1() {
        int index;

        do {
            System.out.println("Введіть число від 1 до 10:");
            index = scanner.nextInt();
        } while (index > 10 || index < 1);
        switch (index) {
            case 1:
                System.out.println("Балацький Давид");
                break;
            case 2:
                System.out.println("Бодян Денис");
                break;
            case 3:
                System.out.println("Братко Богдан");
                break;
            case 4:
                System.out.println("Голуб Євгеній");
                break;
            case 5:
                System.out.println("Груба Анастасія");
                break;
            case 6:
                System.out.println("Жлоба Владислав");
                break;
            case 7:
                System.out.println("Іванюк Іван");
                break;
            case 8:
                System.out.println("Кочурка Олександр");
                break;
            case 9:
                System.out.println("Куранов Олесій");
            case 10:
                System.out.println("Курпа Євген");
                break;
            default:
                System.out.println("Error");
                break;
        }

    }

    public static void Task2VersionOne() {
        float a = -6f, dx = 0.75f;
        int b = 3;
        while (a <= b) {
            System.out.println("x = " + String.format("%.1f", a) + String.format("\tf(x) = %.3f", Math.pow(a, 4) - 12 * Math.exp(a)));
            a += dx;
        }
    }

    public static void Task2VersionTwo() {
        float a = -6f, dx = 0.75f;
        int b = 3;
        do {
            System.out.println("x = " + String.format("%.1f", a) + String.format("\tf(x) = %.3f", Math.pow(a, 4) - 12 * Math.exp(a)));
            a += dx;
        } while (a <= b);
    }

    public static void Task3() {
        int[] array;
        int n;
        System.out.println("Введіть розмір масиву:");
        n = scanner.nextInt();
        array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Введіть array[" + (i + 1) + "]: ");
            array[i] = scanner.nextInt();
        }
        Task3Min(array, n);
        Task3CalcToZero(array, n);
    }

    public static void Task3Random() {
        int[] array;
        int n;
        System.out.println("Введіть розмір масиву:");
        n = scanner.nextInt();
        System.out.println("Random array:");
        array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = (int) (Math.random() * (200 + 1)) - 100;
        }
        for (int i = 0; i < n; i++) {
            System.out.println("array[" + (i + 1) + "] : " + array[i]);
        }
        Task3Min(array, n);
        Task3CalcToZero(array, n);
    }

    public static void Task3Min(int[] array, int n) {
        int min = array[0];
        for (int i = 0; i < n; i++) {
            if (array[i] < array[min]) min = i;
        }
        System.out.println("Номер мінімального елемент масиву: " + (min + 1));
    }

    public static void Task3CalcToZero(int[] array, int n) {
        int dob = 1;
        Boolean flag = false;
        for (int i = 0; i < n; i++) {
            if (array[i] == 0) {
                flag = true;
                break;
            }
            dob *= array[i];
        }
        if (flag) {

            System.out.println("Добуток до першого нульового елемента: " + dob);

        } else System.out.println("Масив не підходить під ці умови.");
    }

    public static void Task4() {
        int[][] matrix;
        byte n, m;
        System.out.print("Введіть кількість     рядків матриці:");
        n = scanner.nextByte();
        System.out.print("Введіть кількість стовбців матриці:");
        m = scanner.nextByte();
        matrix = new int[n][m];
        int array[][] = new int[2][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Введіть matrix[" + i + "][" + j + "]:");
                matrix[i][j] = scanner.nextInt();
            }
        }
        int min, sum = 0;
        System.out.println("---------Before---------");
        for (int i = 0; i < n; i++) {
            min = matrix[i][0];
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
                if (min > matrix[i][j]) min = matrix[i][j];
            }
            sum += min;
            System.out.println();
        }
        System.out.println("Сума мінімальних елементів всіх рядків: " + sum);

    }

    public static void Task4Random() {
        int[][] matrix;
        byte n, m;
        System.out.print("Введіть кількість рядків матриці:");
        n = scanner.nextByte();
        System.out.print("Введіть кількість стовбців матриці:");
        m = scanner.nextByte();
        matrix = new int[n][m];
        System.out.println("Random matrix[n][m]");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = (int) (Math.random() * (200 + 1)) - 100;
            }
        }
        int min, sum = 0;
        System.out.println("---------Before---------");
        for (int i = 0; i < n; i++) {
            min = matrix[i][0];
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
                if (min > matrix[i][j]) min = matrix[i][j];
            }
            sum += min;
            System.out.println();
        }
        System.out.println("Сума мінімальних елементів всіх рядків: " + sum);
    }
}
