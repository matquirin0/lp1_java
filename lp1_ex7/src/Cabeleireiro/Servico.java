package Cabeleireiro;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Servico {
    private String tipoServico;
    private List<Produto> produtos = new ArrayList<>();
    private BigDecimal preco;

    public Servico(String tipoServico, String descricao, BigDecimal preco){
        this.tipoServico = tipoServico;
        this.preco = preco;
    }

    public void adicionarProduto(Produto p){
        this.produtos.add(p);
    }

    public void removerProduto(Produto p){
        this.produtos.remove(p);
    }

    public void calculoTotalServico(){

    }

}
