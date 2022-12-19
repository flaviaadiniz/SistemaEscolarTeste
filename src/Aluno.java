public class Aluno extends Pessoa implements Cadastravel{

    private Classe classe;

    public Aluno(String nome, int idade, String rg, Endereco endereco, Classe classe) {
        super(nome, idade, rg, endereco);
        this.classe = classe;
    }

    //outro construtor aqui
    private Aluno(Classe classe) {
        super(builder().nome, builder().idade, builder().rg, builder().endereco);
    }


    public static Builder<? extends Builder> builder() {
        return new Builder<>();
    }

    public static class Builder<T extends Builder<T>> extends Pessoa.Builder<T> {

        protected Classe classe;

        Builder() {}

        public T classe(Classe classe) {
            this.classe = classe;
            return (T) this;
        }

        @Override
        public Aluno build() {
            return new Aluno(nome, idade, rg, endereco, classe);
        }

    }



    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }


    @Override
    public String toString() {
        return "\nALUNO \n" + super.toString() +
                "\n- Classe: " + classe;
    }
}
