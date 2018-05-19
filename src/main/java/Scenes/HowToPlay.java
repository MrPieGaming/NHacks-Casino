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

        Label label2 = new Label("\n\n1. Blackjack");
        label2.setFont(Font.font("Helvetica", FontWeight.BOLD, 24));

        Label label3 = new Label("Objective: ");
        label3.setFont(Font.font("Helvetica", FontPosture.ITALIC, 20));

        Label label4 = new Label("Obtain a hand of cards that has a sum higher than your opponent but less than or equal to 21. If the sum is over 21, you bust.");
        label4.setWrapText(true);
        //label4.setLineSpacing(10);

        Label label5 = new Label("\n\n2. Dice");
        label5.setFont(Font.font("Helvetica", FontWeight.BOLD, 24));

        Label label6 = new Label("Objective: ");
        label6.setFont(Font.font("Helvetica", FontPosture.ITALIC, 20));

        Label label7 = new Label("Predict a number from 1 to 6 that you think the dice will land on");


        return null;
    }
}
