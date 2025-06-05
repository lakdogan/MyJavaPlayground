module org.lakdogan.quizapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires java.sql;

    opens org.lakdogan.quizapp to javafx.fxml;
    exports org.lakdogan.quizapp;
}

