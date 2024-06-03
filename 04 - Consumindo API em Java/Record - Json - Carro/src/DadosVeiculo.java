public class DadosVeiculo {
    private String modelo;
    private String cor;
    private String tipoCombustivel;


    public DadosVeiculo(Carro carro) {
        this.modelo = carro.modelo();
        this.cor = carro.cor();
        this.tipoCombustivel = carro.tipoCombustivel();
    }

    @Override
    public String toString() {
        return "Modelo: " + modelo + " - Cor: " + cor + " - Tipo: " + tipoCombustivel;
    }
}
