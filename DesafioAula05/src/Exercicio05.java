import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner s = new Scanner(System.in);

        System.out.print("Posição invertida do array: ");
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite 10 valores de um array: ");
            array[i] = s.nextInt();
        }

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(" " + array[i]);
        }
    }
}
// Desenvolva um programa que receba 10 parâmetros, inverta todas as posições e imprima o resultado.