package org.lakdogan.zeiterfassungssystem;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AppController {
    private final DateTimeFormatter zeitFormat = DateTimeFormatter.ofPattern("HH:mm");

    @FXML private Button btnStart;
    @FXML private Button btnPause;
    @FXML private Button btnWeiter;
    @FXML private Button btnStop;
    @FXML private Label labelStatus;

    private LocalDateTime startZeit;
    private LocalDateTime pauseStart;
    private Duration pauseGesamt = Duration.ZERO;
    private boolean isRunning = false;
    private boolean isPaused = false;

    @FXML
    public void onStart() {
        if (!isRunning) {
            startZeit = LocalDateTime.now();
            pauseGesamt = Duration.ZERO;
            isRunning = true;
            isPaused = false;
            labelStatus.setText("Gestartet um " + startZeit.format(zeitFormat));
        } else {
            labelStatus.setText("Schon gestartet. ");
        }
    }

    @FXML
    public void onPause() {
        if (isRunning && !isPaused) {
            pauseStart = LocalDateTime.now();
            isPaused = true;
            labelStatus.setText("Pause gestartet um " + pauseStart.format(zeitFormat));
        } else {
            labelStatus.setText("Nicht möglich.");
        }
    }

    @FXML
    public void onWeiter() {
        if (isRunning && isPaused) {
            Duration pause = Duration.between(pauseStart, LocalDateTime.now());
            pauseGesamt = pauseGesamt.plus(pause);
            isPaused = false;
            labelStatus.setText("Weiter. Pause gesamt: " + pauseGesamt.toMinutes() + " Min.");
        } else {
            labelStatus.setText("Keine aktive Pause.");
        }
    }

    @FXML
    public void onStop() {
        if (isRunning) {
            if (isPaused)
                onWeiter();
            Duration dauer = Duration.between(startZeit, LocalDateTime.now()).minus(pauseGesamt);
            long stunden = dauer.toHours();
            long minuten = dauer.toMinutes() % 60;
            isRunning = false;
            labelStatus.setText("Gesamte Arbeitszeit: " + stunden + "h " + minuten + "min");
        } else {
            labelStatus.setText("Nicht  gestartet.");
        }
    }
}