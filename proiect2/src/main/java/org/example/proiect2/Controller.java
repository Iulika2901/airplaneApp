package org.example.proiect2;

import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class Controller {

    @FXML
    private TableView<?> employeeTable;
    @FXML
    private TableColumn<?, ?> lastNameColumn;
    @FXML
    private TableColumn<?, ?> firstNameColumn;
    @FXML
    private TableColumn<?, ?> salaryColumn;

    @FXML
    private void handleQuery1() {
        // Codul pentru interogarea 1
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Interogarea 1");
        alert.setHeaderText("Rezultate");
        alert.setContentText("Aici sunt rezultatele pentru interogarea 1:");
        alert.showAndWait();
    }

    @FXML
    private void handleQuery2() {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Interogare 2");
        alert.setHeaderText("Rezultate");
        alert.setContentText("Aici sunt rezultatele pentru interogare 2:");
        alert.showAndWait();
    }

    @FXML
    private void searchEmployees() {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Interogare 3");
        alert.setHeaderText("Rezultate");
        alert.setContentText("Aici sunt rezultatele pentru interogare 3:");
        alert.showAndWait();
    }


    // Metoda pentru a treia interogare
    @FXML
    private void handleQuery3() {
        // Codul pentru interogarea 4

        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Interogare 4");
        alert.setHeaderText("Rezultate");
        alert.setContentText("Aici sunt rezultatele pentru interogare 4:");
        alert.showAndWait();
    }
}
