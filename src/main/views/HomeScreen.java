package views;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import main.DatabaseHelper;
import main.QuoteService;

public class HomeScreen {
    private Stage stage;
    private Label quoteLabel;

    public HomeScreen(Stage stage) {
        this.stage = stage;
        DatabaseHelper.initializeDB();
    }

    public void show() {
        VBox root = new VBox();
        quoteLabel = new Label(QuoteService.getRandomQuote());
        Button refreshButton = new Button("Refresh Quote");
        refreshButton.setOnAction(e -> quoteLabel.setText(QuoteService.getRandomQuote()));

        Button saveButton = new Button("Save Favorite");
        saveButton.setOnAction(e -> DatabaseHelper.saveFavoriteQuote(quoteLabel.getText()));

        root.getChildren().addAll(quoteLabel, refreshButton, saveButton);
        stage.setScene(new Scene(root, 400, 300));
        stage.show();
    }
}