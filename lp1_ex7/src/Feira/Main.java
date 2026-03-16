package Feira;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        {
            Cliente c1 = new Cliente("Adriana Jacinto", new BigDecimal("200.00"));
            Feirante f1 = new Feirante("Matheus Quirino", new BigDecimal("0.00"));

            Produto p1 = new Produto("Alface", 100, new BigDecimal("2.79"));
            Produto p4 = new Produto("Laranja", 100, new BigDecimal("1.00"));

            // 1. Prepara a banca
            f1.adicionarMercadoria(p1);
            f1.adicionarMercadoria(p4);

            f1.exibirExtratoF();
            c1.exibirExtrato();

            // 2. Realiza as compras (passando o f1 como você definiu na classe Cliente)
            c1.comprarProduto(p1, 5, f1);
            c1.comprarProduto(p4, 10, f1);

            // 3. Verifica o resultado
            c1.exibirExtrato();
            f1.exibirExtratoF();
        }
    }
}