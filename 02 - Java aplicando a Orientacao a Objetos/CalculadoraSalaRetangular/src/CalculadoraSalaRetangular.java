public class CalculadoraSalaRetangular implements  CalculoGeometrico{

//    private int metro1;
//    private int metro2;
//
//    public int getMetro1() {
//        return metro1;
//    }
//
//    public void setMetro1(int metro1) {
//        this.metro1 = metro1;
//    }
//
//    public int getMetro2() {
//        return metro2;
//    }
//
//    public void setMetro2(int metro2) {
//        this.metro2 = metro2;
//    }

    @Override
    public int calcularArea(int numero1, int numero2) { // Tambem podemos fazer assim passando os parametros diretamente no contrato
        return numero1 * numero2;
    }

    @Override
    public int calcularPerimetro() {
        return 0;
    }
}
