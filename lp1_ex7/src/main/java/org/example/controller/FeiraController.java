package org.example.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import org.example.App;
import org.example.model.Feira.Cliente;
import org.example.model.Feira.Feirante;
import org.example.model.Feira.Produto;
import java.io.IOException;
import java.math.BigDecimal;

public class FeiraController {

    @FXML private Label labelCaixaFeirante;
    @FXML private Label labelSaldoCliente;

    // Modelos instanciados
    private Feirante feirante = new Feirante("Matheus Quirino", BigDecimal.ZERO);
    private Cliente cliente = new Cliente("Adriana Jacinto", new BigDecimal("200.00"));

    // Os 3 produtos solicitados
    private Produto alface = new Produto("Alface", 50, new BigDecimal("2.79"));
    private Produto tomate = new Produto("Tomate", 30, new BigDecimal("5.50"));
    private Produto banana = new Produto("Banana", 40, new BigDecimal("4.20"));

    @FXML
    public void initialize() {
        feirante.adicionarMercadoria(alface);
        feirante.adicionarMercadoria(tomate);
        feirante.adicionarMercadoria(banana);
        atualizarInterface();
    }

    // Ações de COMPRA
    @FXML private void comprarAlface() { processarAcao(alface, true); }
    @FXML private void comprarTomate() { processarAcao(tomate, true); }
    @FXML private void comprarBanana() { processarAcao(banana, true); }

    // Ações de DEVOLUÇÃO (Retirar por engano)
    @FXML private void devolverAlface() { processarAcao(alface, false); }
    @FXML private void devolverTomate() { processarAcao(tomate, false); }
    @FXML private void devolverBanana() { processarAcao(banana, false); }

    private void processarAcao(Produto p, boolean isCompra) {
        if (isCompra) {
            if (p.temEstoqueSuficiente(1) && cliente.temSaldo(p.getValorProduto())) {
                cliente.comprarProduto(p, 1, feirante);
            }
        } else {
            // Lógica de estorno: Cliente devolve o produto e o dinheiro retorna
            cliente.devolverProduto(p, 1, feirante);
        }
        atualizarInterface();
    }

    private void atualizarInterface() {
        labelCaixaFeirante.setText("Caixa: R$ " + feirante.getCaixa());
        labelSaldoCliente.setText("Saldo: R$ " + cliente.getSaldo());
    }

    @FXML
    private void voltarDashboard() throws IOException {
        App.setRoot("dashboard");
    }
}