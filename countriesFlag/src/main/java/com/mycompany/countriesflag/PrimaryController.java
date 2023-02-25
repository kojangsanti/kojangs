package com.mycompany.countriesflag;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color; 
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class PrimaryController {
    @FXML
    private Rectangle rectangle;
    @FXML
    private Rectangle rectangle2;
    @FXML
    private Button exitButton;
    @FXML
    private Rectangle rectangle3;
    @FXML
    private Button lesothoButton;
    @FXML
    private AnchorPane scenepane;
    @FXML
    private Button RassiaButton;
    @FXML
    private Button Estonia;
    @FXML
    private Button ArmeniaButton;
    @FXML
    private Button GabonButton;
    @FXML
    private Button ClearButton;
    @FXML
    private Label name;
    @FXML
    void flagLesotho(ActionEvent event) {
        name.setText("LESOTHO");
        rectangle.setFill(Color.BLUE);
        rectangle2.setFill(Color.WHITE);
        rectangle3.setFill(Color.GREEN);
    }
    
    @FXML
    void flagEstonia(ActionEvent event) {
        name.setText("ESTONIA");
        rectangle.setFill(Color.BLUE);
        rectangle2.setFill(Color.BLACK);
        rectangle3.setFill(Color.WHITE);
    }

    @FXML
    void flagGabon(ActionEvent event) {
        name.setText("ESTONIA");
        rectangle.setFill(Color.GREEN);
        rectangle2.setFill(Color.YELLOW);
        rectangle3.setFill(Color.BLUE);
    }

    @FXML
    void flagArmenia(ActionEvent event) {
        name.setText("ARMENIA");
        rectangle.setFill(Color.RED);
        rectangle2.setFill(Color.BLUE);
        rectangle3.setFill(Color.ORANGE);
    }

    @FXML
    void flagRassia(ActionEvent event) {
        name.setText("RASSIA");
        rectangle.setFill(Color.WHITE);
        rectangle2.setFill(Color.DARKBLUE);
        rectangle3.setFill(Color.RED);
    }
    @FXML
    void ClearFlag(ActionEvent event) {
         Alert alert=new Alert(Alert.AlertType.CONFIRMATION);
           alert.setContentText("ARE YOU SURE YOU WANT TO CLEAR?");
             
            if(alert.showAndWait().get()==ButtonType.OK);
        name.setText("COUNTRY NAME");
        rectangle.setFill(null);
        rectangle2.setFill(null);
        rectangle3.setFill(null);
    }
    Stage stage;
      @FXML
    void EXIT(ActionEvent event) {
        Alert alert=new Alert(Alert.AlertType.CONFIRMATION);
           alert.setContentText("ARE YOU SURE YOU WANT TO EXIT?");
             
            if(alert.showAndWait().get()==ButtonType.OK);
             stage=(Stage) scenepane.getScene().getWindow();
        stage.close();
    }


}
