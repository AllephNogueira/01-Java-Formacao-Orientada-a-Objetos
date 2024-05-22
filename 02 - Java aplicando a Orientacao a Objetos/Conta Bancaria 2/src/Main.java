//Crie uma classe ContaBancaria com métodos para realizar operações bancárias como depositar(), sacar() e consultarSaldo(). Em seguida, crie uma subclasse ContaCorrente que herda da classe ContaBancaria. Adicione um método específico para a subclasse, como cobrarTarifaMensal(), que desconta uma tarifa mensal da conta corrente.

public class Main {
    public static void main(String[] args) {
        OperacoesBancarias alleph = new OperacoesBancarias();

        alleph.setNome("Alleph"); // Onde o usuario vai digitar o nome dele.
        alleph.setSaldo(300);
        alleph.boasVindas();



        // Agora vamos realizar as operações

        alleph.opcaoBancaria();
        alleph.opcao(3);
    }
}