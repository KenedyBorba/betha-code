import javax.swing.*;
import java.text.DecimalFormat;

public class Exercicio06 {
    public static void main(String[] args) {
        Double peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o peso: "));
        Double altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a altura: "));
        DecimalFormat decimal = new DecimalFormat("0.00");

        Double imc = peso / (altura * altura);

        if (imc < 17) {
            JOptionPane.showMessageDialog(null, "Muito abaixo do peso. " + "Seu IMC é " + decimal.format(imc));
        } else if (imc >= 17 && imc <= 18.4) {
            JOptionPane.showMessageDialog(null, "Abaixo do peso. " + "Seu IMC é " + decimal.format(imc));
        } else if (imc >= 18.5 && imc <= 24.9) {
            JOptionPane.showMessageDialog(null, "Peso normal. " + "Seu IMC é " + decimal.format(imc));
        } else if (imc >= 25 && imc <= 29.9) {
            JOptionPane.showMessageDialog(null, "Acima do peso. " + "Seu IMC é " + decimal.format(imc));
        } else if (imc >= 30 && imc <= 34.9) {
            JOptionPane.showMessageDialog(null, "Obesidade Grau I. " + "Seu IMC é " + decimal.format(imc));
        } else if (imc >= 35 && imc <= 40) {
            JOptionPane.showMessageDialog(null, "Obesidade Grau II. " + "Seu IMC é " + decimal.format(imc));
        } else if (imc > 40) {
            JOptionPane.showMessageDialog(null, "Obesidade Grau III. " + "Seu IMC é " + decimal.format(imc));
        }
    }
}
//Desenvolva um programa que calcule o IMC com telas gráficas usando JOptionPane.