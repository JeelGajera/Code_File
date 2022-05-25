import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;
import java.util.ArrayList;

public class Prac3 extends Application {
    
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        ArrayList<Shape> shapes = new ArrayList<>();

        Rectangle upper = new Rectangle(0,0, Color.TRANSPARENT);
        upper.setStroke(Color.BLACK);
        upper.xProperty().bind(pane.widthProperty().divide(4).add(25));
        upper.yProperty().bind(pane.heightProperty().divide(4).subtract(25));
        upper.widthProperty().bind(pane.widthProperty().divide(2));
        upper.heightProperty().bind(pane.heightProperty().divide(2));
        shapes.add(upper);

        Rectangle lower = new Rectangle(0,0, Color.TRANSPARENT);
        lower.setStroke(Color.BLACK);
        lower.xProperty().bind(pane.widthProperty().divide(4).subtract(25));
        lower.yProperty().bind(pane.heightProperty().divide(4).add(25));
        lower.widthProperty().bind(pane.widthProperty().divide(2));
        lower.heightProperty().bind(pane.heightProperty().divide(2));
        shapes.add(lower);

        Line ul = new Line();
        ul.startXProperty().bind(upper.xProperty());
        ul.startYProperty().bind(upper.yProperty());
        ul.endXProperty().bind(lower.xProperty());
        ul.endYProperty().bind(lower.yProperty());
        shapes.add(ul);

        Line ur = new Line();
        ur.startXProperty().bind(upper.xProperty().add(upper.widthProperty()));
        ur.startYProperty().bind(upper.yProperty());
        ur.endXProperty().bind(lower.xProperty().add(lower.widthProperty()));
        ur.endYProperty().bind(lower.yProperty());
        shapes.add(ur);

        Line ll = new Line();
        ll.startXProperty().bind(upper.xProperty());
        ll.startYProperty().bind(upper.yProperty().add(upper.heightProperty()));
        ll.endXProperty().bind(lower.xProperty());
        ll.endYProperty().bind(lower.yProperty().add(lower.heightProperty()));
        shapes.add(ll);

        Line lr = new Line();
        lr.startXProperty().bind(upper.xProperty().add(upper.widthProperty()));
        lr.startYProperty().bind(upper.yProperty().add(upper.heightProperty()));
        lr.endXProperty().bind(lower.xProperty().add(lower.widthProperty()));
        lr.endYProperty().bind(lower.yProperty().add(lower.heightProperty()));
        shapes.add(lr);

        pane.getChildren().addAll(shapes);
        Scene scene = new Scene(pane, 400, 400);
        scene.xProperty().add(scene.yProperty());
        primaryStage.setTitle("Practical-8-(3)");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
