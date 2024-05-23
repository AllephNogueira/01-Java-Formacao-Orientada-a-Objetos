// Crie uma classe CalculadoraSalaRetangular que implementa uma interface CalculoGeometrico com os métodos calcularArea() e calcularPerimetro() para calcular a área e o perímetro de uma sala retangular. A classe deve receber altura e largura como parâmetros.

public class Main {
    public static void main(String[] args) {

        CalculadoraSalaRetangular metroQuadrado = new CalculadoraSalaRetangular();


        int meuCalculo = metroQuadrado.calcularArea(2,2);

        System.out.println("Seu banheiro tem: " + meuCalculo + " metros quadrados");
    }
}