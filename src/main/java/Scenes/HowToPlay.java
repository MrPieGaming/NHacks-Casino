package Scenes;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

public class HowToPlay {

    public static Scene getScene() {
        Label label1 = new Label("Every new player begins with 500 credits");
        label1.setFont(Font.font("Helvetica", FontPosture.ITALIC, 20);

        Label label2 = new Label("1. Blackjack");
        label2.setFont(Font.font("Helvetica", FontWeight.BOLD, 24));

        Label label3 = new Label("Objective: ");
        label3.setFont(Font.font("Helvetica", FontPosture.ITALIC, 20));
    }
}
