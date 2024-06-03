public class Sobrenome {
    private String sobrenome;

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void dadosCadastrais(Nome parametro1, dataAniversario parametro2){
        System.out.println("Nome: " + parametro1.getUltimoNome() + " - Sobrenome: " + sobrenome + " você nasceu em: " + parametro2.getAnoNascimento());
    }
}
