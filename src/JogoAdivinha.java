import java.util.Scanner;
import java.util.Random;

public class JogoAdivinha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(50) + 1;
        int palpite;

        System.out.println("Tente adivinhar o número entre 1 e 50!");

        do {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();

            if (palpite == numeroSecreto) {
                System.out.println("Parabéns! Você acertou.");
            } else {
                System.out.println("Errado! Tente novamente.");
            }
        } while (palpite != numeroSecreto);
    }
}