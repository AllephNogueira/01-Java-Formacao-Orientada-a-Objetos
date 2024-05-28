public class Aluno extends Pessoa{
    private long matricula;
    private String curso;

    public Aluno (String nome, int idade, long matricula, String curso) {
        super(nome, idade);
        this.matricula = matricula;
        this.curso = curso;
    }

    public long getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void informacoesDoAluno() { // meu metodo para mostrar os dados.
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Matricula: " + matricula);
        System.out.println("Curso: " + curso);

    }

    public String toString(){
        return "[Nome: " + getNome() + " Idade: " + getIdade() + " Matricula: " + matricula + " Curso: " + curso + "]\n";
    }
}
