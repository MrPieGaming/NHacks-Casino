import Boxes.ConfirmBox;
import Scenes.StartMenu;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    private Scene startMenu;
    private Stage window;

    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;

        startMenu = StartMenu.getScene();

        window.setScene(startMenu);
        window.setTitle(StartMenu.getTitle());
        window.setOnCloseRequest(e -> {
            e.consume();
            closeProgram();
        });
        window.show();
    }

    private void closeProgram() {
        boolean answer = ConfirmBox.display("Exit Window", "Are you sure you want to exit?");

        if (answer) {
            System.out.println("Closing application...");
            window.close();
        }
    }
}
