package br.com.alleph.verificar;

public class VerificarNumero extends Numeros{

    private int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void Verificar(int numero){
        if(numero%2==0){
            setVerificacao("Numero par");
            this.numero = numero;
        }else {
            setVerificacao("Numero impar");
            this.numero = numero;
        }
    }
}
