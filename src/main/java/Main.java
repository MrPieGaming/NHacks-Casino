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

        // window.setScene();
        // window.setTitle();
        // window.setOnCloseRequest();
        // window.show();
    }
}
