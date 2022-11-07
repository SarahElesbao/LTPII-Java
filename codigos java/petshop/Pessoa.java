package petshop;

public class Pessoa {
    private String nome;
    private int telefone;
    private Endereco moradia;
    private Animal bicho;

    public void info() {
        System.out.printf("-_-_-_-_informações do dono do animal:-_-_-_-_\n\n");
        System.out.printf("Nome: %s\n", nome);
        System.out.printf("Número: %d\n", telefone);
        System.out.printf("-_-_-_-_Endereco:-_-_-_-_\n\n");
        System.out.printf("Rua: %s\n", moradia.getRua());
        System.out.printf("Número: %d\n", moradia.getNumero());
        System.out.printf("Complemento: %s\n", moradia.getComplemento());
        System.out.printf("Bairro: %s\n", moradia.getBairro());
        System.out.printf("Cidade: %s\n", moradia.getCidade());
        System.out.printf("CEP: %s\n", moradia.getCep());
        System.out.printf("-_-_-_-_Animal:-_-_-_-_\n\n");
        System.out.printf("Nome: %s\n", bicho.getNome());
        System.out.printf("Raça: %s\n", bicho.getRaca());
        System.out.printf("Porte: %s\n", bicho.getPorte());
        System.out.printf("Bicho: %s\n", bicho.getTipo());
        System.out.printf("Peso: %f\n", bicho.getPeso());
        System.out.printf("Nascimento: %s\n", bicho.getDtnascimento());
        System.out.printf("Sexo: %c\n", bicho.getSexo());
    }

    public Pessoa(String nome, int telefone, Endereco moradia, Animal bicho) {
        this.nome = nome;
        this.telefone = telefone;
        this.moradia = moradia;
        this.bicho = bicho;
    }

    public String nome() {
        return this.nome;
    }

    public int telefone() {
        return this.telefone;
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
