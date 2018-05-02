/**
 * Sample Skeleton for 'Anagrammi.fxml' Controller Class
 */

package it.polito.tdp.anagrammi.controller;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.Set;

import it.polito.tdp.lab5.model.Model;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AnagrammiController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="txtCalcola"
    private TextField txtCalcola; // Value injected by FXMLLoader

    @FXML // fx:id="btnCalcola"
    private Button btnCalcola; // Value injected by FXMLLoader

    @FXML // fx:id="txtCorretti"
    private TextArea txtCorretti; // Value injected by FXMLLoader

    @FXML // fx:id="txtErrati"
    private TextArea txtErrati; // Value injected by FXMLLoader

    @FXML // fx:id="btnReset"
    private Button btnReset; // Value injected by FXMLLoader

	private Model model;

    @FXML
    void calcolaAnagrammi(ActionEvent event) {
    	
    	txtCorretti.clear();
    	txtErrati.clear();
    	
    	Set<String> anagrammi = this.model.calcolaAnagrammi(txtCalcola.getText());
    	
    	for(String anagramma : anagrammi){
    		if(this.model.isCorrect(anagramma))
    			txtCorretti.appendText(anagramma + "\n");
    		else
    			txtErrati.appendText(anagramma + "\n");
    	}
    	
    }

    @FXML
    void resetCampi(ActionEvent event) {
    	
    	txtCorretti.clear();
    	txtErrati.clear();
    	txtCalcola.clear();

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert txtCalcola != null : "fx:id=\"txtCalcola\" was not injected: check your FXML file 'Anagrammi.fxml'.";
        assert btnCalcola != null : "fx:id=\"btnCalcola\" was not injected: check your FXML file 'Anagrammi.fxml'.";
        assert txtCorretti != null : "fx:id=\"txtCorretti\" was not injected: check your FXML file 'Anagrammi.fxml'.";
        assert txtErrati != null : "fx:id=\"txtErrati\" was not injected: check your FXML file 'Anagrammi.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Anagrammi.fxml'.";

    }

	public void setModel(Model model) {
		// TODO Auto-generated method stub
		this.model=model;
	}
}

