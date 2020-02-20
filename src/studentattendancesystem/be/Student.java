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
    
    
    public void student (String name)
    {
        this.name = name;
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
