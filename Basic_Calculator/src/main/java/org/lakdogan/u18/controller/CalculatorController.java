package org.lakdogan.u18.controller;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.stage.Stage;
import org.lakdogan.u18.logic.CalculatorService;

public class CalculatorController {
    @FXML
    private Label display;

    private final CalculatorService service = new CalculatorService();

    @FXML
    private void handleButtonPress(ActionEvent event) {
        String input = ((Button) event.getSource()).getText();
        String output = service.processInput(input);
        display.setText(output);
    }

    @FXML
    private void handleClose(ActionEvent event) {
        // Anwendung beenden
        Platform.exit();
    }

    @FXML
    private void handleMinimize(ActionEvent event) {
        Stage stage = (Stage) ((Button) event.getSource()).getScene().getWindow();
        stage.setIconified(true);
    }

    @FXML
    private void handleMaximize(ActionEvent event) {
        Stage stage = (Stage) ((Button) event.getSource()).getScene().getWindow();
        stage.setMaximized(!stage.isMaximized());
    }

}
