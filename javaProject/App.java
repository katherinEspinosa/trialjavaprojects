import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application{
    public static void main(String[] args) throws Exception {
        
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("/view/newedited.fxml"));
            Scene scene = new Scene(root);
            // Disables resizing of window
            stage.setTitle("Sweet Tuesdays");
            stage.setScene(new Scene (root, 1315, 797));
            stage.setResizable(false);
           // stage.setScene(scene);

            stage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
