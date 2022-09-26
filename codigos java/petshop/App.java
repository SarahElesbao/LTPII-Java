package petshop;

public class App {

    public static void main(String[] args){
        
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Sarah Elesbão";
        pessoa.telefone = 40028922;
        pessoa.cpf = 1734827346;

        Endereco endereco = new Endereco();
        endereco.rua = "Rua da Sarah";
        endereco.numero = 443;
        endereco.complemento = "fundos";
        endereco.bairro = "Pavuna";
        endereco.cidade = "Rio de Janeiro";
        endereco.cep = 21534289;

        pessoa.moradia = endereco;

    }
    
}
