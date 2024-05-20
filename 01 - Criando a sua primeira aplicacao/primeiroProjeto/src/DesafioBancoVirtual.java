import java.util.Scanner;

public class DesafioBancoVirtual {
    public static void main(String[] args) {

        String nome = "Alleph Nogueira";
        String tipoDeConta = "Corrente";
        double saldoInicial = 2500.00;
        System.out.println("****************************************");
        System.out.println("\t\t\t\tAlle Banks");
        System.out.println("\nNome:                " + nome);
        System.out.println("Tipo de conta:       " + tipoDeConta);
        System.out.println("Saldo inicial        R$ " + saldoInicial );
        System.out.println("\n****************************************\n");


        Scanner leitura = new Scanner(System.in);
        int opcao = 0;


        String menu = """
                ****************************************
                
                Digite sua opcão:
                1 - Consultar saldo
                2 - Receber valor
                3 - Transferir valor
                4 - Sair \n
                """;


        while (opcao != 4){
            System.out.println(menu);
            System.out.println("Digite a opcao desejada: ");
            opcao = leitura.nextInt();
            System.out.println();


            switch (opcao){
                case 1:
                    System.out.println("Seu saldo é: " + saldoInicial + "\n");
                    break;
                case 2:
                    System.out.println("Digite o valor que você quer receber: ");
                    String valorString = leitura.nextLine();
                    while (valorString.trim().isEmpty()) {
                        System.out.println("Por favor, insira um valor válido: ");
                        valorString = leitura.nextLine();
                    }
                    double valorRecebido = Double.parseDouble(valorString);
                    saldoInicial += valorRecebido;
                    System.out.println("Seu saldo é: " + saldoInicial  + "\n");
                    break;
                case 3:
                    System.out.println("Digite a chave de quem vai receber: ");
                    leitura.nextLine();
                    String chavePix = leitura.nextLine();
                    System.out.println("Digite o valor: ");
                    double valorTransferencia = Double.parseDouble(leitura.nextLine()); // Entrar string e transferir para decimal


                    if (saldoInicial >= valorTransferencia) {
                        if (valorTransferencia >= 1) {
                            System.out.println("Transferencia realizada com sucesso para: " + chavePix + " de " + valorTransferencia);
                            saldoInicial -= valorTransferencia;
                            System.out.println("Seu novo saldo é: " + saldoInicial + "\n");
                        }else {
                            System.out.println("Valor da transferencia deve ser maior que R$ 1");
                        }
                    }else {
                        System.out.println("Seu saldo disponivel é " + saldoInicial);
                        System.out.println("Você não pode realizar uma transferencia maior que seu saldo!\n");
                    }

                    break;
                default:
                    System.out.println("Obrigado, espero te ver novamente!\n");


            }
        }
    }
}
