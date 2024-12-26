/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package calculatrice.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
/**
 *
 * 
 * @author Naaba Faical  
 */
public class Main extends Application {
@Override
public void start(Stage primaryStage) throws Exception {

FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/calculatrice/vue/FXML.fxml"));
Parent root = fxmlLoader.load();
primaryStage.setTitle("The NAABA Product");

Scene scene = new Scene(root);

primaryStage.setScene (scene);
primaryStage.setResizable(false);
primaryStage.show();
}
public static void main(String[] args) {
launch(args);
}
    
}
