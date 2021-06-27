import javax.swing.*;

public class Exercicio06 {
    public static void main(String[] args) {
        Double peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o peso: "));
        Double altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a altura: "));

        Double IMC = peso / (altura * altura);

        JOptionPane.showMessageDialog(null, IMC);
    }
}
//Desenvolva um programa que calcule o IMC com telas gráficas usando JOptionPane.