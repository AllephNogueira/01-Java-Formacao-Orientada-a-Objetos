//Crie uma classe Carro com métodos para representar um modelo específico ao longo de três anos. Implemente métodos para definir o nome do modelo, os preços médios para cada ano, e calcular e exibir o menor e o maior preço. Adicione uma subclasse ModeloCarro para criar instâncias específicas, utilizando-a na classe principal para definir preços e mostrar informações.

public class Main {
    public static void main(String[] args) {
        Carro c4 = new Carro();

        c4.setModelo("C4");
        c4.setAnoFabricacao(2016);
        c4.setPrecoMedio(53000);

        c4.dadosVeiculo();
        c4.menorValor();

        System.out.println("\n\n\n");

        ModeloCarro Fiesta = new ModeloCarro();
        Fiesta.setModelo("Fiesta");
        Fiesta.setAnoFabricacao(2012);
        Fiesta.setPrecoMedio(32000);


        Fiesta.dadosVeiculo();
        Fiesta.menorValor();
    }
}