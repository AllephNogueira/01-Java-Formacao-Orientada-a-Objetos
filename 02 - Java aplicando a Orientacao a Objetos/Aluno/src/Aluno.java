public class Aluno {

    private String nome;
    private int nota;
    private String materia;
    private int totalAvaliacoes = 0;
    private int somaNotas;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public void setMateria(String materia){
        this.materia = materia;
    }

    public String getNome() {
        return nome;
    }

    public int getNota() {
        return nota;
    }

    public String getMateria() {
        return materia;
    }

    public int getTotalAvaliacoes (){
        return totalAvaliacoes;
    }
    // Adicionando notas

    public void adicionarNota(int nota){
        this.nota = nota;
        this.somaNotas += nota;
        this.totalAvaliacoes++;
    }

    public int calcularMedia() {
        return this.somaNotas / this.totalAvaliacoes;
    }
}
