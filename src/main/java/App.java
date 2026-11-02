import java.io.File;
import java.io.IOException;
import java.net.URL;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        
        URL url = new File("src/main/resources/view/Calculator.fxml").toURI().toURL();
        Parent root = FXMLLoader.load(url);
        Scene scene = new Scene(root);
        
        stage.setTitle("Kalkulator Sederhana - JavaFX");
        stage.centerOnScreen(); 
        stage.show(); 
    }

    public static void main(String[] args) {
        launch(args); 
    }
}
