import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.text.Font;

public class Janken extends Application
{
    Button gu;
    Label me, com, kekka, msg;

    int count = 0;
    int win = 0;
    int meHand;

    Image image1 = new Image("Images/Rock.gif");
    Image image4;

    public void start(Stage stage)
    {
        stage.setWidth(400);
        stage.setHeight(300);
        stage.setTitle("じゃんけん");

        gu = new Button("グー");
        gu.setOnAction(event -> guPon());
        gu.setPrefSize(130, 30);

        HBox hb = new HBox();
        hb.getChildren().add(gu);

        me=new Label("ME");
        com = new Label("COM");
        me.setGraphic(new ImageView(image1));
        com.setGraphic(new ImageView(image4));

        kekka = new Label("勝負");
        Font f1 = new Font(24);
        kekka.setFont(f1);

        BorderPane root = new BorderPane();
        root.setTop(hb);
        root.setLeft(me);
        root.setRight(com);
        root.setBottom(kekka);

        Scene scene = new Scene(root);

        stage.setScene(scene);

        stage.show();
    }
    private void guPon()
    {
        me.setGraphic(new ImageView(image1));
        comPon();
    }
    void comPon()
    {
        count++;
        int r = (int)(Math.random()*3);
        if(r == 0)com.setGraphic(new ImageView(image1));
    }
    public static void main(String[] args)
    {
        launch();
    }
}