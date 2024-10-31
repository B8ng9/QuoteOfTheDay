package main;

import javafx.application.Application;
import javafx.stage.Stage;
import views.HomeScreen;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        new HomeScreen(primaryStage).show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}