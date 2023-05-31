import java.util.Scanner;

public class Main {

    public static int add(int a, int b) {
        return a + b;
    }


    public static String add2(int a, int b) {
        return "Summe: " + (a + b);

    }

    public static int factorial(int n) {
        for (int i = n - 1; i > 0; i--) {
            n *= i;
        }
        return n;
    }

    public static int factorialWhile(int n) {
        int i = n - 1;
        while (i > 0) {
            n *= i;
            i--;
        }
        return n;
    }

    public static int factorialRecursion(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorialRecursion(n - 1);
    }

    public static boolean isOneInputBiggerThan100(int a, int b) {
        return a > 100 || b > 100;
    }

    // comment for git change

    public static void main(String[] args) {
        int sum = add(1, 2);
        System.out.println(sum);
        String sum2 = add2(1, 2);
        System.out.println(sum2);
        System.out.println("faculty: " + factorial(5));
        System.out.println("faculty with while: " + factorialWhile(5));
        System.out.println("faculty with recursion: " + factorialRecursion(5));

        // Scanner Aufgabe
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie eine Zahl ein und drücken Sie ENTER:");
        int input1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Geben Sie eine weitere Zahl ein und drücken Sie ENTER:");
        int input2 = Integer.parseInt(scanner.nextLine());
        System.out.println("Summe: " + add(input1, input2));
        System.out.println("Ist einer der beiden Werte größer als 100? -> " + isOneInputBiggerThan100(input1, input2));
    }
}
