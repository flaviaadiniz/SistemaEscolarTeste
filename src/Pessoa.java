public class Pessoa {

    private String nome;
    private int idade;
    private String rg;
    private Endereco endereco;

    public Pessoa(String nome, int idade, String rg, Endereco endereco) {
        this.nome = nome;
        this.idade = idade;
        this.rg = rg;
        this.endereco = endereco;
    }

    public static Builder builder() {
        return new Builder();
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

        public Pessoa build() {
            return new Pessoa(nome, idade, rg, endereco);
        }
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }



    @Override
    public String toString() {
        return  "- Nome: " + nome +
                "\n- Idade: " + idade +
                "\n- RG: " + rg +
                "\n- Endereço: " + endereco;
    }
}
