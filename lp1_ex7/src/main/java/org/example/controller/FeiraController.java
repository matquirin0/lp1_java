package org.example.controller;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import org.example.App;
import org.example.model.Feira.*;

import java.io.IOException;
import java.util.ArrayList;

public class FeiraController {

    @FXML private TableView<Produto> tabelaBarraca;
    @FXML private TableColumn<Produto, String> colNomeBarraca;
    @FXML private TableColumn<Produto, Integer> colQtdBarraca;
    @FXML private TableColumn<Produto, Double> colPrecoBarraca;

    @FXML private TableView<Produto> tabelaSacola;
    @FXML private TableColumn<Produto, String> colNomeSacola;
    @FXML private TableColumn<Produto, Integer> colQtdSacola;
    @FXML private TableColumn<Produto, Double> colPrecoSacola;

    @FXML private Label lblCaixaFeirante;
    @FXML private Label lblCarteiraCliente;
    @FXML private Label lblStatus;
    @FXML private TextField txtQuantidade;

    private Feirante feirante;
    private Cliente cliente;

    @FXML
    public void initialize() {
        feirante = new Feirante("Seu João", 0.0, new ArrayList<>());
        cliente = new Cliente("Matheus", 100.0, new ArrayList<>());

        feirante.getBarraca().add(new Produto("Maçã", 10, 2.50));
        feirante.getBarraca().add(new Produto("Banana", 15, 1.80));
        feirante.getBarraca().add(new Produto("Pastel", 5, 8.00));

        colNomeBarraca.setCellValueFactory(new PropertyValueFactory<>("nome"));
        colQtdBarraca.setCellValueFactory(new PropertyValueFactory<>("quantidade"));
        colPrecoBarraca.setCellValueFactory(new PropertyValueFactory<>("valor"));

        colNomeSacola.setCellValueFactory(new PropertyValueFactory<>("nome"));
        colQtdSacola.setCellValueFactory(new PropertyValueFactory<>("quantidade"));
        colPrecoSacola.setCellValueFactory(new PropertyValueFactory<>("valor"));

        atualizarTela();
    }

    @FXML
    private void handleComprar() {
        Produto selecionado = tabelaBarraca.getSelectionModel().getSelectedItem();

        if (selecionado == null) {
            lblStatus.setText("Selecione um produto na tabela!");
            return;
        }

        try {
            int qtd = Integer.parseInt(txtQuantidade.getText());
            String resultado = cliente.comprarProduto(feirante, selecionado.getNome(), qtd);

            lblStatus.setText(resultado);
            atualizarTela();

        } catch (NumberFormatException e) {
            lblStatus.setText("Quantidade inválida!");
        }
    }

    @FXML
    private void handleReporEstoque() {
        Produto selecionado = tabelaBarraca.getSelectionModel().getSelectedItem();
        if (selecionado != null) {
            selecionado.adicionarEstoque(5);
            lblStatus.setText("Reposto 5 unidades de " + selecionado.getNome());
            atualizarTela();
        }
    }

    private void atualizarTela() {
        tabelaBarraca.setItems(FXCollections.observableArrayList(feirante.getBarraca()));
        tabelaSacola.setItems(FXCollections.observableArrayList(cliente.getSacola()));

        lblCaixaFeirante.setText(String.format("Caixa Feirante: R$ %.2f", feirante.getCaixa()));
        lblCarteiraCliente.setText(String.format("Sua Carteira: R$ %.2f", cliente.getCarteira()));

        tabelaBarraca.refresh();
        tabelaSacola.refresh();
    }

    @FXML
    private void voltarDashboard() throws IOException {
        App.setRoot("dashboard");
    }
}