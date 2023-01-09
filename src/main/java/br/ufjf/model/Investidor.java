package br.ufjf.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Investidor {

    private double valorInvestimento;

    public double investirPoupancaAnual() {
        CalculadoraFinanceira calculadoraFinanceira= new CalculadoraFinanceira(this.valorInvestimento);
        return calculadoraFinanceira.calcularRetorno(new FDIPoupanca());
    }

    public double investirTesouroIPCAAnual() {
        CalculadoraFinanceira calculadoraFinanceira= new CalculadoraFinanceira(this.valorInvestimento);
        return calculadoraFinanceira.calcularRetorno(new FDITesouroIPCA());
    }
    public double investirCDBAnual() {
        CalculadoraFinanceira calculadoraFinanceira= new CalculadoraFinanceira(this.valorInvestimento);
        return calculadoraFinanceira.calcularRetorno(new FDICDB());
    }
}
