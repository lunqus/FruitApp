package sample;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Main extends Application implements EventHandler {

    private Label title;
    private Label response;
    private Label selected;

    private CheckBox bananaCB;
    private CheckBox mangoCB;
    private CheckBox papayaCB;
    private CheckBox grapefruitCB;
    private String fruits;

    @Override
    public void start(Stage primaryStage) throws Exception{

        primaryStage.setTitle("Favorite Fruit");

        title = new Label("What fruits do you like?");
        response = new Label("No Respnose");
        selected = new Label("Not Selected");

        bananaCB = new CheckBox("Banana");
        mangoCB = new CheckBox("Mango");
        papayaCB = new CheckBox("Papaya");
        grapefruitCB = new CheckBox("Grapefruit");

        // Setup the Stage and Scene
        FlowPane rootPane = new FlowPane(Orientation.VERTICAL, 5, 5);
        rootPane.setAlignment(Pos.CENTER);

        // All of Controls
        rootPane.getChildren().add(title);
        rootPane.getChildren().addAll(bananaCB, mangoCB,
                papayaCB, grapefruitCB, response, selected);

        // Attach eventListeners to the checkboxes


        Scene scene = new Scene(rootPane, 400,250);
        primaryStage.setScene(scene);
        primaryStage.show();

        showAll();

    }

    void showAll() {
        fruits = "";

    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void handle(Event event) {

        Object fruitChecked = event.getSource();

        if(bananaCB.equals(fruitChecked)) {
            System.out.println("Clicked!");

            if(bananaCB.isSelected()) {
                response.setText("Banana Selected");
            } else response.setText("Banana cleared!");
        }
    }

}
