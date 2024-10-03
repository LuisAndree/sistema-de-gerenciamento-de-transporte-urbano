package br.com.transporte.veiculos;
import br.com.transporte.VeiculoDeTransporte;

public class Onibus extends VeiculoDeTransporte {
    private static final double TARIFA_FIXA = 4.00;

    public Onibus(int capacidadePassageiros) {
        super(capacidadePassageiros);
    }

    @Override
    public double calcularTarifa(double distancia) {
        return TARIFA_FIXA;
    }
}
