public class InfoTotal {
    public void informacaoTotal (Nome nomeUsuario, Sobrenome sobrenomeUsuario, dataAniversario anoNascimento){
        System.out.println("Seja bem vindo " + nomeUsuario.getNome() + " - " + sobrenomeUsuario.getSobrenome() + " nascimento em: " + anoNascimento.getAnoNascimento());
    }
}
