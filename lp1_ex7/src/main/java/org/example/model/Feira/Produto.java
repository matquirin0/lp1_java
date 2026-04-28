package org.example.model.Feira;

public class Produto {
    private String nome;
    private int quantidade;
    private double valor;

    public Produto(String nome, int quantidade, double valor) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean reduzirEstoque(int qtd){
        if (this.quantidade >= qtd){
            this.quantidade -= qtd;
            return true;
        }
        return false;
    }

    public int adicionarEstoque(int qtd){
        return quantidade += qtd;
    }

    public double calcularTotal(int qtd){
        return this.valor * qtd;
    }

}
