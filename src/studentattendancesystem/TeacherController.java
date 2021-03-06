/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentattendancesystem;

import com.jfoenix.controls.JFXListView;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;
import studentattendancesystem.be.Student;
import studentattendancesystem.dal.StudentDAO;

/**
 * FXML Controller class
 *
 * @author Jonas
 */
public class TeacherController implements Initializable {

    @FXML
    private ImageView Image;
    @FXML
    private JFXListView<String> txtClasses;
    @FXML
    private JFXListView<String> txtStudents;
    @FXML
    private JFXListView<String> txtDays;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
        StudentDAO studentDao = new StudentDAO();

        List<Student> studentMock = studentDao.studentMock();
        
        /*
        * Adding students to the listview
        */
        studentMock.forEach((student) -> {
            txtStudents.getItems().add(student.getName());
        });

        /*
        * Setting the information to the list
        */
        
        txtClasses.getItems().add(studentMock.get(0).getGrade());

        /*
        * Setting the information to the list
        */
        txtDays.getItems().addAll(studentMock.get(1).getdays());

    }
}
