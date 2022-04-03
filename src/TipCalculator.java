import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * (Enhanced Tip Calculator App) Modify the Tip Calculator app to
 * allow the user to enter the number of people in the party. Calculate and
 * display the amount owed by each person if the bill were to be split evenly
 * among the party members.
 */

public class TipCalculator extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("ModifiedTipCalculator.fxml"));

        Scene scene = new Scene(root);
        stage.setTitle("Tip Calculator");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}