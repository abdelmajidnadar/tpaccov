/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abdel Majid Nadar
 */
public class P2 extends Thread
{
    private static int tick = 0;
    private final String _name;
    public P2 (String name)
    { 
     _name = name;
    }
    public void run ()
    {
     while (tick <40000000)
     {
      tick++;
      if ((tick%5000)==0)
      {
       System.out.println("Thread #" + Thread.currentThread().getName() + " tick = " + tick);
      }
     }
    }
    
    public static void main (String args [])
    {
     P2 thr1 = new P2("Processus 1");
     P2 thr2 = new P2("Processus 2");
     P2 thr3 = new P2("Processus 3");
     
     thr1.start(); 
     thr2.start(); 
     thr3.start();
    }
}
