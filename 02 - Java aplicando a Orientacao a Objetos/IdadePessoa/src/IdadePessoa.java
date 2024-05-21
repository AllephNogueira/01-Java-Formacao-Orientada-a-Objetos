public class IdadePessoa {

    private String nome;
    private int idade;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        if (idade >= 18) {
            return idade;
        }else  {
            System.out.println("você não pode ingerir bebidas alcoólicas");
            return idade;
        }
    }
}
