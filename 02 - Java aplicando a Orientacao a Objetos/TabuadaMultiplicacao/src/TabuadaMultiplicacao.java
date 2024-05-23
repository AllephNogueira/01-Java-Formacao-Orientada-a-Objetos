public class TabuadaMultiplicacao implements Tabuada {


    @Override
    public void mostrarTabuada(int numero) {

        System.out.println("A tabuada de " + numero + " é:");
            for(int contador = 1; contador <= 10; contador++) {
                System.out.println(contador * numero);
            }
    }
}
