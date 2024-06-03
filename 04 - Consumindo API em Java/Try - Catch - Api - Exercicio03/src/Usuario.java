public class Usuario {
    private String usuario;
    private String id;
    private String html_url;

    public Usuario(DetalheSolicitacao usuarioEncontrado) {

        if(usuarioEncontrado.login() == null){
            throw new ErroUsuarioNaoLocalizado("Esse usuario não existe");
        }
        this.usuario = usuarioEncontrado.login();
        this.id = usuarioEncontrado.id();
        this.html_url = usuarioEncontrado.html_url();

    }


    @Override
    public String toString() {
        return "Usuario localizado: " + "ID: " + this.id + " - nome: " + this.usuario + " - URL: " + this.html_url;
    }
}

