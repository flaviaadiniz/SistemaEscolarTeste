public class Visitante extends Pessoa{

    public Visitante(String nome, int idade, String rg, Endereco endereco) {
        super(nome, idade, rg, endereco);
    }

    public static class Builder<T extends Builder> {
        protected String nome;
        protected int idade;
        protected String rg;
        protected Endereco endereco;

        Builder() {}

        public T nome(String nome) {
            this.nome = nome;
            return (T) this;
        }

        public T idade(int idade) {
            this.idade = idade;
            return (T) this;
        }

        public T rg(String rg) {
            this.rg = rg;
            return (T) this;
        }

        public T endereco(Endereco endereco) {
            this.endereco = endereco;
            return (T) this;
        }

        public Visitante build() {
            return new Visitante(nome, idade, rg, endereco);
        }
    }


    @Override
    public String toString() {
        return "\nVISITANTE\n" + super.toString();
    }
}
