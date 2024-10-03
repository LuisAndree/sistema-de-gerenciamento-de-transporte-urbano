package br.com.transporte.gerenciamento;
import br.com.transporte.interfaces.Veiculo;
import br.com.transporte.VeiculoDeTransporte;

import java.util.ArrayList;
import java.util.List;

public class GestorDeFrota {
    private List<Veiculo> frota;

    public GestorDeFrota() {
        frota = new ArrayList<>();
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        frota.add(veiculo);
    }

    public void gerarRelatorioFrota() {
        for (Veiculo veiculo : frota) {
            veiculo.gerarRelatorio();
            System.out.println("--------------------");
        }
    }

    public double calcularLucroTotal() {
        double total = 0;
        for (Veiculo veiculo : frota) {
            if (veiculo instanceof VeiculoDeTransporte) {
                total += ((VeiculoDeTransporte) veiculo).getTotalArrecadado();
            }
        }
        return total;
    }
}

