public class ContaCorrente extends ContaBancaria{
    private int descontoTarifa = 10;


    public int getDescontoTarifa() {
        return descontoTarifa;
    }

    public int extratoBancario(){
        return getSaldo() - descontoTarifa;
    }

    public int valorSaque(int valor) {
        return getSaldo() - valor;
    }

    public void informacaoTarifaMensal(){
        System.out.println("\nSua conta corrente conta com uma tarifa de 10R$ mensais\nDescontado todo dia 25 do mes.");

    }

    public void transferenciaNegada (){
        System.out.println("Você esta tentando transferir um valor maior que o permitido, o saldo da sua conta é: " + getSaldo());
    }


}
