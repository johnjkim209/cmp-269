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
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.text.Font;

public class RegistrationApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20));
        grid.setVgap(10);
        grid.setHgap(10);


        Label label = new Label("hello world");
        label.setFont(new Font("Arial", 24));
        label.setTextFill(Color.BLACK);

        grid.add(label, 0, 0);

        // TODO: Create Labels and TextFields
        // TODO: Create the Register Button
        // TODO: Implement the Button Action using a Lambda




        Scene scene = new Scene(grid, 400, 250);
        primaryStage.setTitle("Lehman Course Registration");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
