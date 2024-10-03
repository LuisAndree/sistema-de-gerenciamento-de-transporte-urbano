package br.com.transporte.veiculos;
import br.com.transporte.VeiculoDeTransporte;

public class Metro extends VeiculoDeTransporte {
    private static final double TARIFA_POR_KM = 0.50;

    public Metro(int capacidadePassageiros) {
        super(capacidadePassageiros);
    }

    @Override
    public double calcularTarifa(double distancia) {
        return distancia * TARIFA_POR_KM;
    }
}
