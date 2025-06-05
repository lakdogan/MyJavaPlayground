module org.lakdogan.u18 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.lakdogan.u18 to javafx.fxml;
    exports org.lakdogan.u18;
    exports org.lakdogan.u18.controller;
    opens org.lakdogan.u18.controller to javafx.fxml;
}