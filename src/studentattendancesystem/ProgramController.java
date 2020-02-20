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
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.image.ImageView;
import studentattendancesystem.be.Student;
import studentattendancesystem.dal.StudentDAO;

/**
 * FXML Controller class
 *
 * @author Jonas
 */
public class ProgramController implements Initializable {

    @FXML
    private ImageView Image;
    @FXML
    private LineChart<Number, Number> lineChart;
    @FXML
    private JFXListView<String> txtDays;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        StudentDAO studentDao = new StudentDAO();
        List<Student> studentMock = studentDao.studentMock();
        
        txtDays.getItems().addAll(studentMock.get(1).getdays());
        
        XYChart.Series dataSeries1 = new XYChart.Series();
        dataSeries1.setName("2014");

        dataSeries1.getData().add(new XYChart.Data("Mandag", 0));
        dataSeries1.getData().add(new XYChart.Data("Tirsdag", 0));
        dataSeries1.getData().add(new XYChart.Data("Onsdag", 33));

        lineChart.getData().add(dataSeries1);
    }
}
