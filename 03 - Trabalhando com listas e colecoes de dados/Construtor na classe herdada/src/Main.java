import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        var aluno1 = new Aluno("Alleph", 30, 202405271314L, "Java");
        Aluno aluno2 = new Aluno("Fernanda", 28, 202405271345L, "RH");
        Aluno aluno3 = new Aluno("Larissa", 30, 202405271346L, "Estudante");

        //aluno1.informacoesDoAluno();

        ArrayList<Aluno> alunos = new ArrayList<>();
        alunos.add(aluno1);
        alunos.add(aluno2);
        alunos.add(aluno3);

        System.out.println("Usuarios cadastrados: " + alunos.size() + "\n");
        //System.out.println("Alunos cadastrados: \n" + alunos + "\n");

        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }

        System.out.println("Nome do usuario 1: " + alunos.get(0).getNome());

        for (int i = 0; i < alunos.size(); i++) {
            System.out.println("Nome dos usuarios cadastrado na lista: " + alunos.get(i).getNome());

        }

    }
}