/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentattendancesystem.be;

/**
 *
 * @author Jonas
 */
public class Student
{
    private String name;
    private int id;
    private String grade;
    
    public Student(int i, String bilbo_Ba, String sco) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public void student (int id, String name, String grade)
    {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }
    
    /*
     * Getter for Id
     */
    public int getId()
    {
        return id;
    }

    /*
     * Setter for Id
     */
    public void setId(int id)
    {
        this.id = id;
    }
    
    /*
     * Getter for name
     */
    public String getName()
    {
        return name;
    }

    /*
     * Setter for name
     */
    public void setName(String name)
    {
        this.name = name;
    }
    
        /*
     * Getter for grade
     */
    public String getGrade()
    {
        return grade;
    }

    /*
     * Setter for grade
     */
    public void setId(String grade)
    {
        this.grade = grade;
    }
    
}
