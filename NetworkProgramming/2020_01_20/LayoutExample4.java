import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class LayoutExample4 extends Application {

	public void start(Stage stage) {
		// (1) メインウィンドウの設定
		stage.setWidth(280);
		stage.setHeight(200);

		// (2) コントロールの生成
		Button button1 = new Button("A");
		Button button2 = new Button("B");
		Button button3 = new Button("C");
		Button button4 = new Button("D");
		button1.setPrefSize(50, 20);
		button2.setPrefSize(50, 20);
		button3.setPrefSize(50, 20);
		button4.setPrefSize(50, 20);

		// (3) ルートペインを生成し、コントロールを配置
		HBox root = new HBox(10);

		root.getChildren().addAll(button1, button2, button3, button4);

		// (4) ルートペインを元にシーンを生成
		Scene scene = new Scene(root);

		// (5) Stageにシーンを配置
		stage.setScene(scene);

		// (6) アプリケーションウィンドウを表示
		stage.show();
	}

	public static void main(String[] args) {
		launch();
	}
}