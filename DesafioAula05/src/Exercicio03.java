public class Exercicio03 {
    public static void main(String[] args) {
        int[] array = {5, 10, 2, 5, 6, 9, 8, 7, 4, 1};

        if (array.length == 10) {
            for (int i = array.length - 1; i >= 0; i--) {
                System.out.print(" " + array[i]);
            }
        } else {
            System.out.println("Só é aceito 10 elementos dentro do array");
        }
    }
}
// Faça um programa que inverta as posições de um array com 10 elementos.