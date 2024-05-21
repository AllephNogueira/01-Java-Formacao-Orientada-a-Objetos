public class Main {
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria();

        c1.setNumeroConta(394); // Inserindo dados
        c1.setSaldoConta(210);
        c1.setTitular("Alleph Nogueira de Oliveira");


        c1.exibirConta(); // Exibindo dados

    }
}