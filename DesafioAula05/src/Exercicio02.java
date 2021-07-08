public class Exercicio02 {
    public static void main(String[] args) {
        int[] array = {10, 20, 30};
        int soma = 0;
        int media = 0;

        for (int i = 0; i < array.length; i++) {
            soma += array[i];
            media = soma / array.length;
        }
        System.out.println("Média: " + media);
    }
}
//Escreva um programa que some todos os valores contidos em um array de inteiros e calcule a média.