package calculatrice.controller;

import calculatrice.model.Calculatrice;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author Tecno 17PC
 */
public class FXMLController implements Initializable {
    Calculatrice cal = new Calculatrice();

    @FXML
    private Label Label1;
    @FXML
    private Label Label2;

    @FXML
    private void nVirgule(ActionEvent event) {
        Label1.setText(cal.getTexteLabelResultat('.'));
    }
    @FXML
    private void plus(ActionEvent event) {
         Label1.setText(cal.getTexteLabelResultat('+'));
    }
    @FXML
    private void moin(ActionEvent event) {
         Label1.setText(cal.getTexteLabelResultat('-'));
    }
     @FXML
    private void division(ActionEvent event) {
         Label1.setText(cal.getTexteLabelResultat('/'));
    }
    @FXML
    private void multiplication(ActionEvent event) {
         Label1.setText(cal.getTexteLabelResultat('x'));
    }

     @FXML
    private void egale(ActionEvent event) {
        //egale
        Label1.setText(cal.getEgale());    
    }
    @FXML
    private void inverseSigne(ActionEvent event) {
         Label1.setText(cal.inverseSigneResultat());
         Label2.setText(cal.reponseLAbel2);
         
    }
    // suppression 
    @FXML
    private void supprimeTout(ActionEvent event) {
         Label1.setText(cal.getSupprimeToutTexte());
         Label2.setText(cal.reponseLAbel2);
    }
    @FXML
    private void SupprimeUn(ActionEvent event) {
         Label1.setText(cal.supprimerLeDernier());
         Label2.setText(cal.reponseLAbel2);
    }

    
    // chiffre et nombre
    @FXML
    private void n0(ActionEvent event) {
         Label1.setText(cal.getTexteLabelResultat(0));
         Label2.setText(cal.reponseLAbel2);
    }
    @FXML
    private void n1(ActionEvent event) {
         Label1.setText(cal.getTexteLabelResultat(1));
         Label2.setText(cal.reponseLAbel2);
    }
    @FXML
    private void n2(ActionEvent event) {
         Label1.setText(cal.getTexteLabelResultat(2));
         Label2.setText(cal.reponseLAbel2);
    }
    @FXML
    private void n3(ActionEvent event) {
         Label1.setText(cal.getTexteLabelResultat(3));
         Label2.setText(cal.reponseLAbel2);
    }
    @FXML
    private void n4(ActionEvent event) {
         Label1.setText(cal.getTexteLabelResultat(4));
         Label2.setText(cal.reponseLAbel2);
    }
    @FXML
    private void n5(ActionEvent event) {
         Label1.setText(cal.getTexteLabelResultat(5));
         Label2.setText(cal.reponseLAbel2);
    }
    @FXML
    private void n6(ActionEvent event) {
         Label1.setText(cal.getTexteLabelResultat(6));
         Label2.setText(cal.reponseLAbel2);
    }

    @FXML
    private void n7(ActionEvent event) {
         Label1.setText(cal.getTexteLabelResultat(7));
         Label2.setText(cal.reponseLAbel2);
    }
    @FXML
    private void n8(ActionEvent event) {
         Label1.setText(cal.getTexteLabelResultat(8));
         Label2.setText(cal.reponseLAbel2);
    }  
    @FXML
    private void n9(ActionEvent event) {
         Label1.setText(cal.getTexteLabelResultat(9));
         Label2.setText(cal.reponseLAbel2);
    }
    
    
     @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }  
}
