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
                .build();


        Professor professor1 = new Professor.Builder<>()
                .nome("Flávia Amaral Diniz")
                .idade(38)
                .rg("1112223344")
                .endereco(endereco1)
                .email("flaviaadiniz@gmail.com")
                .materia(Materia.INGLES)
                .build();

        System.out.println(professor1);


        Aluno aluno1 = new Aluno.Builder<>()
                .nome("Sofia Argimon")
                .idade(13)
                .rg("2223334455")
                .endereco(new Endereco.EnderecoBuilder().build())
                .classe(Classe.A3)
                .build();

        System.out.println(aluno1);


        Visitante visitante1 = new Visitante.Builder<>()
                .nome("Maria da Silva")
                .idade(50)
                .rg("4445556677")
                .endereco(new Endereco.EnderecoBuilder().build())
                .build();

        System.out.println(visitante1);

    }
}
