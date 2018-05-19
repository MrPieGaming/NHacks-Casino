import Boxes.ConfirmBox;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    private Scene startMenu, howToPlay;
    private static Stage window;

    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;

        startMenu = StartMenu.getScene();
        howToPlay = HowToPlay.getScene();

        window.setScene(startMenu);
        window.setTitle(StartMenu.getTitle()); // this is a test comment testing out github on pranav's account
        window.setOnCloseRequest(e -> {
            e.consume();
            closeProgram();
        });
        window.show();

        // window.setScene();
        // window.setTitle();
        // window.setOnCloseRequest();
        // window.show();
    }

    private void closeProgram() {
        boolean answer = ConfirmBox.display("Exit Window", "Are you sure you want to exit?");

        if (answer) {
            System.out.println("Closing application...");
            window.close();
        }
    }

    public static Stage getStage() {
        return window;
    }
}