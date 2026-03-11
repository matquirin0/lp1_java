package Feira;

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
    public boolean temEstoque(String nomeProd, int qtdDesejada){
        for(Produto p : mercadoria){
            if(p.getNomeProduto().equalsIgnoreCase(nomeProd)){
                return p.temEstoqueSuficiente(qtdDesejada);
            }
        }
        return false;
    }

    //AÇÃO 3: Realizar a Venda
    public void vender(Cliente cliente, String nomeProd, int quantidade){
        for (Produto p : mercadoria){
            if(p.getNomeProduto().equalsIgnoreCase(nomeProd)){
                BigDecimal valorVenda = p.calcularValorTotal();
            }
        }
    }



}
