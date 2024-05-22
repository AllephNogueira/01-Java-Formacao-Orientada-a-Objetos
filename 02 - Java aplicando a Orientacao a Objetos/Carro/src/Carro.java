//Crie uma classe Carro com métodos para representar um modelo específico ao longo de três anos
//Implemente métodos para definir o nome do modelo, os preços médios para cada ano, e calcular e exibir o menor e o maior preço. Adicione uma subclasse ModeloCarro para criar instâncias específicas, utilizando-a na classe principal para definir preços e mostrar informações.

public class Carro {

    private String modelo;
    private int anoFabricacao;
    private int precoMedio;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public int getPrecoMedio() {
        return precoMedio;
    }

    public void setPrecoMedio(int precoMedio) {
        this.precoMedio = precoMedio;
    }

    public void menorValor() {
        if (this.precoMedio < 40000){
            System.out.println("Esse carro esta a baixo de 40mil");
        }
    }
    public void dadosVeiculo(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano lancamento: " + anoFabricacao);
        System.out.println("Preco medio: " + precoMedio);
    }
}
