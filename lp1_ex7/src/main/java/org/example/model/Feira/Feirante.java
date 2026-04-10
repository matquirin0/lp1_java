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

    //AÇÃO 1: Adicionar mercadoria
    public void adicionarMercadoria(Produto p){
        this.mercadoria.add(p);
    }

    //AÇÃO 2: Verificar estoque
    public boolean temEstoque(Produto produto, int qtdDesejada){
        for(Produto p : mercadoria){
            if(p.getNomeProduto().equalsIgnoreCase(produto.getNomeProduto())){
                return p.temEstoqueSuficiente(qtdDesejada);
            }
        }
        return false;
    }

    //AÇÃO 3: Realizar a Venda
    public void vender(Cliente cliente, Produto produto, int quantidade){
        for (Produto p : mercadoria){
            if(p.getNomeProduto().equalsIgnoreCase(produto.getNomeProduto())){
                BigDecimal valorVenda = p.calcularValorTotal(quantidade);
                p.reduzirQuantidade(quantidade);
                this.caixa = this.caixa.add(valorVenda);
            }
        }
    }

    public void exibirExtratoF(){
        System.out.println("Saldo do feirante " + nome + ": R$ " + caixa);
    }
}
