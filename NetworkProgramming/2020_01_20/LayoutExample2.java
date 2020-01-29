import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class LayoutExample2 extends Application {
	public void start(Stage stage) {
		// (1) メインウィンドウの設定
		stage.setWidth(280);
		stage.setHeight(140);

		// (2) コントロールの生成
		Button button1 = new Button("Top");
		Button button2 = new Button("Left");
		Button button3 = new Button("Center");
		Button button4 = new Button("Right");
		Button button5 = new Button("Bottom");
		// button5 = new Button("",new ImageView(new Image("rust.png")));
		button5.setOnAction(event -> Image());

		button1.setPrefSize(300, 30);
		button2.setPrefSize(100, 50);
		button3.setPrefSize(100, 50);
		button4.setPrefSize(100, 50);
		button5.setPrefSize(300, 30);

		// (3) ルートペインを生成し、コントロールを配置
		BorderPane root = new BorderPane();
		root.setTop(button1);
		root.setLeft(button2);
		root.setCenter(button3);
		root.setRight(button4);
		root.setBottom(button5);


		// (4) ルートペインを元にシーンを生成
		Scene scene = new Scene(root);

		// (5) Stageにシーンを配置
		stage.setScene(scene);

		// (6) アプリケーションウィンドウを表示
		stage.show();
	}

	private Object Image() {
		// TODO 自動生成されたメソッド・スタブ

		//labels[i].setGraphic(new ImageView(image));
		return null;
	}

	public static void main(String[] args) {
		launch();
	}
}