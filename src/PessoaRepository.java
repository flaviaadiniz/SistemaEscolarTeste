import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PessoaRepository {
    private static List<Cadastravel> pessoasCadastradas = new ArrayList<>();

    public void cadastra(Cadastravel pessoa){

        if(Objects.nonNull(pessoa)){
            pessoasCadastradas.add(pessoa);
        }else{
            System.out.println("Não é possível realizar cadastro se o valor passado for nulo");
        }
    }

    public void mostrar(){
        System.out.println("__________________________________________");
        System.out.println("|            Pessoas cadastradas         |");
        System.out.println("|________________________________________|");
        for (Cadastravel pessoa: pessoasCadastradas) {
            System.out.println(pessoa);
        }

        if (pessoasCadastradas.isEmpty()){
            System.out.println("__________________________________________");
            System.out.println("|       Nenhuma pessoa foi cadastrado    |");
            System.out.println("|________________________________________|");
        }
    }

    public void limpaCadastro(){
        System.out.println("__________________________________________");
        System.out.println("|           Limpando cadastro(s)         |");
        System.out.println("__________________________________________");

        this.pessoasCadastradas.clear();
    }

}
