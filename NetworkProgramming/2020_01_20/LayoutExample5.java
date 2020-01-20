import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class LayoutExample5 extends Application {

	public void start(Stage stage) {
		// (1) メインウィンドウの設定
		stage.setWidth(300);
		stage.setHeight(160);

		// (2) コントロールの生成
		Button button1 = new Button("1");
		Button button2 = new Button("2");
		Button button3 = new Button("3");
		Button button4 = new Button("4");
		Button button5 = new Button("5");
		Button button6 = new Button("6");
		button1.setPrefSize(200, 100);
		button2.setPrefSize(200, 100);
		button3.setPrefSize(200, 100);
		button4.setPrefSize(100, 50);
		button5.setPrefSize(100, 50);
		button6.setPrefSize(100, 50);

		GridPane subPane = new GridPane();
		GridPane.setConstraints(button4, 0, 0);
		GridPane.setConstraints(button5, 1, 0);
		GridPane.setConstraints(button6, 0, 1);

		subPane.getChildren().addAll(button4, button5, button6);

		// (3) ルートペインを生成し、コントロールを配置
		GridPane root = new GridPane();
		GridPane.setConstraints(button1, 0, 0);
		GridPane.setConstraints(button2, 1, 0);
		GridPane.setConstraints(button3, 0, 1);
		GridPane.setConstraints(subPane, 1, 1);

		root.getChildren().addAll(button1, button2, button3, subPane);

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