import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.layout.StackPane;
import javafx.geometry.Pos;
import javafx.scene.text.Text;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.geometry.Insets;

public class Prac2 extends Application {
    public Paint activeColor;

    public void start(Stage primaryStage) {
        HBox hBox = new HBox(15);
        hBox.setAlignment(Pos.BOTTOM_CENTER);

        String[] domain = { "Project", "Quiz", "Midterm", "Final" };
        double[] grade = { 20, 10, 30, 40 };

        double max = getMax(grade);
        double height = 200;
        double width = 150;

        StackPane pane = new StackPane();
        pane.setPadding(new Insets(10, 5, 10, 5));
      
        for (int i = 0; i < 4; i++) {
            switch (i) {
                case 0:
                    activeColor = (Color.RED);
                    break;
                case 1:
                    activeColor = (Color.BLUE);
                    break;
                case 2:
                    activeColor = (Color.GREEN);
                    break;
                case 3:
                    activeColor = (Color.ORANGE);
                    break;
                default:
                    break;
            }
            Rectangle tempRact = new Rectangle(0, 0, width, height * grade[i] / max);
            tempRact.setFill(activeColor);
            Text text = new Text(0, 0, domain[i] + "---" + grade[i] + "%");
            hBox.getChildren().add(getVBox(text, tempRact));
        }
        
        pane.getChildren().add(hBox);
        Scene scene = new Scene(pane);
        primaryStage.setTitle("Practical-8-(2)");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public VBox getVBox(Text text, Rectangle ract) {
        VBox vBox = new VBox(5);
        vBox.setAlignment(Pos.BOTTOM_LEFT);
        vBox.getChildren().addAll(text, ract);
        return vBox;
    }

    public double getMax(double[] arr) {
        double max = arr[0];
        int i = 0;
        while (i < arr.length) {
            if (arr[i] > max)
                max = arr[i];
            i++;
        }
        return max;
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}