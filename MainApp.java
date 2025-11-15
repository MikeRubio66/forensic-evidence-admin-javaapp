package com.mike.forensic;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
public class MainApp extends Application {
  public void start(Stage stage) {
    VBox root = new VBox(8);
    Button b = new Button("Seleccionar evidencia");
    root.getChildren().addAll(new Label("Forensic Evidence Registry"), b);
    Scene scene = new Scene(root, 600, 400);
    stage.setScene(scene);
    stage.setTitle("Forensic Evidence Registry");
    stage.show();
  }
  public static void main(String[] args) { launch(); }
}
