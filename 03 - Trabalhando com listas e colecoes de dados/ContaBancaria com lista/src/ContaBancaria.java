public class ContaBancaria {
    private int numeroConta;
    private int saldo;

    public ContaBancaria(int numeroConta, int saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public int getSaldo() {
        return saldo;
    }
}
