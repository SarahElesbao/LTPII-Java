package petshop;

public class App {

    public static void main(String[] args) {

        Endereco endereco = new Endereco("rua são paulão", 325, "fundos", "pavuna", "rio de janeiro", 34561233);
        // endereco.rua = "Rua da Sarah";
        // endereco.numero = 443;
        // endereco.complemento = "fundos";
        // endereco.bairro = "Pavuna";
        // endereco.cidade = "Rio de Janeiro";
        // endereco.cep = 21534289;

        Animal animal = new Animal("mirabel", "gato", "pequeno", "siamês", 5, "16/02/2020", 'm');
        // animal.nome = "mirabel";
        // animal.raca = "gato";
        // animal.porte = "pequeno";
        // animal.tipo = "siamês";
        // animal.peso = 4;
        // dtnascimento = 01/02/2020;
        // animal.sexo = 'm';

        //Pessoa pessoa = new Pessoa("Sarah Elesbão", 40028922, endereco, animal);
        // pessoa.nome = "Sarah Elesbão";
        // pessoa.telefone = 40028922;
        // pessoa.cpf = "173.482.734-96";
        // pessoa.moradia = endereco;
        // pessoa.bicho = animal;

        // pessoa.moradia = endereco;
        Juridica juridica = new Juridica("59.927.884/0001-77", "Sarah Elesbão", 40028922, endereco, animal);

        Fisica fisica = new Fisica("437.715.400-11", "Sarah Elesbão", 40028922, endereco, animal);

        //pessoa.info();
        fisica.info();
        juridica.info();
    }

}
