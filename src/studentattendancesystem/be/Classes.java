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
public class Classes
{
    private String name;

    /*
     * Constructor til klasseliste med id og name
     */
    public void Class(String student, String name)
    {
        this.name = name;
    }

    /*
     * Getter for Name
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
     * Denne metode returnere navnet på Klassen  når den bliver kaldt
     */
    @Override
    public String toString()
    {
        return name;
    }
}