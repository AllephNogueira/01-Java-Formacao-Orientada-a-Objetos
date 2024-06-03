public class FichaCadastral {
    private String nome;
    private int idade;
    private String cidade;


    public FichaCadastral(Pessoa pessoa) {
        this.nome = pessoa.nome();
        this.idade = pessoa.idade();
        this.cidade = pessoa.cidade();
    }

    @Override
    public String toString() {
        return "\n Nome: " + nome + "\n Idade: " + idade + "\n Cidade: " + cidade;
    }
}
