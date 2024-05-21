package Livros;//Desenvolva uma classe Livros.Livro com os atributos privados titulo e autor. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um método exibirDetalhes que imprime o título e o autor do livro.

public class Livro {

    private String titulo;
    private String autor;

    // Aqui podemos ler e modificar
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // Aqui podemos ler modificar
    public void setAutor(String autor) {
        this.autor = autor;
    }

    // Daqui somente a prorpia classe pode modificar
    public String getTitulo() {
        return titulo;
    }

    // Daqui somente a prorpia classe pode modificar
    public String getAutor() {
        return autor;
    }

    // Esse e o metodo
    public void exibirDetlahes(){
        System.out.println("Livros.Livro: " + this.titulo + "\nAutor: " + this.autor);
    }
}
