import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Main extends Application
{
    RadioButton radioButton1;
    RadioButton radioButton2;
    RadioButton radioButton3;
    ToggleGroup toggleGroup;
    Image image;
    ImageView imageView;
    Button button;
    Stage stage;
    TextArea textArea;
    TextField textField;

    public void start(Stage stage)
    {
        stage.setWidth(1200);
        stage.setHeight(900);

        radioButton1 = new RadioButton("グー");
		radioButton2 = new RadioButton("チョキ");
		radioButton3 = new RadioButton("パー");
		toggleGroup = new ToggleGroup();
		radioButton1.setToggleGroup(toggleGroup);
		radioButton2.setToggleGroup(toggleGroup);
		radioButton3.setToggleGroup(toggleGroup);
        radioButton1.setSelected(true);
        radioButton1.setOnAction(event -> Image(1));
        radioButton2.setOnAction(event -> Image(2));
        radioButton3.setOnAction(event -> Image(3));
        
        image = new Image("Images/Rock.gif");
        imageView = new ImageView( image );
        
        button = new Button("勝負");

        textArea = new TextArea("テキストエリア");
		
		VBox box = new VBox(5);
		box.setPadding(new Insets(20, 25, 25, 25));

        box.getChildren().addAll(radioButton1, radioButton2, radioButton3, imageView, button);
        
        BorderPane root = new BorderPane();
		root.setLeft(box);
		root.setCenter(textArea);

		stage.setScene(new Scene(root));
		stage.show();
    }

    void Image(int flag)
    {
        if(flag == 2)
        {
            image = new Image("Images/Scissors.png");
            imageView = new ImageView( image );
        }
    }

    void buttonPressed()
    {
		textArea.clear();
		textArea.appendText("\nラジオボタンの選択項目:" + ((RadioButton) toggleGroup.getSelectedToggle()).getText());
		textArea.appendText("\nテキストフィールドの文字列:" + textField.getText());
	}
    public static void main(String[] args)
    {
        launch();
    }
}