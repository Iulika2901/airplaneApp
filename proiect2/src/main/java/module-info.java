module org.example.proiect2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens org.example.proiect2 to javafx.fxml;
    exports org.example.proiect2;
}