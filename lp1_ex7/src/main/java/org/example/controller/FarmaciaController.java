package org.example.controller;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import org.example.App;
import org.example.model.Farmacia.ArCondicionado;
import org.example.model.Farmacia.Remedio;
import java.io.IOException;

public class FarmaciaController {

    @FXML private Label labelTemperatura;
    @FXML private Label labelStatusVenda;
    @FXML private Label labelTotalCarrinho;
    @FXML private CheckBox checkReceita;

    private ArCondicionado ar = new ArCondicionado("LG", 24);
    private Remedio amoxicilina = new Remedio("Amoxicilina", 120.0, true);
    private Remedio dipirona = new Remedio("Dipirona", 15.0, false);
    private Remedio paracetamol = new Remedio("Paracetamol", 20.0, false);

    private double totalCarrinho = 0.0;

    @FXML
    public void initialize() {
        atualizarInterfaceAr();
        atualizarInterfaceVenda();
    }

    @FXML
    private void onToggleAr() {
        ar.ligarAr();
        atualizarInterfaceAr();
    }

    @FXML
    private void onAumentarTemp() {
        ar.aumentarTemperatura(1);
        atualizarInterfaceAr();
    }

    @FXML
    private void onDiminuirTemp() {
        ar.diminuirTemperatura(1);
        atualizarInterfaceAr();
    }

    @FXML
    private void adicionarAmoxicilina() {
        if (amoxicilina.validarVenda(checkReceita.isSelected())) {
            totalCarrinho += amoxicilina.getPreco();
            labelStatusVenda.setText("Amoxicilina adicionada.");
        } else {
            labelStatusVenda.setText("ERRO: Receita obrigatória!");
        }
        atualizarInterfaceVenda();
    }

    @FXML
    private void adicionarDipirona() {
        if (dipirona.validarVenda(checkReceita.isSelected())) {
            totalCarrinho += dipirona.getPreco();
            labelStatusVenda.setText("Dipirona adicionada.");
        }
        atualizarInterfaceVenda();
    }

    @FXML
    private void adicionarParacetamol() {
        if (paracetamol.validarVenda(checkReceita.isSelected())) {
            totalCarrinho += paracetamol.getPreco();
            labelStatusVenda.setText("Paracetamol adicionado.");
        }
        atualizarInterfaceVenda();
    }

    @FXML
    private void onFinalizarVenda() {
        labelStatusVenda.setText("Venda concluída: R$ " + String.format("%.2f", totalCarrinho));
        totalCarrinho = 0.0;
        atualizarInterfaceVenda();
    }

    private void atualizarInterfaceAr() {
        labelTemperatura.setText(ar.getTemperatura() + " ºC");
    }

    private void atualizarInterfaceVenda() {
        labelTotalCarrinho.setText("Total: R$ " + String.format("%.2f", totalCarrinho));
    }

    @FXML
    private void voltarDashboard() throws IOException {
        App.setRoot("dashboard");
    }
}