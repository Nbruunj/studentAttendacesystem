/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentattendancesystem;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author Jonas
 */
public class StudentAttendanceSiteController implements Initializable {

    @FXML
    private JFXTextField LoginID;
    @FXML
    private JFXTextField LoginPW;
    @FXML
    private JFXButton LoginBtn;
    @FXML
    private JFXCheckBox RememberMe;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Login(ActionEvent event) throws IOException 
    {
        if (LoginID.getText() == "student")
        {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Program.fxml"));
            Parent root1 = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        }
        else
        {
            System.out.println(LoginID.getText().toString());
        }
    }
    
    private void CheckId()
    {
        String Test = LoginID.getText().trim();
    }
}
