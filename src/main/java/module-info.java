module com.example.layoutsjavafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires graphicsLib;

    opens com.example.layoutsjavafx to javafx.fxml;
    exports com.example.layoutsjavafx;

}