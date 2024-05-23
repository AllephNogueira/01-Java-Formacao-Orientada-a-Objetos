//Crie uma interface ConversorTemperatura com os métodos celsiusParaFahrenheit() e fahrenheitParaCelsius(). Implemente uma classe ConversorTemperaturaPadrao que implementa essa interface com as fórmulas de conversão e exibe os resultados.

public class Main {
    public static void main(String[] args) {
        ConversorTemperaturaPadrao celsius = new ConversorTemperaturaPadrao();

        System.out.println("Sua temperatura convertida para Fahrenheit:" + celsius.celsiusParaFahrenheit(32)); // Aqui digitamos a temperatura em celsius


        ConversorTemperatura fahrenheit = new ConversorTemperaturaPadrao();

        System.out.println("Sua temperatura convertida para celsius:" + fahrenheit.fahrenheitParaCelsius(89));



    }
}