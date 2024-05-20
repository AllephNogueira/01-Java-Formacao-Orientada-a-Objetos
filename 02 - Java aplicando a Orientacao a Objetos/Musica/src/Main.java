public class Main {
    public static void main(String[] args) {
        Musica banda1 = new Musica();

        banda1.titulo = "Sorriso Maroto";
        banda1.artista = "Bruno";
        banda1.anolacamento = 1994;

        banda1.informacaoDaBanda();
        banda1.nota(10);
        banda1.nota(10);
        banda1.nota(5);
        banda1.nota(7);
        banda1.nota(2);
        System.out.println("A banda tem a nota de: " + banda1.calcularMedia());
        System.out.println("Com o total de " + banda1.numeroDeAvaliadores + " avaliadores");

    }
}