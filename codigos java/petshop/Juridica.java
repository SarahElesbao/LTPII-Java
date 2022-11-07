package petshop;

public class Juridica extends Pessoa {
    public String CNPJ;

    public Juridica(String cNPJ, String nome, int telefone, Endereco moradia, Animal bicho) {
        super(nome, telefone, moradia, bicho);
        this.CNPJ = cNPJ;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String cNPJ) {
        CNPJ = cNPJ;
    }

    public void info(){
        super.info();
        System.out.printf("CNPJ: %s ", CNPJ);
    }

}
