package entities;

public class PessoaFisica extends Pessoa {
    private Double gastosComSaude;

    public PessoaFisica() {
        super();
    }

    public PessoaFisica(String nome, Double rendaAnual, Double gastosComSaude) {
        super(nome, rendaAnual);
        this.gastosComSaude = gastosComSaude;
    }

    @Override
    public String toString(){
        return super.toString();
    }

    public Double getGastosComSaude() {
        return gastosComSaude;
    }

    public void setGastosComSaude(Double gastosComSaude) {
        this.gastosComSaude = gastosComSaude;
    }

    @Override
    public void calculoImposto() {
        if (rendaAnual < 20000.0){
            this.impostoAPagar = (this.rendaAnual * 0.15) - (this.gastosComSaude * 0.5);
        } else {
            this.impostoAPagar = (this.rendaAnual * 0.25) - (this.gastosComSaude * 0.5);
        }
    }
}
