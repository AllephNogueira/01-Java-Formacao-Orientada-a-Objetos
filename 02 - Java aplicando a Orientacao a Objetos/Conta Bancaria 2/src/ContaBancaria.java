public class ContaBancaria {


    private String nome;
    private int saldo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo += saldo;
    }

    public void boasVindas(){
        System.out.println("Seja bem vindo: " + getNome());
        System.out.println("Seu saldo é: " + getSaldo());
    }

}
