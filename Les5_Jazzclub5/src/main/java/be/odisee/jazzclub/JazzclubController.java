package be.odisee.jazzclub;

import be.odisee.jazzclub.domain.Jazzclub;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.event.ActionEvent;


public class JazzclubController {

    Jazzclub jazzclub = new Jazzclub();

    @FXML
    private Button buttonLogin;

    @FXML
    private TextArea textAreaMelding;

    @FXML
    private TextField textLidNummer, textPaswoord;

    @FXML
    void actionLogin(ActionEvent event) {

        int lidnummer = Integer.parseInt(textLidNummer.getText());
        String paswoord = textPaswoord.getText();

        boolean resultaat = jazzclub.authenticeer(lidnummer, paswoord);
        if (resultaat) {
            textAreaMelding.setText("Ingelogd met lidnummer " + lidnummer);
        } else {
            textAreaMelding.setText("Ingeloggen met lidnummer " + lidnummer + " is mislukt");
        }
  }}