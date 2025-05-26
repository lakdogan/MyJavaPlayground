package org.lakdogan.zeiterfassungssystemsingletonjavafx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class AppController {
    private final TimeTracker tracker = TimeTracker.getInstance();

    @FXML private Label labelStatus;

    @FXML
    public void onStart() {
        labelStatus.setText(tracker.start());
    }

    @FXML
    public void onPause() {
        labelStatus.setText(tracker.pause());
    }

    @FXML
    public void onWeiter() {
        labelStatus.setText(tracker.weiter());
    }

    @FXML
    public void onStop() {
        labelStatus.setText(tracker.stop());
    }
}
