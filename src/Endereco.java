public class Endereco {

    private String rua;
    private String bairro;
    private int numero;
    private String complemento;
    private String cep;
    private Estado estado;
    private String cidade;

    private Endereco(String rua, String bairro, int numero, String complemento, String cep, Estado estado, String cidade) {
        this.rua = rua;
        this.bairro = bairro;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
        this.estado = estado;
        this.cidade = cidade;
    }

    public static class EnderecoBuilder {
        private String rua;
        private String bairro;
        private int numero;
        private String complemento;
        private String cep;
        private Estado estado;
        private String cidade;

        public EnderecoBuilder() {
        }

        public EnderecoBuilder rua(String rua) {
            this.rua = rua;
            return this;
        }

        public EnderecoBuilder bairro(String bairro) {
            this.bairro = bairro;
            return this;
        }

        public EnderecoBuilder numero(int numero) {
            this.numero = numero;
            return this;
        }

        public EnderecoBuilder complemento(String complemento) {
            this.complemento = complemento;
            return this;
        }

        public EnderecoBuilder cep(String cep) {
            this.cep = cep;
            return this;
        }

        public EnderecoBuilder estado(Estado estado) {
            this.estado = estado;
            return this;
        }

        public EnderecoBuilder cidade(String cidade) {
            this.cidade = cidade;
            return this;
        }

        public Endereco criarEndereco() {
            return new Endereco(rua, bairro, numero, complemento, cep, estado, cidade);
        }

    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }



    @Override
    public String toString() {
        return "Endereco{" +
                "rua='" + rua + '\'' +
                ", bairro='" + bairro + '\'' +
                ", numero=" + numero +
                ", complemento='" + complemento + '\'' +
                ", cep='" + cep + '\'' +
                ", estado=" + estado +
                ", cidade='" + cidade + '\'' +
                '}';
    }
}
