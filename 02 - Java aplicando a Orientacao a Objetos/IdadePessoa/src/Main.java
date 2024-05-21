public class Main {
    public static void main(String[] args) {
        IdadePessoa pessoa1 = new IdadePessoa();

        pessoa1.setNome("Alleph");
        pessoa1.setIdade(16);

        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println(pessoa1.getIdade() < 18 ? "Voce nao pode sair":"Voce pode sair" + " sua idade é: " + pessoa1.getIdade());

    }
}