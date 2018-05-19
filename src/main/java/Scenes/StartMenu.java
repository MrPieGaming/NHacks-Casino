package Scenes;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class StartMenu {

    public static Scene getScene() {
        Label title;
        Button howToPlay, casinoGames, aboutUs;

        title = new Label("Casino NHacks");
        title.setFont(Font.font("Helvetica", FontWeight.BOLD, 32 ));

        howToPlay = new Button();
        howToPlay.setText("How to Play");
        //howToPlay.setOnAction(e -> /*howToPlay Scene here*/);

        casinoGames = new Button();
        casinoGames.setText("Casino Games");
        //casinoGames.setOnAction(e -> /*casinoGames Scene here*/);

        aboutUs = new Button();
        aboutUs.setText("About us");
        //aboutUs.setOnAction(e -> /*aboutUs Scene here*/);

        VBox l1 = new VBox();
        l1.getChildren().addAll(title, casinoGames, howToPlay, aboutUs);
        l1.setAlignment(Pos.CENTER);
        l1.setMinSize(600, 600);
        l1.setMaxSize(1000,1000);
        l1.setSpacing(20);

        return new Scene(l1, 600, 600);
    }

    public static String getTitle() {
        return "NHacks Casino";
    }
}
