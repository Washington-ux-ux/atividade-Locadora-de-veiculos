package entidade;

public class Veiculo {

    private String marca;
    private String modelo;
    private double valorDiaria;

    public Veiculo() {
    }

    public Veiculo(String marca, String modelo, double valorDiaria) {
        this.marca = marca;
        this.modelo = modelo;
        this.valorDiaria = valorDiaria;
    }


    public double calcularAluguel(int dias) {
        return getValorDiaria() * dias;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }
}
