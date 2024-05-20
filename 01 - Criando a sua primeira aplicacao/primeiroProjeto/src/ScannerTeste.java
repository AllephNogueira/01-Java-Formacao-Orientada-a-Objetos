import java.util.Scanner;

public class ScannerTeste {
    public static void main(String[] args) {
        // Utilizando o scanner sem usar uma variavel
        System.out.println("Digite o seu nome: ");
        String nome = new Scanner(System.in).nextLine();


        // Utlizando o scanner com uma variavel
        // Para evitar digitar muitas linhas de codigo

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o seu sobrenome: ");
        String sobrenome = scanner.nextLine();


        // Usando scanner para pegar data de nascimento.
        System.out.println("Digite seu ano de nascimento: ");
        int idade = scanner.nextInt();



        System.out.println("Seja bem vindo " + nome);
        System.out.println("Seu sobrenome é: " + sobrenome);
        System.out.println("Sua idade é: " + (2024 - idade));
    }
}
