package Cabeleireiro;

import java.math.BigDecimal;

public class Salao {
    private String unidadeSalao;
    public BigDecimal saldoTotal;
    private int numeroColaboradores;

    public Salao(String unidadeSalao, BigDecimal saldoTotal, int numeroColaboradores){
        this.unidadeSalao = unidadeSalao;
        this.saldoTotal = saldoTotal;
        this.numeroColaboradores = numeroColaboradores;
    }


}
