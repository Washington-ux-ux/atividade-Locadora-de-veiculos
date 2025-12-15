import entidade.Carro;
import entidade.Moto;
import entidade.Veiculo;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        Veiculo veiculoLocado = null;

        System.out.println("----------------------");
        System.out.println("Bem vindo à Locadora de veículos Rota Certa!");
        System.out.println("----------------------");

        System.out.println("Qual tipo de veiculo você deseja cadastrar?");
        System.out.println("C - Carro");
        System.out.println("M - Moto");
        String tipoVeiculo = sc.next();

        System.out.println("Qual a marca do veículo? ");
        String marca = sc.next();
        System.out.println("Qual o modelo do veículo? ");
        String modelo = sc.next();
        System.out.println("Quanto é o valor da diaria? ");
        double valorDiaria = sc.nextDouble();
        System.out.println("Por quantos dias o veiculo foi alugado? ");
        int dias = sc.nextInt();


        if (tipoVeiculo.equalsIgnoreCase("c")) {
            System.out.println("Quantas portas tem o carro? ");
            int numeroPortas = sc.nextInt();


            veiculoLocado = new Carro(marca, modelo, valorDiaria, numeroPortas);

        } else if (tipoVeiculo.equalsIgnoreCase("m")) {
            System.out.println("Quantas cilindradas tem a moto?");
            int cilindradas = sc.nextInt();


            veiculoLocado = new Moto(marca, modelo, valorDiaria, cilindradas);
        }

        System.out.println("------------------------------");
        System.out.println("Resumo do Aluguel:");


        if (veiculoLocado != null) {
            System.out.println("Veículo: " + veiculoLocado.getMarca() + " - " + veiculoLocado.getModelo());
            System.out.println("Valor da diária base: R$ " + String.format("%.2f", veiculoLocado.getValorDiaria()));
            System.out.println("Dias alugados: " + dias);

            double valorFinal = veiculoLocado.calcularAluguel(dias);

            System.out.println("VALOR TOTAL A PAGAR: R$ " + String.format("%.2f", valorFinal));
        } else {
            System.out.println("Opa! Algo deu errado!!!.");
        }

        sc.close();
    }
}