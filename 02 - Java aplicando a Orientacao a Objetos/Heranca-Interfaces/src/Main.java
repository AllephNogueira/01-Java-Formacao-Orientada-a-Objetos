//Interface é como se fosse uma regra de negocio, todas as classes que tiver a interface é obrigada a implementar seus metodos(suas regras de negocio)

//As interfaces não contêm a implementação dos métodos, apenas suas assinaturas (nomes, parâmetros e tipos de retorno).

// Observe que na minha interface eu digo que deve ter o metodo  double calculaImposto() e todas as classes que tem essa interface é obrigatoria criar um metodo desse.


public class Main {
    public static void main(String[] args) {

        CalculadoraImposto produto1 = new CalculadoraImposto();

        produto1.setNome("Arroz");
        produto1.setPreco(100);
        produto1.setPeso(5);


        System.out.println("Nome do produto: " + produto1.getNome() + " Preço do produto: " + produto1.getPreco() + " Peso: " + produto1.getPeso() + " KG");

        System.out.println("Tributo do produto é: " + produto1.calculaImposto());
    }
}