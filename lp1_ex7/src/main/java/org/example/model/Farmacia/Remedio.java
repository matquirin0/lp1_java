package org.example.model.Farmacia;

public class Remedio {
    private String nome;
    private double preco;
    private boolean pedeReceita;

    public Remedio(String nome, double preco, boolean pedeReceita){
        this.nome = nome;
        this.preco = preco;
        this.pedeReceita = pedeReceita;
    }

    public String getNome(){
        return nome;
    }

    public double getPreco(){
        return preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public double desconto(double preco){
        if (preco > 100){
            return preco * 0.7;
        }
        else if (preco > 50){
            return preco * 0.8;
        }
        else
            return preco;
    }

    public boolean validarVenda(boolean clienteTrouxeReceita) {
        if (this.pedeReceita) {
            return clienteTrouxeReceita;
        }
        return true;
    }

    public void realizarVenda(boolean temReceita) {
        if (validarVenda(temReceita)) {
            System.out.println("Venda do medicamento " + this.nome + " realizada!");
        } else {
            System.out.println("ALERTA: " + this.nome + " exige retenção de receita.");
        }
    }

    public boolean podeVender(boolean temReceita) {
        if (this.pedeReceita) {
            return temReceita;
        }
        return true;
    }


}
