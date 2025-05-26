package org.lakdogan.zeiterfassungssystemsingletonjavafx;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeTracker {
    private static TimeTracker instance;
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

    private LocalDateTime startZeit;
    private LocalDateTime pauseStart;
    private Duration pauseGesamt = Duration.ZERO;
    private boolean isRunning = false;
    private boolean isPaused = false;

    private TimeTracker() {}

    public static TimeTracker getInstance() {
        if (instance == null) {
            instance = new TimeTracker();
        }
        return instance;
    }

    public String start() {
        if (!isRunning) {
            startZeit = LocalDateTime.now();
            pauseGesamt = Duration.ZERO;
            isRunning = true;
            isPaused = false;
            return "Gestartet um " + startZeit.format(formatter);
        }
        return "Schon gestartet.";
    }

    public String pause() {
        if (isRunning && !isPaused) {
            pauseStart = LocalDateTime.now();
            isPaused = true;
            return "Pause gestartet um " + pauseStart.format(formatter);
        }
        return "Pause nicht möglich.";
    }

    public String weiter() {
        if (isRunning && isPaused) {
            Duration pause = Duration.between(pauseStart, LocalDateTime.now());
            pauseGesamt = pauseGesamt.plus(pause);
            isPaused = false;
            long pH = pauseGesamt.toHours();
            long pM = pauseGesamt.toMinutes() % 60;
            return "Weiter. Pause gesamt: " + pH + "h " + pM + "min";
        }
        return "Keine aktive Pause.";
    }

    public String stop() {
        if (isRunning) {
            if (isPaused)
                weiter();
            Duration dauer = Duration.between(startZeit, LocalDateTime.now()).minus(pauseGesamt);
            long h = dauer.toHours();
            long m = dauer.toMinutes() % 60;
            isRunning = false;
            return "Gesamte Arbeitszeit: " + h + "h " + m + "min";
        }
        return "Nicht gestartet.";
    }
}
