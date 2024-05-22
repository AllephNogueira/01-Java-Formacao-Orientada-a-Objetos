package br.com.alleph.verificar;

public class GerarProximo extends VerificarNumero {

    public int GerarProximoPrimo() {
        int novoNumeroPrimo = getNumero(); // Aqui assume-se que VerificarNumero tem um método getNumero() para retornar o número atual
        return novoNumeroPrimo + 2;
    }

    public int GerarProximoPar() {
        int novoNumeroPrimo = getNumero(); // Aqui assume-se que VerificarNumero tem um método getNumero() para retornar o número atual
        return novoNumeroPrimo + 2;
    }
}
