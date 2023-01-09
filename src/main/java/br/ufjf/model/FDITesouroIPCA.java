package br.ufjf.model;

import br.ufjf.interfaces.FundoDeInvestimento;

import java.math.BigDecimal;
import java.math.MathContext;

public class FDITesouroIPCA implements FundoDeInvestimento {

    @Override
    public BigDecimal calcularRetornoAnual(double valorInvestido) {
        return new BigDecimal(valorInvestido * 1.1143, MathContext.DECIMAL64);
    }
}
