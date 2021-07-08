import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numero;
        int j = 0;
        do {
            System.out.println("Digite um número inteiro de no máximo 4 dígitos: ");
            numero = s.nextInt();
        } while (numero > 9999);

        for (int i = numero; i != 0; i /= 10) {
            j = j * 10 + i % 10;
        }
        System.out.println("O número inverso de " + numero + " é " + j);
    }
}

/*
Desenvolva um programa que solicita ao usuário um número inteiro de no máximo 4 dígitos. Inverta esse número.
*/