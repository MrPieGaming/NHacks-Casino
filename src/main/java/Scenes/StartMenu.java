package Scenes;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
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

        
    }

}
