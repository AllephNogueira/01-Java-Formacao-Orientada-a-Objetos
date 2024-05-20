public class Main {
    public static void main (String[] arg){
        String nome = "Alleph";
        String sobreNome = "Nogueira";
        String dados = "Bem vindo " + nome + " " + sobreNome;
        System.out.println(dados);

        // Agora vamos fazer uma comparação de ID e Senha

        String login = "alleph";
        String senha = "G@memastter11";

        if (login.equals("alleph")) {
            System.out.println("Acesso autorizado 1");
            if (senha.equals("G@memastter11")) {
                System.out.println("Acesso autorizado 2");
            }else {
                System.out.println("Sua senha esta incorreta!");
                return;
            }
        }else {
            System.out.println("Seu login esta incorreto!");
            return;
        }

        System.out.println("Obrigado por confirmar os codigos.");
    }
}