/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentattendancesystem;

import java.net.URL;
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

/**
 * FXML Controller class
 *
 * @author Jonas
 */
public class ProgramController implements Initializable {

    @FXML
    private ImageView Image;
    @FXML
    private PieChart pieChart;
    @FXML
    private LineChart<Number, Number> lineChart;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        XYChart.Series dataSeries1 = new XYChart.Series();
        dataSeries1.setName("2014");

        dataSeries1.getData().add(new XYChart.Data("Mandag", 0));
        dataSeries1.getData().add(new XYChart.Data("Tirsdag", 0));
        dataSeries1.getData().add(new XYChart.Data("Onsdag", 15));

        lineChart.getData().add(dataSeries1);

        PieChart pieChart = new PieChart();

        PieChart.Data slice1 = new PieChart.Data("absence", 15);
        PieChart.Data slice2 = new PieChart.Data("present", 75);


        pieChart.getData().add(slice1);
        pieChart.getData().add(slice2);

    }
}
