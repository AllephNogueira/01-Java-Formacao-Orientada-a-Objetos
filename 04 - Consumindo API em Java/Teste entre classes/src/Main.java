public class Main {
    public static void main(String[] args) {

         // Classe sobrenome

        var dados = new Sobrenome();
        dados.setSobrenome("Nogueira");

        // Classe nome
        Nome meuUltimoNome = new Nome();
        meuUltimoNome.setUltimoNome("Oliveira");

        //Classe data de aniversario
        dataAniversario meuNascimento = new dataAniversario();
        meuNascimento.setAnoNascimento(1994);

        // Imprimir dados
        dados.dadosCadastrais(meuUltimoNome, meuNascimento);



        Nome primeiroNome = new Nome();
        primeiroNome.setNome("Alleph");


        Sobrenome sobrenome = new Sobrenome();
        sobrenome.setSobrenome("Nogueira");

        dataAniversario anoNascimento = new dataAniversario();
        anoNascimento.setAnoNascimento(1994);

        InfoTotal fichaCadastral = new InfoTotal();

        System.out.println("Meu dados cadastrais são: ");
        fichaCadastral.informacaoTotal(primeiroNome, sobrenome, anoNascimento);


        System.out.println("Teste para imprimir uma variavel");
        System.out.println(primeiroNome.getNome());


    }
}