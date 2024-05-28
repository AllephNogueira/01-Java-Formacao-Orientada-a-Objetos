import java.util.Objects;

public class Quadrado implements Forma{
    private int numero1;
    private int numero2;
    private String comodo;

    public Quadrado(int numero1, int numero2, String comodo) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.comodo = comodo;
    }

    public int getNumero1() {
        return numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public String getComodo(){
        return comodo;
    }

    public int calcularQuadrado(){
        if(comodo.equals("quarto")){
            System.out.println("Você vai precisar de: " + getNumero1() * getNumero2() + " metros para o seu quarto");
        }else {
            System.out.println("Você vai precisar de: " + getNumero1() * getNumero2() + " metros");
        }
        return 0;
    }

    @Override
    public void calcularArea() {
        System.out.println("Você vai precisar de: " + getNumero1() * getNumero2() + " metros");
    }


}
