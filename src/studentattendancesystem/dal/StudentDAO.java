/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentattendancesystem.dal;

import java.util.ArrayList;
import java.util.List;
import studentattendancesystem.be.Student;

/**
 *
 * @author Jonas
 */
public class StudentDAO {

    public StudentDAO() {

    }

    public List<Student> studentMock() {
        List<Student> student = new ArrayList();

        /*
        * Adds data to students
        */
        Student s1 = new Student(1, "Søren St", "SCO", new ArrayList<String>() {
            {
                add("Mandag - absence");
                add("Tirsdag - absence");
                add("Onsdag - absence");
            }
        });

        Student s2 = new Student(2, "Sten Vi", "SCO", new ArrayList<String>() {
            {
                add("Mandag - Present");
                add("Tirsdag - absence");
                add("Onsdag - Present");
            }
        });

        Student s3 = new Student(3, "Thomas  Se", "SCO", new ArrayList<String>() {
            {
                add("Mandag - Present");
                add("Tirsdag - Present");
                add("Onsdag - absence ");
            }
        });

        Student s4 = new Student(4, "Tommy  Tu", "SCO", new ArrayList<String>() {
            {
                add("Mandag - absence ");
                add("Tirsdag - Present");
                add("Onsdag - Present");
            }
        });
        
        /*
        * Adding the students to the list.
        */
        student.add(s1);
        student.add(s2);
        student.add(s3);
        student.add(s4);
        
        return student;
    }
}
