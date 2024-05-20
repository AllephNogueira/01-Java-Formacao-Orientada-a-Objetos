public class Main {
    public static void main(String[] args) {
        System.out.println("Esse programa converter Graus para Celsius");
        int graus = 32;
        System.out.println("Esta muito calor hoje, voce sabe que hoje esta " + graus + " graus?");
        System.out.println("E se estivessemos nos Estados Unidos?");
        double temperaturaUSA = (graus * 1.8) + 32;
        System.out.println("Ai seria a temperatura de " + temperaturaUSA + " Fahrenheit ");
        int temperaturaConvertida = (int) (temperaturaUSA);
        System.out.println("Convertendo a temperatura para inteiro seria  " + temperaturaConvertida + " Fahrenheit");
    }
}