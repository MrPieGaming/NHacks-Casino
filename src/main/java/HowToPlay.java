import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

public class HowToPlay { // add a back button

    public static Scene getScene() {
        Label label1 = new Label("Every new player begins with 500 credits");
        label1.setFont(Font.font("Helvetica", FontPosture.ITALIC, 20));

        Label label2 = new Label("1. Blackjack");
        label2.setFont(Font.font("Helvetica", FontWeight.BOLD, 24));

        Label label3 = new Label("Objective: ");
        label3.setFont(Font.font("Helvetica", FontPosture.ITALIC, 20));

        Label label4 = new Label("Obtain a hand of cards that has a sum higher than your opponent but less than or equal to 21. If the sum is over 21, you bust.");
        label4.setFont(Font.font("Helvetica", 20));
        label4.setWrapText(true);
        label4.setLineSpacing(10);

        Label label5 = new Label("2. Dice");
        label5.setFont(Font.font("Helvetica", FontWeight.BOLD, 24));

        Label label6 = new Label("Objective: ");
        label6.setFont(Font.font("Helvetica", FontPosture.ITALIC, 20));

        Label label7 = new Label("Predict a number from 1 to 6 that you think the dice will land on");
        label7.setFont(Font.font("Helvetica", 20));
        label7.setWrapText(true);
        label7.setLineSpacing(10);

        Label label8 = new Label("3.Coin Flip");
        label8.setFont(Font.font("Helvetica", FontWeight.BOLD, 24));

        Label label9 = new Label("Objective: ");
        label9.setFont(Font.font("Helvetica", FontPosture.ITALIC, 20));

        Label label10 = new Label("Place a bet on one side of a coin. If you're correct, then you'll receive your bet doubled. If you're wrong, you loose your bet.");
        label10.setFont(Font.font("Helvetica", 20));
        label10.setWrapText(true);
        label10.setLineSpacing(10);

        VBox layout = new VBox();
        layout.getChildren().addAll(label1, label2, label3, label4, label5, label6, label7, label8, label9, label10);
        layout.setAlignment(Pos.CENTER_LEFT);
        layout.setMinSize(600, 600);
        layout.setMaxSize(1000, 1000);
        layout.setSpacing(20);

        return new Scene(layout, 600, 600);
    }
}
