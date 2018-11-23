package application;
//Wingjun Chan and Jessi Medina	
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import view.SongController;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;


public class SongLib extends Application {
	

	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader();   
			loader.setLocation(
					getClass().getResource("/view/Song.fxml"));
			AnchorPane root = (AnchorPane)loader.load();
			
			SongController songController = loader.getController();
			songController.start(primaryStage);
			
			Scene scene = new Scene(root,400,450);
			primaryStage.setResizable(false);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	public static void main(String[] args) throws IOException {
		// WRITE TO THE FILE LISTSONGS.TXT
		
		
		launch(args);
	}
}
