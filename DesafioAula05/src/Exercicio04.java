import javax.swing.*;

public class Exercicio04 {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Qual o seu nome? ");
        String dia = JOptionPane.showInputDialog("Qual é o dia da semana? ");

        String msg = "Tenha uma boa " + dia + ", " + nome + "!";

        JOptionPane.showMessageDialog(null, msg);
    }
}
// Faça um programa que receba entrada de dados  e informe ao usuário através de uma caixa de
// diálogo qual foi o dados passados.