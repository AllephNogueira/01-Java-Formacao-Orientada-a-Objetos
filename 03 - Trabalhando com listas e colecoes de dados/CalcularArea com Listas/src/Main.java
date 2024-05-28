import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Quadrado quarto = new Quadrado(5,8, "quarto");
        Quadrado sala = new Quadrado(3,3, "sala");


        ArrayList<Quadrado> listaQuadrado = new ArrayList<>();
        listaQuadrado.add(quarto);
        listaQuadrado.add(sala);

        for (Quadrado forma: listaQuadrado){
            forma.calcularQuadrado();
        }
    }
}