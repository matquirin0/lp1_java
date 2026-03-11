package Feira;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private BigDecimal saldo;
    private List<Produto> sacola = new ArrayList<>();

    public Cliente(String nome, BigDecimal saldo){
        this.nome = nome;
        this.saldo = saldo;
        this.sacola = new ArrayList<>();
    }

    //AÇÃO 1: Verifica se o cliente tem saldo;
    public boolean temSaldo(BigDecimal valorTotal){
        return this.saldo.compareTo(valorTotal) >= 0;
    }

    //AÇÃO 2: Pagar e adicionar à sacola
    public void comprarProduto(Produto p, int qtdDesejada){
        BigDecimal custo = p.getValorProduto().multiply(new BigDecimal(qtdDesejada));
        this.saldo = this.saldo.subtract(custo);

        this.sacola.add(new Produto(p.getNomeProduto(), qtdDesejada, p.getValorProduto());
        System.out.println(nome + " comprou " + qtdDesejada + " " + p.getNomeProduto());
    }

    //AÇÃO 3: Exibir extrato
    public void exibirExtrato(){
        System.out.println("Saldo de " + nome + ": R$ " + saldo);
    }

}
