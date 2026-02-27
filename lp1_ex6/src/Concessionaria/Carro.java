package Concessionaria;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private double preco;
    private boolean isNovo;

    // Construtor
    public Carro(String marca, String modelo, int ano, double preco, boolean isNovo) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
        this.isNovo = isNovo;
    }

    // Métodos
    public void aplicarDesconto(double porcentagem) {
        this.preco -= this.preco * (porcentagem / 100);
        System.out.println("Novo preço com desconto: R$ " + this.preco);
    }

    public void exibirDetalhes() {
        System.out.println("Veículo: " + marca + " " + modelo + " (" + ano + ")");
        System.out.println("Condição: " + (isNovo ? "Zero KM" : "Seminovo"));
    }
}