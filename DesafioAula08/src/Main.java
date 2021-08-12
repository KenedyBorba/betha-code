public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = FuncionarioBuilder.criaFuncionario("ANALISTA", 1, "Kenedy", "036.665.488-48", 3000.00);

        Folha folhaAgosto = new Folha(1, funcionario, "20/08/2021");

        folhaAgosto.calcular();

        System.out.println("Salario liquido: " + folhaAgosto.getSalarioLiquido());
    }
}
