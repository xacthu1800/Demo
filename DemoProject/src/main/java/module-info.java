module com.mycompany.demoproject {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.demoproject to javafx.fxml;
    exports com.mycompany.demoproject;
}
    

