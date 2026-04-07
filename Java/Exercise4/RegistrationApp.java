/*
VSCODE TERMINAL RUN COMMANDS
javac --module-path "C:\Users\BVC\Downloads\openjfx-11_windows-x64_bin-sdk\javafx-sdk-11\lib" --add-modules javafx.controls RegistrationApp.java
java --module-path "C:\Users\BVC\Downloads\openjfx-11_windows-x64_bin-sdk\javafx-sdk-11\lib" --add-modules javafx.controls RegistrationApp
*/

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.text.Font;

public class RegistrationApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        VBox vbox = new VBox();
        vbox.setPadding(new Insets(20));
        vbox.setSpacing(10);

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20));
        grid.setVgap(10);
        grid.setHgap(10);

        Label label = new Label("Student Name");
        label.setFont(new Font("Arial", 16));
        label.setTextFill(Color.BLACK);

        TextField inputName = new TextField();
        inputName.setPrefWidth(200);

        Label label2 = new Label("Course Code");
        label2.setFont(new Font("Arial", 16));
        label2.setTextFill(Color.BLACK);

        ComboBox<String> comboBox = new ComboBox<>();
        comboBox.getItems().addAll("CMP 269", "CMP 334", "CMP 338");
        comboBox.setPrefWidth(200);

        grid.add(label, 0, 0);
        grid.add(inputName, 1, 0);
        grid.add(label2, 0, 1);
        grid.add(comboBox, 1, 1);

        Button register = new Button("Register!");

        Label status = new Label("Status: ");
        status.setFont(new Font("Arial", 16));
        status.setTextFill(Color.BLACK);

        register.setOnAction(event -> {
            String name = inputName.getText();
            String course = comboBox.getValue();
            status.setText("Registration successful for " + name + " in " + course + "!");

        });

        vbox.getChildren().add(grid);
        vbox.getChildren().add(register);
        vbox.getChildren().add(status);

        Scene scene = new Scene(vbox, 400, 250);
        primaryStage.setTitle("Lehman Course Registration");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
