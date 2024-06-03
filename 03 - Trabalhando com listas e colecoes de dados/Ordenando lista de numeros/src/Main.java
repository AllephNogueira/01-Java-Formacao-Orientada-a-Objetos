import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> minhaLista = new ArrayList<>();
        minhaLista.add(99);
        minhaLista.add(1);
        minhaLista.add(2);
        minhaLista.add(3);
        minhaLista.add(45);
        minhaLista.add(10);
        minhaLista.add(4);
        minhaLista.add(27);
        minhaLista.add(20);
        minhaLista.add(15);
        minhaLista.add(7);
        minhaLista.add(38);

        System.out.println("Total de numeros: " + minhaLista.size());
        System.out.println("Minha lista desordenada: " + minhaLista);

        // ordenando a lista
        Collections.sort(minhaLista);
        System.out.println("\nMinha lista ordenada: " + minhaLista);
    }
}