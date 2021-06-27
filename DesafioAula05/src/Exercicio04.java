import javax.swing.*;

public class Exercicio04 {
    public static void main(String[] args) {
        String entrada;
        entrada = JOptionPane.showInputDialog("Qual o seu nome? ");

        String msg = "Bom dia, " + entrada + "!";

        JOptionPane.showMessageDialog(null, msg);
    }
}
//Faça um programa que receba entrada de dados  e informe ao usuário através de uma caixa de
// diálogo qual foi o dados passados.