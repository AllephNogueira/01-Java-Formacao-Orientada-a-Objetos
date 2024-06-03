public class Nome {

    private static String nome;

    public static String getNome(){
        return nome;
    }

    public static String descricao(String nome){
        Nome.nome = nome;
        return nome;
    }
}
