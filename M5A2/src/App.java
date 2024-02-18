/* Bailey Garrett
 * module 5 assignment 1 
 * 2/17/24 
 * Circle color change on mouse pressed and released 
 */
// add java fx library files to referenced libraries in java project tab
// click run at the top and add configurations
// copy paste last line of code in the launch.json file, the vmArgs command
// code goes into source folder file.
// have not figured out how to change the name of the app from App, doing so causes errors.

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        Circle circle = new Circle(100, Color.WHITE); // Create a white circle
        circle.setStroke(Color.BLACK); // Add a black border to the circle

        circle.setOnMousePressed(e -> circle.setFill(Color.BLACK)); // Change color to black when mouse is pressed
        circle.setOnMouseReleased(e -> circle.setFill(Color.WHITE)); // Change color to white when mouse is released

        // create pan and add circle to pane
        StackPane root = new StackPane();
        root.getChildren().add(circle);

        Scene scene = new Scene(root);
        primaryStage.setTitle("Color Circle");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
