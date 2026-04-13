package org.example.model.Feira;

import java.math.BigDecimal;

public class Produto {
    private String nomeProduto;
    private int quantidade;
    private BigDecimal valorProduto;

    public Produto(String nomeProduto,int quantidade, BigDecimal valorProduto){
        this.nomeProduto = nomeProduto;
        this.quantidade = quantidade;
        this.valorProduto = valorProduto;
    }

    public String getNomeProduto(){
        return nomeProduto;
    }

    public BigDecimal getValorProduto() {
        return valorProduto;
    }

    // AÇÃO 1: Verificar se uma quantidade específica está disponível
    public boolean temEstoqueSuficiente(int qtdDesejada){
        return this.quantidade >= qtdDesejada;
    }

    public BigDecimal calcularValorTotal(int qtd){
        return this.valorProduto.multiply(new BigDecimal(qtd));
    }

    public void reduzirQuantidade(int qtd){
        this.quantidade -= qtd;
    }

    public void reporEstoque(int qtd) {
        this.quantidade += qtd; // Apenas o modelo mexe no dado bruto
    }


}
