public class Titulo implements Comparable<Titulo> {
    private String tituloFilme;
    private int anoLancamento;
    public static int contadorDeObjetos = 0;

    public Titulo(String tituloFilme, int anoLancamento) {
        this.tituloFilme = tituloFilme;
        this.anoLancamento = anoLancamento;
        // Contar quantos objetos temos.
        contadorDeObjetos ++;

    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public static int getContadorDeObjetos() {
        return contadorDeObjetos;
    }

    public String getTituloFilme() {
        return tituloFilme;
    }

    @Override
    public String toString() {
        return "Filme: " + getTituloFilme();
    }

    @Override
    public int compareTo(Titulo outroFilme) {
        return this.getAnoLancamento();
    }


}
