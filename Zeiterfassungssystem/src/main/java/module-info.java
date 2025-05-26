module org.lakdogan.zeiterfassungssystem {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.lakdogan.zeiterfassungssystem to javafx.fxml;
    exports org.lakdogan.zeiterfassungssystem;
}