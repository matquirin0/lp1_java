package org.example.model.Farmacia;

public class Produto {
    private String codBarra;
    private String nome;
    private double preco;

    public Produto(String codBarra, String nome, double Preco){
        this.codBarra = codBarra;
        this.nome = nome;
        this.preco = preco;
    }

    public double GetPreco(){
        return preco;
    }

    public void setCodBarra(String codBarra) {
        this.codBarra = codBarra;
    }
}
