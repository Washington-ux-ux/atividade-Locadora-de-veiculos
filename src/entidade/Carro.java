package entidade;

public class Carro extends Veiculo {

    private int numeroPortas;


    public Carro(String marca, String modelo, double valorDiaria, int numeroPortas) {
        super(marca, modelo, valorDiaria);
        this.numeroPortas = numeroPortas;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }


    @Override
    public double calcularAluguel(int dias) {
        double valorBase = getValorDiaria() * dias;
        return valorBase * 0.90;
    }
}
