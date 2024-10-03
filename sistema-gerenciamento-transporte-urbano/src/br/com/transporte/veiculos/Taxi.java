package br.com.transporte.veiculos;
import br.com.transporte.VeiculoDeTransporte;

public class Taxi extends VeiculoDeTransporte {
    private static final double TARIFA_FIXA = 3.00;
    private static final double TARIFA_POR_KM = 1.50;

    public Taxi(int capacidadePassageiros) {
        super(capacidadePassageiros);
    }

    @Override
    public double calcularTarifa(double distancia) {
        return TARIFA_FIXA + (distancia * TARIFA_POR_KM);
    }
}
