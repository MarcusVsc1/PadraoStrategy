package br.ufjf.model;

import br.ufjf.interfaces.FundoDeInvestimento;

import java.math.BigDecimal;
import java.math.MathContext;

public class FDICDB implements FundoDeInvestimento {

    @Override
    public BigDecimal calcularRetornoAnual(double valorInvestido) {
        return new BigDecimal(valorInvestido * 1.1092, MathContext.DECIMAL64);
    }
}
