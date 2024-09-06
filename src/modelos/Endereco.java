package modelos;

public class Endereco {
    private String cep;
    private String logradouro;
    private String bairro;
    private String localidade;
    private String cidade;
    private String regiao;
    private int ddd;

    public Endereco(String cep, String logradouro, String bairro, String localidade, String cidade, String regiao, int ddd) {
        this.cep = cep;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.localidade = localidade;
        this.cidade = cidade;
        this.regiao = regiao;
        this.ddd = ddd;
    }

    public String getCep() {
        return cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public String getCidade() {
        return cidade;
    }

    public String getRegiao() {
        return regiao;
    }

    public int getDdd() {
        return ddd;
    }

    @Override
    public String toString() {
        return String.format("""
                CEP: %s
                Logradouro: %s
                Bairro: %s
                Localidade: %s
                Cidade: %s
                Região: %s
                DDD: %d
                """, this.cep, this.logradouro, this.bairro, this.localidade, this.cidade, this.regiao, this.ddd);
    }
}
