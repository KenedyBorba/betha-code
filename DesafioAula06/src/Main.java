import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Pessoa p;
        p = new Pessoa();

        System.out.println("Qual seu nome: ");
        p.nome = s.next();

        System.out.println("Qual seu CPF: ");
        p.cpf = s.next();

        System.out.println("Qual seu RG? ");
        p.rg = s.next();

        System.out.println("Qual sua altura? ");
        p.altura = s.nextDouble();

        System.out.println("Qual seu peso? ");
        p.peso = s.nextDouble();

        System.out.println("Qual sua data de nascimento: ");
        p.dataNascimento = s.next();

        System.out.println(" \n- Informe sua filiação -");
        System.out.println("Nome do seu pai: ");
        p.filiacao[0] = s.next();
        System.out.println("Nome da sua mãe: ");
        p.filiacao[1] = s.next();

        System.out.println("Nome: " + p.nome);
        System.out.println("CPF: " + p.cpf);
        System.out.println("RG: " + p.rg);
        System.out.println("Data de nascimento: " + p.dataNascimento);
        System.out.println("Pai: " + p.filiacao[0]);
        System.out.println("Mãe: " + p.filiacao[1]);
        System.out.println("Altura: " + p.altura);
        System.out.println("Peso: " + p.peso);
        System.out.printf("IMC: %.2f", p.getIMC());
    }
}
/*
Criar uma classe de pessoa, com os atributos nome, cpf, rg, altura, peso, data nascimento, filiação.
getIMC()
*/