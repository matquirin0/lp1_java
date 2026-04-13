package org.example.model.Feira;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Feirante {
    private String nome;
    private List<Produto> mercadoria = new ArrayList<>();
    private BigDecimal caixa;

    public Feirante(String nome, BigDecimal caixa){
        this.nome = nome;
        this.caixa = caixa;
    }

    public BigDecimal getCaixa() {
        return caixa;
    }

    public void adicionarMercadoria(Produto p){
        this.mercadoria.add(p);
    }

    public boolean temEstoque(Produto produto, int qtdDesejada){
        for(Produto p : mercadoria){
            if(p.getNomeProduto().equalsIgnoreCase(produto.getNomeProduto())){
                return p.temEstoqueSuficiente(qtdDesejada);
            }
        }
        return false;
    }

    public void vender(Cliente cliente, Produto produto, int quantidade){
        for (Produto p : mercadoria){
            if(p.getNomeProduto().equalsIgnoreCase(produto.getNomeProduto())){
                BigDecimal valorVenda = p.calcularValorTotal(quantidade);
                p.reduzirQuantidade(quantidade);
                this.caixa = this.caixa.add(valorVenda);
            }
        }
    }

    public void estornarVenda(Produto produto, int quantidade) {
        for (Produto p : mercadoria) {
            if (p.getNomeProduto().equalsIgnoreCase(produto.getNomeProduto())) {
                BigDecimal valorEstorno = p.calcularValorTotal(quantidade);
                this.caixa = this.caixa.subtract(valorEstorno);
                p.reporEstoque(quantidade);
            }
        }
    }

    public void exibirExtratoF(){
        System.out.println("Saldo do feirante " + nome + ": R$ " + caixa);
    }
}
