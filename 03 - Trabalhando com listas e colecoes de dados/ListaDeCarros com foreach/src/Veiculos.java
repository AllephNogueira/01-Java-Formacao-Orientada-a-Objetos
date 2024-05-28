public class Veiculos {
    private String modelo;
    private double motor;
    private int quantidadePneus;
    private String tipoCombustive;
    private int quantidadeDePassageiros;


    public Veiculos(String modelo, double motor, int quantidadePneus, String tipoCombustive, int quantidadeDePassageiros) {
        this.modelo = modelo;
        this.motor = motor;
        this.quantidadePneus = quantidadePneus;
        this.tipoCombustive = tipoCombustive;
        this.quantidadeDePassageiros = quantidadeDePassageiros;
    }

    public String getModelo() {
        return modelo;
    }

    public double getMotor() {
        return motor;
    }

    public int getQuantidadePneus() {
        return quantidadePneus;
    }

    public String getTipoCombustive() {
        return tipoCombustive;
    }

    public int getQuantidadeDePassageiros() {
        return quantidadeDePassageiros;
    }
}
