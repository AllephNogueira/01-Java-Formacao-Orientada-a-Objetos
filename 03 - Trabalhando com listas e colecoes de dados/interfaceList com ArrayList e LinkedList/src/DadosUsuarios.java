public class DadosUsuarios implements Comparable {

    private String nomes;
    private String sobrenome;

    public DadosUsuarios(String nomes, String sobrenome) {
        this.nomes = nomes;
        this.sobrenome = sobrenome;
    }

    public String getNomes() {
        return nomes;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    @Override
    public String toString() {
        return "Nome: " + getNomes() + ", Sobrenome: " + getSobrenome() + " - ";
    }

    @Override
    public int compareTo(Object o) {
        return getNomes().compareTo(((DadosUsuarios) o).getNomes());
    }
}
