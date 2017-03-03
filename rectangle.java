import javafx.application.Application;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class rectangle extends Application {
	@Override
	public void start(Stage primaryStage){
		TextInputDialog input=new TextInputDialog();
		input.setTitle("rectangle application");
		inputsetHeaderText("The Perimeter of Rectangle");
		input.serContentText("Enter the height/width");
		input.shwoAndWait();
		double w = Double.parseDouble(input.getResult());
		double h = Double.parseDouble(input.getResult());

		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("rectangle");
		alert.setHeaderText("perimeter");
		alert.setContentText("Perimeter:" + 2*h + 2*w);
		alert.showAndWait();
	}
	public static voud main(String [] args){
		launch(args);
	}
}

