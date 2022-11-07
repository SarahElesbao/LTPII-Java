package petshop;

public class Fisica extends Pessoa {
    public String CPF;

    public Fisica(String cPF, String nome, int telefone, Endereco moradia, Animal bicho) {
        super(nome, telefone, moradia, bicho);
        this.CPF = cPF;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String cPF) {
        CPF = cPF;
    }

    public void info(){
        super.info();
        System.out.printf("CPF: %s", CPF);
    }

}
