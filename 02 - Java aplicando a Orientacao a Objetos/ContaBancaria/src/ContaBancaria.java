public class ContaBancaria {

    private int numeroConta;
    private double saldoConta;
    public String titular;

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void exibirConta() {
        System.out.println("Conta: " + numeroConta);
        System.out.println("Saldo: " + saldoConta);
        System.out.println("Titular: " + titular);
    }
}
