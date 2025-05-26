module org.lakdogan.zeiterfassungssystemsingletonjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.lakdogan.zeiterfassungssystemsingletonjavafx to javafx.fxml;
    exports org.lakdogan.zeiterfassungssystemsingletonjavafx;
}