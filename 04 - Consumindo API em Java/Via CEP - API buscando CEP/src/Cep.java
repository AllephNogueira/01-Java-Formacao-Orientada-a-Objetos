public class Cep {

    private String rua;
    private String bairro;
    private String cidade;
    private String estado;

    public Cep(CepRecord meuRecord) {
        this.rua = meuRecord.logradouro();
        this.bairro = meuRecord.bairro();
        this.cidade = meuRecord.localidade();
        this.estado = meuRecord.uf();
    }

    @Override
    public String toString() {
        return "Rua: " + rua + " - Bairro: " + bairro + " - Cidade: " + cidade + " - Estado: " + estado;
    }
}
