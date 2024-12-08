import java.util.Scanner;

public class InverterNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        String invertido = new StringBuilder(String.valueOf(numero)).reverse().toString();

        System.out.println("Número invertido: " + invertido);
    }
}