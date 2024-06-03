import java.util.Scanner;

public class ExercicioSenha {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua senha: ");
        String senha = scanner.nextLine();

        try {
            validarSenha(senha); // Criamos um metodo para verificar se a senha tem menos de 8 numeros
            System.out.println("Senha válida. Acesso permitido.");
        } catch (SenhaInvalidaException e) { // Se tiver menos de 8 numeros vamos cair aqui
            System.out.println("Erro: " + e.getMessage());
        }
    }

    private static void validarSenha(String senha) {
        if (senha.length() < 8) { // Se a senha tiver menos de 8 numeros vamos criar uma exception com essa mensagem a baixo
            throw new SenhaInvalidaException("A senha deve ter pelo menos 8 caracteres.");
        }
    }
}
