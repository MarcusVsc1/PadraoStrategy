package br.ufjf.model;

import br.ufjf.interfaces.FundoDeInvestimento;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CalculadoraFinanceira {

    private double valorInvestido;

    public double calcularRetorno(FundoDeInvestimento fundoDeInvestimento) {
        return fundoDeInvestimento.calcularRetornoAnual(valorInvestido).doubleValue();
    }

}
