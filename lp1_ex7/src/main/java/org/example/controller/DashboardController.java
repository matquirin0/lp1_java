package org.example.controller;

import javafx.fxml.FXML;
import org.example.App;
import java.io.IOException;

public class DashboardController {

    @FXML
    private void entrarFeira() throws IOException {
        App.setRoot("feira");
    }

    @FXML
    private void entrarSalao() throws IOException {
        App.setRoot("salao");
    }

    @FXML
    private void entrarFarmacia() throws IOException {
        App.setRoot("farmacia");
    }

    @FXML
    private void sair() {
        System.exit(0);
    }
}