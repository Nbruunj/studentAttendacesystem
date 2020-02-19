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
    private String absence;
    
    
    public void student (String name, String absence)
    {
        this.name = name;
        this.absence = absence;
    }
    
     /*
     * Getter for absence
     */
    public String getabsence()
    {
        return absence;
    }

    /*
     * Setter for absence
     */
    public void setabsence(String absence)
    {
        this.absence = absence;
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
}
