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
        response = new Label("");
        selected = new Label("");

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
        if(bananaCB.isSelected()) fruits += " Banana";
        if(mangoCB.isSelected()) fruits += " Mango";
        if(papayaCB.isSelected()) fruits += " Papaya";
        if(grapefruitCB.isSelected()) fruits += " Grapefruit";

        selected.setText("Fruits selected: " + fruits);

    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void handle(Event event) {

        Object fruitChecked = event.getSource();

        if(bananaCB.equals(fruitChecked)) {
            if(bananaCB.isSelected()) {
                response.setText("Banana Selected");
            } else response.setText("Banana cleared!");
            showAll();
        }
        if(mangoCB.equals(fruitChecked)) {
            if(mangoCB.isSelected()) {
                response.setText("Mango Selected");
            } else response.setText("Mango cleared!");
            showAll();
        }
        if(papayaCB.equals(fruitChecked)) {
            if(papayaCB.isSelected()) {
                response.setText("Papaya Selected");
            } else response.setText("Papaya cleared!");
            showAll();
        }
        if(grapefruitCB.equals(fruitChecked)) {
            if(grapefruitCB.isSelected()) {
                response.setText("Grapafruit Selected");
            } else response.setText("Grapafruit cleared!");
            showAll();
        }
    }

}
