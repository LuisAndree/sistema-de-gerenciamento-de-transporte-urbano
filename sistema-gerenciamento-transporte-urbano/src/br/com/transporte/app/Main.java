package br.com.transporte.app;

import br.com.transporte.gerenciamento.GestorDeFrota;
import br.com.transporte.veiculos.Metro;
import br.com.transporte.veiculos.Onibus;
import br.com.transporte.veiculos.Taxi;

public class Main {
    public static void main(String[] args) {
        GestorDeFrota gestorDeFrota = new GestorDeFrota();

        Onibus onibus = new Onibus(50);
        Metro metro = new Metro(200);
        Taxi taxi = new Taxi(4);

        gestorDeFrota.adicionarVeiculo(onibus);
        gestorDeFrota.adicionarVeiculo(metro);
        gestorDeFrota.adicionarVeiculo(taxi);

        // Registrando viagens
        onibus.registrarViagem(10); 
        metro.registrarViagem(15); 
        taxi.registrarViagem(8); 

        System.out.println("Relatórios dos veículos:");
        gestorDeFrota.gerarRelatorioFrota();

        System.out.println("Lucro total arrecadado pela frota: R$ " + gestorDeFrota.calcularLucroTotal());
    }
}
