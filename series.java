/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labexe3;

/**
 *
 * @author ARUMUGASAMY
 */
public class series {
    public static void main(String[] args)
    { 
        int i=Integer.parseInt(args[0]);//command line argument can be done only in main class
        abc.harmonic(i);
        
    }
    
}
    class abc
    {
        
        static double r=0;
        
         static void harmonic(int i)
        {
           
            while(i>0)
            {
                r=(r+((double)1/i));
                i--;
            }  
            System.out.println("the harmonic series is"+r);
        }        
    }        
 