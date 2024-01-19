package entities;

public class PessoaJuridica extends Pessoa {
    private Integer nDeFuncionarios;

    public PessoaJuridica() {
        super();
    }

    public PessoaJuridica(String nome, Double rendaAnual, Integer nDeFuncionarios) {
        super(nome, rendaAnual);
        this.nDeFuncionarios = nDeFuncionarios;
    }

    @Override
    public String toString(){
        return super.toString();
    }

    public Integer getnDeFuncionarios() {
        return nDeFuncionarios;
    }

    public void setnDeFuncionarios(Integer nDeFuncionarios) {
        this.nDeFuncionarios = nDeFuncionarios;
    }

    @Override
    public void calculoImposto() {
        if(this.nDeFuncionarios > 10){
            this.impostoAPagar = this.rendaAnual * 0.14;
        }
        else {
            this.impostoAPagar = this.rendaAnual * 0.16;
        }
    }
}
