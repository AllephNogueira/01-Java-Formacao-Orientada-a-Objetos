public class Dados {
    private String nome;
    private int idade;
    private String email;
    private String cidade;
    private double telefone;


    public Dados(String nome, int idade, String email, String cidade, double telefone) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.cidade = cidade;
        this.telefone = telefone;
    }


    @Override
    public String toString() {
        return "Nome: " + this.nome + " - idade: " + this.idade + " - email: " + this.email + " - cidade: " + this.cidade + " - telefone: " + this.telefone;
    }
}
