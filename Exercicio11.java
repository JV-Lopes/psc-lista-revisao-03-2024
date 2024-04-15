package Lr3;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroAdivinhar = 42;
        int tentativas = 0;
        
        System.out.println("Bem-vindo ao jogo da adivinhação! Tente adivinhar o número (de 1 a 100).");
        
        while (true) {
            System.out.println("Digite o seu palpite:");
            int palpite = scanner.nextInt();
            tentativas++;
            
            if (palpite == numeroAdivinhar) {
                System.out.println("Parabéns! Você acertou o número em " + tentativas + " tentativas.");
                break;
            } else if (palpite < numeroAdivinhar) {
                System.out.println("O número a ser adivinhado é maior. Tente novamente.");
            } else {
                System.out.println("O número a ser adivinhado é menor. Tente novamente.");
            }
        }
        
        scanner.close();
    }
}
