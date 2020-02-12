/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentattendancesystem;

import java.net.InetAddress;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author nbruu
 */
public class studentAttendanceSite implements Initializable
{
    
    private String adresse;
    
    private Label label;
    @FXML
    private TextField studentUserName;
    @FXML
    private TextField studentUserPassword;
    @FXML
    private Button studentLogin;
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        // TODO
    }    

    @FXML
    private void handleButtonActionLogin(ActionEvent event) throws UnknownHostException
    {
        /*
        bare en tanker jeg havde men kan ikke før database er på
        checker();
        if (checker() = "true")
        {
            check if (studentUserName = databaseusername)
                    if (databaseusername.password = studentUserPassword)
           
        }
       
       
         else
        {
            checker = false;
            System.out.println("du er ikke på skole og derfor ikke i skole");    
        }
        */
        
    }

    private boolean checker() throws UnknownHostException
            {
                adresse = InetAddress.getLocalHost().getHostAddress();
                
                String[] adr = adresse.split("\\.");
                for (int i = 0; i < adr.length-1; i++)
                {
                    if (adr[0].equals("10"))
                    {
                        return true;
                    }
                    
                    if (adr[1].equals("176"))
                    {
                        return true;
                    }if (adr[2].equals("161"))
                    {
                        return true;
                    }
                }
//                InetAddress addr = adresse.();
                return false;
            }
    @FXML
    private void handleActionUsername(ActionEvent event)
    {
    }

    @FXML
    private void handleActionPassword(ActionEvent event)
    {
    }
    
}
