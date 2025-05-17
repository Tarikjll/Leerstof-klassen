package com.example.demozoveelkeerin;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class ZoveelkeerinController {

    @FXML
    private TextField fieldX;

    @FXML
    private TextField fieldY;

    @FXML
    private TextField fieldResultaat;

    @FXML
    public void initialize() {
        fieldResultaat.setText("Hier komt het resultaat");
    }

    // Bedenk SRP - we hebben een andere klasse nodig voor de berekening!
    GeheleDeling geheleDeling = new GeheleDeling();

    public void berekenXinY(ActionEvent e) {

        int x = Integer.parseInt(fieldX.getText());
        int y = Integer.parseInt(fieldY.getText());

        int resultaat = geheleDeling.bereken(x, y);

        fieldResultaat.setText( String.valueOf(resultaat) );
    }

}
