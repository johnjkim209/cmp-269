import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ChatApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Chat App");
        primaryStage.setWidth(600);
        primaryStage.setHeight(400);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}