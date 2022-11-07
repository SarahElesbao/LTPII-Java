package petshop;


public class Animal {
    private String nome;
    private String raca;
    private String porte;
    private String tipo;
    private float peso;
    private String dtnascimento;
    private char sexo;
    
    public Animal(String nome, String raca, String porte, String tipo, float peso, String dtnascimento, char sexo){
        this.nome = nome;
        this.raca = raca;
        this.porte = porte;
        this.porte = porte;
        this.tipo = tipo;
        this.peso = peso;
        this.dtnascimento = dtnascimento;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getDtnascimento() {
        return dtnascimento;
    }

    public void setDtnascimento(String dtnascimento) {
        this.dtnascimento = dtnascimento;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

}
