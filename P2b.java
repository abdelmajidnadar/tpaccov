/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abdel Majid Nadar
 */
public class P2b extends Thread

        
{
    private static int tick = 0;
    public String _name;
    
    public P2b (String name)
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
     P2b thr1 = new P2b("Processus 1");
     P2b thr2 = new P2b("Processus 2");
     P2b thr3 = new P2b("Processus 3");
     
     thr1.start(); 
     thr2.start(); 
     thr3.start();
    }
}