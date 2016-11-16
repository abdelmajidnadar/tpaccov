/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abdel Majid Nadar
 */
public class Cptb extends Thread{
    private static int _cpt; private String _name;
    public Cptb(String name){_name=name;}
    public static int getValeur(){return _cpt;}
    public void run(){
        for (int i=1; i<=100000; i++)
        {
            int _c= _cpt; _cpt =_c+1;
        }
    }
    public static void main(String args[])
    {
        Cpt thr1 =new Cpt("Processus1");
        Cpt thr2 =new Cpt("Processus2");
        thr1.run(); thr2.start();
        try 
        {
            thr2.join();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println("Valeur "+Cpt.getValeur());
    }
    

    
}
