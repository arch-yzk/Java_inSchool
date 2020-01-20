import javafx.application.Application;
import javafx.stage.Stage;

public class SimpleApplication extends Application {
	public void start(Stage stage) {
		stage.setTitle("JavaFX Example");
		stage.setWidth(300);
		stage.setHeight(200);
		stage.show();
	}

	public static void main(String[] args) {
		launch();
	}
}
