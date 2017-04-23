/*
 * License, blah-blah-blah [License Headers in Project Properties]
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * 
 * The application is an organizer with tags.
 * First it will be based on xml-file. And than we`ll see.
 */
package organozer;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author suomi
 */
public class Organozer extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Scene scene = new Scene(grid, 300, 275);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Organozer");
        primaryStage.show();
        
        Text scenetitle = new Text("Новай заметка");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);

        Label tags = new Label("Т-эги");
        grid.add(tags, 0, 1);

        TextField tagsField = new TextField();
        grid.add(tagsField, 1, 1);

        Label content = new Label("Епитимья");
        grid.add(content, 0, 2);

        TextArea contentArea = new TextArea();
        grid.add(contentArea, 1, 2);
        
        Button btnOK = new Button();
        btnOK.setText("С божьей помощию");
        Button btnCancel = new Button();
        btnCancel.setText("Чур!");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btnOK);
        hbBtn.getChildren().add(btnCancel);
        grid.add(hbBtn, 1, 4);
        btnOK.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Уплочено!");
            }
        });
        btnCancel.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Содом и Гомора!");
            }
        });
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
