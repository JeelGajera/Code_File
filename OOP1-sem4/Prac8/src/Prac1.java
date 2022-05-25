import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.text.*;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Prac1 extends Application {
    public void start(Stage primaryStage) {
        HBox hBox = new HBox(10);
        hBox.setPadding(new Insets(10, 15, 10, 15));
        hBox.setAlignment(Pos.CENTER);

        int i = 1;
        while(i < 6) {
            Text text = new Text("Java-" + i);
            text.setFont(Font.font("Times Roman", FontWeight.BOLD, FontPosture.ITALIC, 22 ));
            text.setRotate(90);
            text.setFill(new Color(Math.random(), Math.random(), Math.random(), (i/10 + 0.5)));
            hBox.getChildren().add(text);
            i++;
        }
        Scene newScene = new Scene(hBox, 300, 100);
        primaryStage.setTitle("Practical-8-(1)");
        primaryStage.setScene(newScene);
        primaryStage.show(); 
    }

    public static void main(String[] args) throws Exception {
        Application.launch(args);
    }
}
