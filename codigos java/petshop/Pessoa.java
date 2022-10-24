package petshop;

public class Pessoa {
    String nome;
    int telefone;
    String cpf;
    Endereco moradia;
    Animal bicho;

    public void info() {
        System.out.printf("-_-_-_-_informações do dono do animal:-_-_-_-_\n\n");
        System.out.printf("Nome: %s\n", nome);
        System.out.printf("Número: %d\n", telefone);
        System.out.printf("CPF: %s\n", cpf);
        System.out.printf("-_-_-_-_Endereco:-_-_-_-_\n\n");
        System.out.printf("Rua: %s\n", moradia.rua);
        System.out.printf("Número: %d\n", moradia.numero);
        System.out.printf("Complemento: %s\n", moradia.complemento);
        System.out.printf("Bairro: %s\n", moradia.bairro);
        System.out.printf("Cidade: %s\n", moradia.cidade);
        System.out.printf("CEP: %s\n", moradia.cep);
        System.out.printf("-_-_-_-_Animal:-_-_-_-_\n\n");
        System.out.printf("Nome: %s\n", bicho.nome);
        System.out.printf("Raça: %s\n", bicho.raca);
        System.out.printf("Porte: %s\n", bicho.porte);
        System.out.printf("Bicho: %s\n", bicho.tipo);
        System.out.printf("Peso: %f\n", bicho.peso);
        // System.out.printf("Nascimento: %s\n", bicho.dtnascimento);
        System.out.printf("Sexo: %c\n", bicho.sexo);

    }

    public String nome() {
        return this.nome;
    }

    public int telefone() {
        return this.telefone;
    }

    public String cpf() {
        return this.cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getMoradia() {
        return moradia;
    }

    public void setMoradia(Endereco moradia) {
        this.moradia = moradia;
    }

    public Animal getBicho() {
        return bicho;
    }

    public void setBicho(Animal bicho) {
        this.bicho = bicho;
    }

}
