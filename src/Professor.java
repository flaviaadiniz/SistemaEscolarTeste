import java.util.List;

public class Professor extends Pessoa implements Cadastravel {

    private String email;
    private Materia materia;

    public Professor(String nome, int idade, String rg, Endereco endereco, String email, Materia materia) {
        super(nome, idade, rg, endereco);
        this.email = email;
        this.materia = materia;
    }

    private Professor(String email, Materia materia) {
        super(builder().nome, builder().idade, builder().rg, builder().endereco);
    }

    public static Builder<? extends Builder> builder() {
        return new Builder<>();
    }

    public static class Builder<T extends Builder<T>> extends Pessoa.Builder<T> {
        protected String email;
        protected Materia materia;

        Builder() {}

        public T email(String email) {
            this.email = email;
            return (T) this;
        }

        public T materia(Materia materia) {
            this.materia = materia;
            return (T) this;
        }

        @Override
        public Professor build() {
            return new Professor(nome, idade, rg, endereco, email, materia);
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }


    @Override
    public String toString() {
        return "\nPROFESSOR\n" + super.toString() +
                "\n- E-mail: " + email +
                "\n- Matéria: " + materia;
    }
}
