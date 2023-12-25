import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class SearchEngineGUI extends Application {

    @Override
    public void start(Stage primaryStage) {
        BorderPane borderPane = new BorderPane();
        TabPane tabPane = new TabPane();

        // Default tab
        int TabIDTracker = 0;
        TabInstance DefaultTabInstance = new TabInstance(null, TabIDTracker);
        Tab defaultTab = DefaultTabInstance.getTab();
        TabInstanceManager tabInstanceManager = new TabInstanceManager(TabIDTracker, DefaultTabInstance);

        tabPane.getTabs().addAll(defaultTab);
        borderPane.setCenter(tabPane);

        HBox topHBox = new HBox();
        TextField urlInput = new TextField("Enter URL or Search Query");
        Button searchButton = new Button("Search");
        topHBox.getChildren().addAll(urlInput, searchButton);
        borderPane.setTop(topHBox);

        Scene scene = new Scene(borderPane, 600, 400);
        primaryStage.setFullScreen(true);
        primaryStage.setTitle("Search Engine Interface");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
