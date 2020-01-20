import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class LayoutExample extends Application {

	public void start(Stage stage) {
		// (1) メインウィンドウの設定
		stage.setWidth(280);
		stage.setHeight(100);

		// (2) コントロールの生成
		Button button1 = new Button("January");
		Button button2 = new Button("February");
		Button button3 = new Button("March");
		Button button4 = new Button("April");

		// (3) ルートペインを生成し、コントロールを配置
		FlowPane root = new FlowPane();
		root.getChildren().add(button1);
		root.getChildren().add(button2);
		root.getChildren().add(button3);
		root.getChildren().add(button4);

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