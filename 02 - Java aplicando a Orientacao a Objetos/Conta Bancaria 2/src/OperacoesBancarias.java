

public class OperacoesBancarias extends ContaCorrente{


    public void opcaoBancaria () {
        System.out.println("1 - SAQUE");
        System.out.println("2 - DEPOSITAR");
        System.out.println("3 - TRANSFERIR");
        System.out.println("4 - EXTRATO");
        System.out.println("5 - TARIFA BANCARIA");
    }

    public void opcao(int opcao){

        switch (opcao){
            case 1:
                System.out.println("\n\n1 - SAQUE");
                int valorSaque = 310;
                System.out.println("\nDigite o valor que você deseja sacar \nVocê digitou: " + valorSaque);
                if(valorSaque > getSaldo()){
                    System.out.println("Você digitou um valor maior que o disponivel");
                    System.out.println("Saldo disponivel " + getSaldo());
                    return;
                }
                System.out.println("Seu novo saldo é: " + valorSaque(valorSaque));
                break;
            case 2:
                System.out.println("\n\n2 - DEPOSITAR");
                int valorDeposito = 300;
                System.out.println("\nDigite o valor que você deseja depositar: \nVoce digitou: " + valorDeposito);
                setSaldo(valorDeposito);
                System.out.println("Novo saldo disponivel: "  + getSaldo());
                break;
            case 3:
                System.out.println("\n\n3 - TRANSFERIR");
                System.out.println("\nDigite o valor que você deseja transferir: ");
                int valorTransferencia = 320;
                System.out.println("Valor digitado foi: " + valorTransferencia);
                if(valorTransferencia > getSaldo()){
                    transferenciaNegada();
                    return;
                }
                setSaldo(-valorTransferencia);
                System.out.println("Novo saldo disponivel: "  + getSaldo());
                break;
            case 4:
                System.out.println("\n\n");
                System.out.println("| - DESCONTO TARIFA: " + getDescontoTarifa() + " |");
                System.out.println("| + NOVO SALDO: " + extratoBancario() + " |");
                break;
            case 5:
                informacaoTarifaMensal();
                break;
            default:
                System.out.println("\n\nOpção não encontrada!");
                break;
        }
    }
}
