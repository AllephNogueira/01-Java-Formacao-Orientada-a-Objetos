//Crie um programa simples que solicita dois números ao usuário e realiza a divisão do primeiro pelo segundo. Utilize o bloco try/catch para tratar a exceção que pode ocorrer caso o usuário informe 0 como divisor.

public class Main {
    public static void main(String[] args) {
        Numeros calculo1 = new Numeros(10,0);


        try{ // Se tudo der certo vamos passar aqui
            System.out.println("Calculo dos numeros é: " + calculo1.Calculo(calculo1.getNumero1(), calculo1.getNumero2()));
        }catch (ArithmeticException e){ // Se der algo errado vamos exibir essa mensagem
            System.out.println("Você não pode dividir o " + calculo1.getNumero1() + " por " + calculo1.getNumero2());
            System.out.println(e.getMessage());
        }



    }
}