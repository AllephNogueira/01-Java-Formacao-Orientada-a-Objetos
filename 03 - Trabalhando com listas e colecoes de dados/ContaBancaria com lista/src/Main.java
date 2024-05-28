import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria(394, 30000);
        ContaBancaria conta2 = new ContaBancaria(9090, 5000);
        ContaBancaria conta3 = new ContaBancaria(382, 3556);
        ContaBancaria conta4 = new ContaBancaria(446, 6500);
        ContaBancaria conta5 = new ContaBancaria(213, 7500);

        ArrayList<ContaBancaria> listaDeContas = new ArrayList<>();
        listaDeContas.add(conta1);
        listaDeContas.add(conta2);
        listaDeContas.add(conta3);
        listaDeContas.add(conta4);
        listaDeContas.add(conta5);

        System.out.println("Lista de contas:");

        double maiorSaldo = 0;
        for(ContaBancaria listaConta: listaDeContas){
            System.out.println("Numero da conta: " + listaConta.getNumeroConta() + " Saldo: " + listaConta.getSaldo());
            if(listaConta.getSaldo() > maiorSaldo){
                maiorSaldo = listaConta.getSaldo();
            }
        }

        System.out.println("Usuario com maior saldo bancario: " + maiorSaldo);

    }
}