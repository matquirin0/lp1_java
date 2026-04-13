package org.example.model.Feira;

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

    public BigDecimal getSaldo() {
        return saldo;
    }


    public boolean temSaldo(BigDecimal valorTotal){
        return this.saldo.compareTo(valorTotal) >= 0;
    }


    public void comprarProduto(Produto p, int qtdDesejada, Feirante feirante){
        BigDecimal custo = p.getValorProduto().multiply(new BigDecimal(qtdDesejada));
        this.saldo = this.saldo.subtract(custo);

        feirante.vender(this, p, qtdDesejada);

        this.sacola.add(new Produto(p.getNomeProduto(), qtdDesejada, p.getValorProduto()));
        System.out.println(nome + " comprou " + qtdDesejada + " " + p.getNomeProduto());
    }

    public void exibirExtrato(){
        System.out.println("Saldo de " + nome + ": R$ " + saldo);
    }

    public void devolverProduto(Produto p, int qtd, Feirante f) {
        BigDecimal valorEstorno = p.getValorProduto().multiply(new BigDecimal(qtd));
        this.saldo = this.saldo.add(valorEstorno); // Recebe dinheiro de volta
        f.estornarVenda(p, qtd); // Avisa o feirante para estornar
        // Lógica adicional para remover da sacola se necessário
    }
}
