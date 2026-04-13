package org.example.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import org.example.App;
import org.example.model.Cabeleireiro.Salao;
import org.example.model.Cabeleireiro.Servico;
import java.io.IOException;
import java.math.BigDecimal;

public class SalaoController {

    @FXML private Label labelUnidade;
    @FXML private Label labelColaboradores;
    @FXML private Label labelSaldo;

    // Instancia o modelo com os dados iniciais do seu projeto
    private Salao meuSalao = new Salao("Medusa Cabelos", new BigDecimal("1000.00"), 12);

    @FXML
    public void initialize() {
        atualizarInterface();
    }

    @FXML
    private void contratarColaborador() {
        meuSalao.alterarEquipe(1);
        atualizarInterface();
    }

    @FXML
    private void finalizarAtendimento() {
        Servico corte = new Servico("Corte", "Atendimento Padrão", new BigDecimal("50.00"));

        meuSalao.finalizarAtendimento(corte);
        atualizarInterface();
    }

    @FXML
    private void voltarDashboard() throws IOException {
        App.setRoot("dashboard");
    }

    private void atualizarInterface() {
        labelUnidade.setText("Unidade: Medusa Cabelos");
        labelColaboradores.setText("Colaboradores: " + meuSalao.getNumeroColaboradores());
        labelSaldo.setText("Saldo: R$ " + meuSalao.saldoTotal.toString());
    }
}