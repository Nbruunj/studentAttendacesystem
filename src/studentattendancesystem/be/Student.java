/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentattendancesystem.be;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jonas
 */
public class Student {

    private String name;
    private int id;
    private String grade;
    private List<String> days;

    public Student(int id, String name, String grade, List<String> days) {
        this.name = name;
        this.id = id;
        this.grade = grade;
        this.days = days;
    }

    /*
     * Getter for days
     */
    public List<String> getdays() {
        return days;
    }

    /*
     * Setter for days
     */
    public void setdays(List<String> days) {
        this.days = days;
    }

    /*
     * Getter for Id
     */
    public int getId() {
        return id;
    }

    /*
     * Setter for Id
     */
    public void setId(int id) {
        this.id = id;
    }

    /*
     * Getter for name
     */
    public String getName() {
        return name;
    }

    /*
     * Setter for name
     */
    public void setName(String name) {
        this.name = name;
    }

    /*
     * Getter for grade
     */
    public String getGrade() {
        return grade;
    }

    /*
     * Setter for grade
     */
    public void setId(String grade) {
        this.grade = grade;
    }

}
