package Cabeleireiro;

import java.math.BigDecimal;

public class Produto {
    private String nome;
    private int quantidade;
    private BigDecimal preco;

    public Produto(String nome, int quantidade, BigDecimal preco){
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public BigDecimal getPreco(){
        return preco;
    }

    public BigDecimal totalProduto(){
        BigDecimal totalProduto = BigDecimal.ZERO;
        totalProduto = preco.multiply(BigDecimal.valueOf(quantidade));
        return totalProduto;
    }

    public int reporEstoque (int qtd){
        return qtd += quantidade;
    }

}
