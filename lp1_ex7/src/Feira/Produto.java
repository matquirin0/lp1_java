package Feira;

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

    // AÇÃO 1: Verificar se uma quantidade específica está disponível
    public boolean temEstoqueSuficiente(int qtdDesejada){
        return this.quantidade >= qtdDesejada;
    }

    // AÇÃO 2: Calcular o subtotal baseado em uma quantidade
    public BigDecimal calcularValorTotal(int qtd){
        return this.valorProduto.multiply(new BigDecimal(qtd));
    }

    //AÇÃO 3: Reduzir a quantidade de estoque após uma venda
    public void reduzirQuantidade(int qtd){
        this.quantidade -= qtd;
    }


    public String getNomeProduto(){
        return nomeProduto;
    }

    public BigDecimal getValorProduto() {
        return valorProduto;
    }
}
