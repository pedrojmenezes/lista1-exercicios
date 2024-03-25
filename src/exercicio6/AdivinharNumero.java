package exercicio6;

import java.util.Random;
import java.util.Scanner;

public class AdivinharNumero {

    int numero;
    int palpite;
    Scanner scanner = new Scanner(System.in);

    public void sortear() {
        numero = new Random().nextInt(100);
    }

    public void adivinhar() {
        while (palpite != numero) {
            System.out.println("Adivinhe um número entre 0 e 99: ");
            palpite = scanner.nextInt();

            if (palpite == numero) {
                System.out.println("Parabéns, você acertou o número!");
            }
            else if (palpite > numero) {
                System.out.println("Seu palpite é maior que o número selecionado, tente novamente.");
            }
            else if (palpite < numero) {
                System.out.println("Seu palpite é menor que o número selecionado, tente novamente.");
            }
        }
        scanner.close();
    }
}