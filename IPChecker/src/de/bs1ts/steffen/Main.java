package de.bs1ts.steffen;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class Main extends Application {

    private Label validIP;
    private Label IP10Range;
    private Label IP172Range;
    private Label IP192Range;
    private Label BroadcastAdress;
    private Label GlobalUnicast;
    private Label Loopback;
    private Label LinkLocal;
    private TextField input;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void init() {
        validIP = new Label("IP is valid");
        validIP.setStyle("-fx-background-color: red");
        IP10Range = new Label("IP is in private Range 10.0.0.0/8");
        IP10Range.setStyle("-fx-background-color: red");
        IP172Range = new Label("IP is in private Range 172.16.0.0/12");
        IP172Range.setStyle("-fx-background-color: red");
        IP192Range = new Label("IP is in private Range 192.168.0.0/16");
        IP192Range.setStyle("-fx-background-color: red");
        BroadcastAdress = new Label("IP is a broadcast address");
        BroadcastAdress.setStyle("-fx-background-color: red");
        GlobalUnicast = new Label("IP is globally routable");
        GlobalUnicast.setStyle("-fx-background-color: red");
        Loopback = new Label("IP is a Loopback address");
        Loopback.setStyle("-fx-background-color: red");
        LinkLocal = new Label("IP is a Linklocal address");
        LinkLocal.setStyle("-fx-background-color: red");
        input = new TextField();
    }

    @Override
    public void start(Stage primaryStage) {
        TilePane root = new TilePane();
        root.getChildren().add(input);
        root.getChildren().add(validIP);
        root.getChildren().add(IP10Range);
        root.getChildren().add(IP172Range);
        root.getChildren().add(IP192Range);
        root.getChildren().add(BroadcastAdress);
        root.getChildren().add(GlobalUnicast);
        root.getChildren().add(Loopback);
        root.getChildren().add(LinkLocal);
        input.setPromptText("enter IP Adress here");

        input.addEventHandler(KeyEvent.KEY_RELEASED, new IPEventHandler());
        Scene scene = new Scene(root, 1200, 800);
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private class IPEventHandler implements EventHandler<KeyEvent> {

        @Override
        public void handle(KeyEvent event) {
            String text = input.getText();

            if (IPCheck.isValidIPv4(text)) {
                validIP.setStyle("-fx-background-color: lightgreen");
            } else {
                validIP.setStyle("-fx-background-color: red");
            }

            if (IPCheck.isPrivate10(text)) {
                IP10Range.setStyle("-fx-background-color: lightgreen");
            } else {
                IP10Range.setStyle("-fx-background-color: red");
            }

            if (IPCheck.isPrivate172(text)) {
                IP172Range.setStyle("-fx-background-color: lightgreen");
            } else {
                IP172Range.setStyle("-fx-background-color: red");
            }

            if (IPCheck.isPrivate192(text)) {
                IP192Range.setStyle("-fx-background-color: lightgreen");
            } else {
                IP192Range.setStyle("-fx-background-color: red");
            }

            if (IPCheck.isGlobalUnicast(text)) {
                GlobalUnicast.setStyle("-fx-background-color: lightgreen");
            } else {
                GlobalUnicast.setStyle("-fx-background-color: red");
            }

            if (IPCheck.isLoopback(text)) {
                Loopback.setStyle("-fx-background-color: lightgreen");
            } else {
                Loopback.setStyle("-fx-background-color: red");
            }

            if (IPCheck.isLinkLocal(text)) {
                LinkLocal.setStyle("-fx-background-color: lightgreen");
            } else {
                LinkLocal.setStyle("-fx-background-color: red");
            }
        }
    }
}

