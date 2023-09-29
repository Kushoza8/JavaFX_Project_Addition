package com.example.javafx;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AddController {
    @FXML
    TextField textField=new TextField();
    @FXML
    TextField textField2=new TextField();
    @FXML
    TextArea textArea=new TextArea();
    int a,b;

    public void add(){
        String x=textField.getText();
        String y=textField2.getText();
        a=Integer.parseInt(x);
        b=Integer.parseInt(y);
        int c=a+b;
        System.out.println(c+" is the required answer");
        String str=Integer.toString(c);
        textArea.setText(str+" is the answer");
    }
}
