import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Carro c4 = new Carro("C4", 2.0, 4, "Flex", 4);
        Carro fordKa = new Carro("Forda Ka", 1.5, 4, "Flex", 4);
        Carro newFiesta = new Carro("New Fiesta", 1.6, 4, "Flex", 4);
        Moto yamaha = new Moto("Yamaha", 1.2,2, "Gasolina", 2);
        Moto hondaBiz = new Moto("Honda Biz", 1.0,2, "Gasolina", 2);

        ArrayList<Veiculos> lista = new ArrayList<>();

        lista.add(c4);
        lista.add(fordKa);
        lista.add(newFiesta);
        lista.add(yamaha);
        lista.add(hondaBiz);

        for (Veiculos item: lista){
            if (item instanceof Moto){
                System.out.println("Lista de motos " + item.getModelo());
            }
            if(item instanceof Carro) {
                System.out.println("Lista com os meus carros: " + item.getModelo());
            }

        }


    }
}