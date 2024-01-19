package entities;

public abstract class Pessoa {

    private String nome;
    protected Double rendaAnual;
    protected Double impostoAPagar;

    public Pessoa(){}

    public Pessoa(String nome, Double rendaAnual) {
        this.nome = nome;
        this.rendaAnual = rendaAnual;
    }

    @Override
    public String toString() {
        return this.nome + ": R$" + String.format("%.2f",this.impostoAPagar);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getRendaAnual() {
        return rendaAnual;
    }

    public void setRendaAnual(Double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }

    public Double getImpostoAPagar() {
        return impostoAPagar;
    }

    public abstract void calculoImposto();
}
