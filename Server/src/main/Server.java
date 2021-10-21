package main;

import javafx.application.Application;
import javafx.stage.Stage;
import tools.GamesServer;

public class Server extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        new GamesServer(stage);
    }
}
