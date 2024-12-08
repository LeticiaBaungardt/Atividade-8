import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite quantos números da sequência deseja ver: ");
        int n = scanner.nextInt();

        int a = 0, b = 1;
        System.out.print("Sequência de Fibonacci: " + a);

        for (int i = 1; i < n; i++) {
            System.out.print(", " + b);
            int temp = b;
            b = a + b;
            a = temp;
        }
        System.out.println();
    }
}