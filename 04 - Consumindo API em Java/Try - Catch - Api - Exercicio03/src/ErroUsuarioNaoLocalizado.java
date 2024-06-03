public class ErroUsuarioNaoLocalizado extends RuntimeException{
    private String mensagem;

    public ErroUsuarioNaoLocalizado(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return mensagem;
    }
}
