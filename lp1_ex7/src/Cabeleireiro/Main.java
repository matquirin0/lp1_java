package Cabeleireiro;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Salao meuSalao = new Salao("Medusa Cabelos", new BigDecimal("1000.00"), 12);

        Produto shampoo = new Produto("Shampoo Pós-Química", 10, new BigDecimal("25.50"));
        Produto mascara = new Produto("Máscara de Hidratação Profunda", 5, new BigDecimal("45.00"));
        Produto ampola = new Produto("Ampola de Vitaminas", 20, new BigDecimal("15.00"));

        Servico hidratacao = new Servico("Hidratação Completa", "Tratamento capilar intensivo", new BigDecimal("80.00"));

        // Adicionando os produtos ao serviço
        hidratacao.adicionarProduto(shampoo);
        hidratacao.adicionarProduto(mascara);
        hidratacao.adicionarProduto(ampola);

        // Demonstrando os métodos de negócio
        System.out.println("--- Início do Atendimento ---");

        // Exibindo o estado inicial da unidade
        meuSalao.exibirRelatórioUnidade();
        System.out.println("-----------------------------");

        // Realizando a reposição de estoque de um item
        ampola.reporEstoque(5);

        // Finalizando o atendimento
        meuSalao.finalizarAtendimento(hidratacao);

        System.out.println("-----------------------------");

        // 6. Alterando a equipe (Simulando a contratação de 2 novos funcionários)
        meuSalao.alterarEquipe(2);

        // 7. Exibindo o relatório final após as movimentações
        System.out.println("--- Relatório de Fechamento ---");
        meuSalao.exibirRelatórioUnidade();

        // Verificando o custo total do item específico para auditoria
        System.out.println("Valor total em estoque do Shampoo: R$ " + shampoo.totalProduto());
    }
}