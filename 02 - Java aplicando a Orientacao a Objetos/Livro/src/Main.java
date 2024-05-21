//Desenvolva uma classe Livros.Livro com os atributos privados titulo e autor. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um método exibirDetalhes que imprime o título e o autor do livro.


import Livros.Livro;

public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro();

        livro1.setTitulo("O Senhor dos Aneis");
        livro1.setAutor("JR TOKEN");

        livro1.exibirDetlahes();

    }
}