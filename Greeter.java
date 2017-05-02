/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greeter;

/**
 *
 * @author acc
 */
public class Greeter 
{
    private String name;
     public Greeter(String aName)
    {
       name = aName;
    }
 
    public String sayHello()
   {
      return "Hello, " + name + "!";
   }
    
}
