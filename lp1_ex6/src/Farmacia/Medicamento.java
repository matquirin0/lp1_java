package Farmacia;

public class Medicamento {
    private String nome;
    private String principioAtivo;
    private double preco;
    private boolean precisaReceita;
    private int estoque;

    // Construtor
    public Medicamento(String nome, String principioAtivo, double preco, boolean precisaReceita, int estoque) {
        this.nome = nome;
        this.principioAtivo = principioAtivo;
        this.preco = preco;
        this.precisaReceita = precisaReceita;
        this.estoque = estoque;
    }

    // Métodos
    public void vender(int quantidade) {
        if (estoque >= quantidade) {
            this.estoque -= quantidade;
            System.out.println("Venda realizada: " + quantidade + " unidades de " + nome);
        } else {
            System.out.println("Estoque insuficiente para " + nome);
        }
    }

    public void verificarAlertaReceita() {
        if (precisaReceita) {
            System.out.println("ATENÇÃO: Este medicamento exige retenção de receita!");
        }
    }
}