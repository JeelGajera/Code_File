import javafx.application.Application;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Prac2 extends Application {
	public void start(Stage primaryStage) {
		Pane pane = new Pane();

		Text text = new Text("This is a Practical-9");
		pane.getChildren().add(text);

		PathTransition pt = new PathTransition(Duration.millis(10000), 
			new Line(-50, 50, 250, 50), text);
		pt.setCycleCount(Timeline.INDEFINITE);
		pt.play(); 

		pane.setOnMousePressed(e -> {
			pt.pause();
		});

		pane.setOnMouseReleased(e -> {
			pt.play();
		});
		Scene scene = new Scene(pane, 200, 100);
		primaryStage.setTitle("Practical-9-(2)"); 
		primaryStage.setScene(scene);
		primaryStage.show(); 
	}
    public static void main(String[] args) {
        Application.launch(args);
    }
}