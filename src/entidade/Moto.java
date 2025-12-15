package entidade;

public class Moto extends Veiculo {

    private int cilindradas;


    public Moto(String marca, String modelo, double valorDiaria, int cilindradas) {
        super(marca, modelo, valorDiaria);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public double calcularAluguel(int dias) {
        double valorBase = getValorDiaria() * dias;
        return valorBase * 0.95;
    }
}
