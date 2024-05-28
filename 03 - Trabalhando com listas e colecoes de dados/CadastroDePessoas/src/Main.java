import java.util.ArrayList;

public class Main {

    public static int contador = 0;


    public static void main(String[] args) {
        var pessoa1 = new Pessoa();
        pessoa1.setNome("alleph");
        pessoa1.setIdade(30);

        var pessoa2 = new Pessoa();
        pessoa2.setNome("Fernanda");
        pessoa2.setIdade(28);

        var pessoa3 = new Pessoa();
        pessoa3.setNome("Juliana");
        pessoa3.setIdade(29);


        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
        pessoas.add(pessoa1);
        pessoas.add(pessoa2);
        pessoas.add(pessoa3);

        System.out.println("\n" + pessoas + "\n");


        // Agora exibir com um for somente o nome

        for (int i = 0; i < pessoas.size(); i++) {
            System.out.println(pessoas.get(i).getNome());

        }


    }
}