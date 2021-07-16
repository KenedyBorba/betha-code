public class PessoaJuridica extends Pessoa {
    private String cnpj;
    private String inscricaoEstatual;
    private String cnae;

    public PessoaJuridica(Integer id, String nome, String endereco, String telefone, String cnpj, String inscricaoEstatual, String cnae) {
        super(id, nome, endereco, telefone);
        this.cnpj = cnpj;
        this.inscricaoEstatual = inscricaoEstatual;
        this.cnae = cnae;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstatual() {
        return inscricaoEstatual;
    }

    public void setInscricaoEstatual(String inscricaoEstatual) {
        this.inscricaoEstatual = inscricaoEstatual;
    }

    public String getCnae() {
        return cnae;
    }

    public void setCnae(String cnae) {
        this.cnae = cnae;
    }
}