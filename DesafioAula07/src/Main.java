public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario(434, "Claudio", "Rua Presidente", "(51)99618-4375", "036.995.268.25", "49846559", 1200.5, 1000.0, "M", 0.9);
        Cliente cliente = new Cliente(525, "Carla", "Rua Marechal Deodoro", "(48)99864-2225", "032.569.665-20", "9848484984", 20000.0, 12000.0, "F");
        Fornecedor fornecedor = new Fornecedor(946, "Betha", "Rua Paranaue", "(48) 99668-8855", "56456345645", "121598652", "String cnae", "455.64596", "Empresa");

        System.out.println("CNPJ: " + fornecedor.getDocumentoPrincipal());
        System.out.println("CPF: " + funcionario.getDocumentoPrincipal());

        System.out.println("Diminuir o limite: " + cliente.diminuirLimite());
        System.out.println("Aumentando o limite: " + cliente.aumentarLimite());
        System.out.println("Salario com dissidio: " + funcionario.dissidioSalario());

        System.out.println(cliente);
    }
}
