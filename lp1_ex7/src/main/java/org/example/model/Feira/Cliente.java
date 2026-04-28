package org.example.model.Feira;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private double carteira;
    private List<Produto> sacola = new ArrayList<>();

    public Cliente(String nome, double carteira, List<Produto> sacola) {
        this.nome = nome;
        this.carteira = carteira;
        this.sacola = sacola;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCarteira() {
        return carteira;
    }

    public void setCarteira(double carteira) {
        this.carteira = carteira;
    }

    public List<Produto> getSacola() {
        return sacola;
    }

    public void setSacola(List<Produto> sacola) {
        this.sacola = sacola;
    }

    public boolean verificarSaldo(double valor){
        return this.carteira >= valor;
    }

    public void adicionarNaSacola(Produto p, int qtd){
        this.sacola.add(new Produto(p.getNome(), qtd, p.getValor()));
    }

    public String comprarProduto(Feirante feirante, String nomeProduto, int qtd){
        Produto p = feirante.buscarProdutoNaBarraca(nomeProduto);


        if (p == null) return "Produto não encontrado!";


        double custoTotal = p.calcularTotal(qtd);

        if (!verificarSaldo(custoTotal)) return "Saldo insuficiente!";

        if(p.reduzirEstoque(qtd)){
            this.carteira -= custoTotal;
            feirante.receberPagamento(custoTotal);
            adicionarNaSacola(p, qtd);
            feirante.atualizarEstoqueBarraca();
            return "Compra realiada com sucesso!";
        }

        return "Quantidade indisponível no estoque!";
    }
}
