public class Pessoa {
    String nome;
    String cpf;
    String rg;
    Double altura;
    Double peso;
    String dataNascimento;
    String[] filiacao = new String[2];

    Double getIMC() {
        return peso / (altura * altura);
    }
}