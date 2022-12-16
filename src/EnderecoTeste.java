public class EnderecoTeste {

    public static void main(String[] args) {

        Endereco endereco1 = new Endereco.EnderecoBuilder()
                .rua("Paissandu")
                .numero(361)
                .complemento("casa")
                .cep("90660-360")
                .bairro("Partenon")
                .cidade("Porto Alegre")
                .estado(Estado.RS)
                .criarEndereco();

        System.out.println(endereco1);

    }

}
