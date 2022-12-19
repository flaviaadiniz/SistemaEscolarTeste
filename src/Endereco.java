public class Endereco {

    private String rua;
    private int numero;
    private String complemento;
    private String bairro;

    private String cep;
    private Estado estado;
    private String cidade;

    private Endereco(String rua, int numero, String complemento, String bairro, String cep, Estado estado, String cidade) {
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
            return new Endereco(rua, numero, complemento, bairro, cep, estado, cidade);
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
        return "Rua: " + rua +
                " | Bairro: " + bairro +
                " | Número: " + numero +
                " | Complemento: " + complemento +
                " | CEP: " + cep +
                " | Estado: " + estado +
                " | Cidade: " + cidade;
    }
}
