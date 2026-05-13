package javafx001;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloJavaFX001 extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		//Tạo nút bấm 
		Button btn = new Button();
		//
		btn.setText("Hello World");
		// Tạo màn hình hiển thị 
		StackPane root = new StackPane();
		root.getChildren().add(btn);
		Scene scene = new Scene(root, 300, 250);
		primaryStage.setTitle("Hello World!");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
	   launch(args);
	}

	

}
