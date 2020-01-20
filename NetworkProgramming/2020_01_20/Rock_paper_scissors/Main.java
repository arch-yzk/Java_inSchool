import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application
{
    public void start(Stage stage)
    {
        stage.setWidth(800);
        stage.setHeight(600);
        
        Button button1 = new Button("Top");
        Button button2 = new Button("Left1");
        Button button3 = new Button("Left2");
        Button button4 = new Button("Left3");
        Button button5 = new Button("Right");
        Button button6 = new Button("Bottom");
        button1.setPrefSize(400, 300);
        button2.setPrefSize(75, 75);
        button3.setPrefSize(75, 75);
        button4.setPrefSize(75, 75);
        button5.setPrefSize(150, 150);
        button6.setPrefSize(400, 100);

        button2 = new Button("",new ImageView(new Image("Images/Rock.gif")));
        button3 = new Button("",new ImageView(new Image("Images/Scissors.png")));
        button4 = new Button("",new ImageView(new Image("Images/Paper.jpeg")));

        root.getChildren().addAll(button1, button2, button3, button4, button5, button6);

        Scene scene = new Scene(root);

        stage.setScene(scene);

        stage.show();
    }
    public static void main(String[] args)
    {
        launch();
    }
}