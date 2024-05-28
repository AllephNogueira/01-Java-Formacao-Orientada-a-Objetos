package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;

public class PrincipalTeste {
    public static void main(String[] args) {
        Filme filmeAlleph = new Filme("Harry Potter", 2008);

        System.out.println(filmeAlleph.getNome());

        Filme f1 = filmeAlleph;

        System.out.println(f1.getNome());

        // Os dois ficaram com o mesmo nome, agora vamos ver se vai ser 2 objetos diferentes.

        f1.setNome("Senhor dos Aneis");
        filmeAlleph.setNome("Harry Potter 6");

        // Imprimindo os 2 objetos

        System.out.println(f1.getNome() + " - " +  filmeAlleph.getNome());

        if(f1 == filmeAlleph) {
            System.out.println("São iguais");
        }else {
            System.out.println("São diferentes.");
        }


    }
}
