/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abdel Majid Nadar
 */
public class P2cc extends Thread
{
     private static int tick = 0;
    public String _name;
    
    public P2cc (String name)
    { 
     _name = name;
    }
    public void run ()
    {
     System.out.println ("Nom Thread: " + _name + " Groupe: " + Thread.currentThread().getThreadGroup() + " Priorité: " + Thread.currentThread().getPriority());
      if (Thread.currentThread().isDaemon())
      { 
       System.out.println("Je suis un processus Demon");
      }
      else
      {
       System.out.println("Je ne suis pas un processus Demon");
      }   
     while (tick <40000000)
     {
      tick++;
      if ((tick%5000)==0)
      {
       System.out.println("Thread: " + Thread.currentThread().getName() + " ,tick = " + tick);
      }
     }
    }
    
    public static void main (String args [])
    {
     P2cc thr1 = new P2cc("Processus 1");
     P2cc thr2 = new P2cc("Processus 2");
     P2cc thr3 = new P2cc("Processus 3");
     
     thr1.setPriority(Thread.MAX_PRIORITY);
     thr1.setPriority(Thread.MIN_PRIORITY);
     thr1.start(); 
     thr2.start(); 
     thr3.start();
      try 
        {
            thr1.join();
            thr2.join();
            thr3.join();
            System.out.println("Fin de P2C");
            System.exit(0);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}
