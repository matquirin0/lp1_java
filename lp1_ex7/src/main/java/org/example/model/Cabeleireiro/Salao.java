package org.example.model.Cabeleireiro;

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

    public BigDecimal finalizarAtendimento(Servico s){
        BigDecimal valorTotal = s.calculoTotalServico();
        return this.saldoTotal = this.saldoTotal.add(valorTotal);
    }

    public void exibirRelatórioUnidade(){
        System.out.println("Atendimento finalizado na unidade: " + this.unidadeSalao);
        System.out.println("Quantidade de colaboradores no salão: " + this.numeroColaboradores);
        System.out.println("Valor total recebido: R$ " + saldoTotal);
    }

    public void alterarEquipe(int qtd) {
        this.numeroColaboradores += qtd;
    }
}
