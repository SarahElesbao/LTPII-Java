package petshop;

public class App {

    public static void main(String[] args){
        
        Endereco endereco = new Endereco();
        endereco.rua = "Rua da Sarah";
        endereco.numero = 443;
        endereco.complemento = "fundos";
        endereco.bairro = "Pavuna";
        endereco.cidade = "Rio de Janeiro";
        endereco.cep = 21534289;

        Animal animal = new Animal();
        animal.nome = "mirabel";
        animal.raca = "gato";
        animal.porte = "pequeno";
        animal.tipo = "siamês";
        animal.peso = 4;
        //dtnascimento = 01/02/2020;
        animal.sexo = 'm';

        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Sarah Elesbão";
        pessoa.telefone = 40028922;
        pessoa.cpf = "173.482.734-96";
        pessoa.moradia = endereco;
        pessoa.bicho = animal;

        pessoa.moradia = endereco; 

        pessoa.info();


    }
    
}
