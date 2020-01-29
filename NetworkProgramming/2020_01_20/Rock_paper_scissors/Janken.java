import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.text.Font;

public class Janken extends Application
{
    Button gu, choki, par;
    Label me, com, kekka, msg;

    int count = 0;
    int win = 0;
    int meHand;
    int flag; // 自手のフラグ

    Image image1 = new Image("Images/Rock.gif");
    Image image2 = new Image("Images/Scissors.png");
    Image image3 = new Image("Images/Paper.jpeg");
    Image image4 = image1;
    Image image5 = image2;
    Image image6 = image3;

    TextArea textArea;

    public void start(Stage stage)
    {
        stage.setWidth(1280);
        stage.setHeight(800);
        stage.setTitle("じゃんけん");

        gu = new Button("グー");
        gu.setOnAction(event -> guPon());
        gu.setPrefSize(130, 30);

        choki = new Button("チョキ");
        choki.setOnAction(event -> chokiPon());
        choki.setPrefSize(130, 30);

        par = new Button("パー");
        par.setOnAction(event -> parPon());
        par.setPrefSize(130, 30);

        HBox hb = new HBox();
        hb.getChildren().add(gu);
        hb.getChildren().add(choki);
        hb.getChildren().add(par);

        me =new Label("ME");
        com = new Label("COM");
        me.setGraphic(new ImageView(image1));
        com.setGraphic(new ImageView(image4));

        textArea = new TextArea("結果\n");
        kekka = new Label("勝負");
        Font f1 = new Font(24);
        kekka.setFont(f1);

        BorderPane root = new BorderPane();
        root.setTop(hb);
        root.setLeft(me);
        root.setCenter(textArea);
        root.setRight(com);
        root.setBottom(kekka);

        Scene scene = new Scene(root);

        stage.setScene(scene);

        stage.show();
    }
    private void guPon()
    {
        flag = 0;
        me.setGraphic(new ImageView(image1));
        comPon();
        buttonPressed();
    }
    private void chokiPon()
    {
        flag = 1;
        me.setGraphic(new ImageView(image2));
        comPon();
        buttonPressed();
    }
    private void parPon()
    {
        flag = 2;
        me.setGraphic(new ImageView(image3));
        comPon();
        buttonPressed();
    }
    void comPon()
    {
        count++;
        int r = (int)(Math.random()*3);
        if(r == 0)
        {
            com.setGraphic(new ImageView(image4));
            switch(flag)
            {
                case 0:
                    win = 2;
                    break;
                case 1:
                    win = 1;
                    break;
                case 2:
                    win = 0;
                    break;
            }
        }
        else if(r == 1)
        {
            com.setGraphic(new ImageView(image5));
            switch(flag)
            {
                case 0:
                    win = 0;
                    break;
                case 1:
                    win = 2;
                    break;
                case 2:
                    win = 1;
                    break;
            }
        }
        else
        {
            com.setGraphic(new ImageView(image6));
            switch(flag)
            {
                case 0:
                    win = 1;
                    break;
                case 1:
                    win = 0;
                    break;
                case 2:
                    win = 2;
                    break;
            }
        }
    }
    void buttonPressed()
    {
        textArea.appendText(count + "回目の施行結果: ");
        switch(win)
        {
            case 0:
                textArea.appendText("勝利\n\n");
                break;
            case 1:
                textArea.appendText("敗北\n\n");
                break;
            case 2:
                textArea.appendText("ドロー\n\n");
                break;
        }
    }
    public static void main(String[] args)
    {
        launch();
    }
}