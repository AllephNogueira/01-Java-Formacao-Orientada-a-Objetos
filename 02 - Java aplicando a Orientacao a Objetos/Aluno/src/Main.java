// Desenvolva uma classe Aluno com os atributos privados nome e notas. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um método calcularMedia que retorna a média das notas do aluno.

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.setNome("Alleph");
        aluno1.setMateria("Pensamento computacional");

        aluno1.adicionarNota(10);
        aluno1.adicionarNota(5);
        aluno1.adicionarNota(6);

        System.out.println("Teste : " + aluno1.getTotalAvaliacoes());

        System.out.println("Aluno: " + aluno1.getNome() + " - Materia: " + aluno1.getMateria() + " - Ultima nota: " + aluno1.getNota() + " - Sua media: "+ aluno1.calcularMedia());




        //System.out.println("Aluno: " + aluno1.getNome() + " - Materia: " + aluno1.getMateria() + " - Nota: " + aluno1.calcularMedia());
    }
}