package org.example.model.Feira;

import java.util.ArrayList;
import java.util.List;

public class Feirante {
    private String nome;
    private double caixa;
    private List<Produto> barraca = new ArrayList<>();

    public Feirante(String nome, double caixa, List<Produto> barraca) {
        this.nome = nome;
        this.caixa = caixa;
        this.barraca = barraca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCaixa() {
        return caixa;
    }

    public void setCaixa(double caixa) {
        this.caixa = caixa;
    }

    public List<Produto> getBarraca() {
        return barraca;
    }

    public void setBarraca(List<Produto> barraca) {
        this.barraca = barraca;
    }

    public Produto buscarProdutoNaBarraca (String nome){
        for (Produto p: barraca){
            if (p.getNome().equalsIgnoreCase(nome)) {
                return p;
            }
        }
        return null;
    }

    public void receberPagamento(double valor){
        this.caixa += valor;
    }

    public void atualizarEstoqueBarraca(){
        for (int i = 0; i < barraca.size(); i++){
            Produto p = barraca.get(i);
            if (p.getQuantidade() <= 0){
                barraca.remove(i);
                i--;
            }
        }
    }

}
