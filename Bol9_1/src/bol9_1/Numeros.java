package bol9_1;

import java.util.Scanner;

/**
 *
 * @author jalvarezbarciela
 */
public class Numeros {
    private int positivos;
    private int negativos;
    private int ceros;
    private Scanner sc=new Scanner(System.in);
     public Numeros(){
         
     }
    
    public void calcularSigno(){
        int i;
        int numero;
        for(i=0;i<10;i++){
            System.out.println("Dime un numero");
            numero=sc.nextInt();
            if(numero>0)
                positivos=positivos+1;
            else if(numero<0)
                negativos=negativos+1;
            else 
                ceros=ceros+1;       
        
        }
        System.out.println("Negativos="+negativos+"\nPositivos="+positivos+"\nCeros="+ceros);
    }
            
            
            
            
}
