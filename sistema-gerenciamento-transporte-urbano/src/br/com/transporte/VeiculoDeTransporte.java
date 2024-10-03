package br.com.transporte;
import br.com.transporte.interfaces.Veiculo;

public abstract class VeiculoDeTransporte implements Veiculo {
    protected int capacidadePassageiros;
    protected double distanciaTotal;
    protected int numeroViagens;
    protected double totalArrecadado;

    public VeiculoDeTransporte(int capacidadePassageiros) {
        this.capacidadePassageiros = capacidadePassageiros;
        this.distanciaTotal = 0;
        this.numeroViagens = 0;
        this.totalArrecadado = 0;
    }

    public void registrarViagem(double distancia) {
        numeroViagens++;
        distanciaTotal += distancia;
        totalArrecadado += calcularTarifa(distancia);
    }

    public void gerarRelatorio() {
        System.out.println("Tipo de Veículo: " + this.getClass().getSimpleName());
        System.out.println("Capacidade de Passageiros: " + capacidadePassageiros);
        System.out.println("Número de Viagens: " + numeroViagens);
        System.out.println("Distância Total Percorrida: " + distanciaTotal + " km");
        System.out.println("Total Arrecadado: R$ " + totalArrecadado);
    }

    public double getTotalArrecadado() {
        return totalArrecadado;
    }
}
