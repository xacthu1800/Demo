package com.mycompany.demoproject;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class PrimaryController {
    
    @FXML
    private Label ketQua;
    @FXML
    private TextField chieuCao;
    @FXML
    private TextField canNang;
    @FXML
    private Button button1;
    
    @FXML 
    private void even(){
       double chieuc = Double.parseDouble(chieuCao.getText());
       double cann = Double.parseDouble(canNang.getText());
    
       double ketq = cann / (chieuc * chieuc);
    
       if (ketq <20){
           ketQua.setText("om");
       }else if (ketq >= 21 && ketq<30){
           ketQua.setText("beo phi");
       }else {
           ketQua.setText("beo phi 2");
       }
       
       
    }
    
    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
    
    
    
}
