package org.example.proiect2;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Controller {

    @FXML
    private TextField departmentIdField;

    @FXML
    private Button searchButton;

    @FXML
    private TableView<Employee> employeeTable;

    @FXML
    private TableColumn<Employee, String> lastNameColumn;

    @FXML
    private TableColumn<Employee, String> firstNameColumn;

    @FXML
    private TableColumn<Employee, Double> salaryColumn;

    @FXML
    public void initialize() {
        lastNameColumn.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        firstNameColumn.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        salaryColumn.setCellValueFactory(new PropertyValueFactory<>("salary"));
    }

    @FXML
    private void searchEmployees() {
        ObservableList<Employee> employees = FXCollections.observableArrayList();

        try (Connection connection = DatabaseConnection.getConnection()) {
            String query = "SELECT last_name, first_name, salary FROM employees WHERE department_id = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, Integer.parseInt(departmentIdField.getText()));
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                employees.add(new Employee(
                        resultSet.getString("last_name"),
                        resultSet.getString("first_name"),
                        resultSet.getDouble("salary")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        employeeTable.setItems(employees);
    }
}