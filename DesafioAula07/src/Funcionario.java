public class Funcionario extends PessoaFisica {
    private Double salarioBruto;
    private Double salarioLiquido;
    private Double dissidioDe;

    public Funcionario(Integer id, String nome, String endereco, String telefone, String cpf, String rg, Double salarioBruto, Double salarioLiquido, String sexo, Double dissidioDe) {
        super(id, nome, endereco, telefone, cpf, rg, sexo);
        this.salarioBruto = salarioBruto;
        this.salarioLiquido = salarioLiquido;
        this.dissidioDe = dissidioDe;
    }

    public double getDissidioDe() {
        return dissidioDe;
    }

    public void setDissidioDe(double dissidioDe) {
        this.dissidioDe = dissidioDe;
    }

    public Double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(Double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public Double getSalarioLiquido() {
        return salarioLiquido;
    }

    public void setSalarioLiquido(Double salarioLiquido) {
        this.salarioLiquido = salarioLiquido;
    }

    public Double dissidioSalario() {
        return (salarioBruto * getDissidioDe()) + salarioBruto;
    }
}