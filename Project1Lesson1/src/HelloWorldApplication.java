import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class HelloWorldApplication extends Application {

    @Override
    public void init() throws Exception {
        super.init();
        System.out.println("Inside init() method! Perform necessary initializations here.");
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // CHANGE HERE: Run application. Close it and change "Hello World" with some other text.
        // ИЗМЕНИТЕ ЗДЕСЬ: Запустите программу. Закройте его и измените «Hello World» другим текстом.
        Label label = new Label("Hello World");
        
        label.setAlignment(Pos.CENTER);
        Scene scene = new Scene(label, 500, 350);
        // CHANGE HERE: Run application. Close it and change "Hello World Application" with some other text.
        // ИЗМЕНИТЕ ЗДЕСЬ: Запустите программу. Закройте его и измените «Hello WorldApplication» другим текстом.
        primaryStage.setTitle("Hello Java Application");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @Override
    public void stop() throws Exception {
        super.stop();
        System.out.println("Inside stop() method! Destroy resources. Perform Cleanup.");
    }

    public static void main(String[] args) {
        launch(args);
    }
}
