import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class LayoutExample3 extends Application {

	public void start(Stage stage) {
		// (1) メインウィンドウの設定
		stage.setWidth(280);
		stage.setHeight(200);

		// (2) コントロールの生成
		Button button1 = new Button("(0, 0)");
		Button button2 = new Button("(1, 1)");
		Button button3 = new Button("(2, 2)");
		Button button4 = new Button("(0, 2)");
		button1.setPrefSize(80, 30);
		button2.setPrefSize(80, 30);
		button3.setPrefSize(80, 30);
		button4.setPrefSize(80, 30);

		// (3) ルートペインを生成し、コントロールを配置
		GridPane root = new GridPane();
		GridPane.setConstraints(button1, 0, 0);
		GridPane.setConstraints(button2, 1, 1);
		GridPane.setConstraints(button3, 2, 2);
		GridPane.setConstraints(button4, 0, 2);
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