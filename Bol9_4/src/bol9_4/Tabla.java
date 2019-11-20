package bol9_4;

import java.util.Scanner;

/**
 *
 * @author jalvarezbarciela
 */
public class Tabla {
     private int numero;
     private int i;
     private Scanner sc=new Scanner(System.in);
     public Tabla(){
    
}
public void tablaMultiplicar(){
    do{
    System.out.println("Dime un numero?");
    numero=sc.nextInt();
    if(numero!=0)
    for(i=1;i<11;i++){
        System.out.println(numero+"*"+i+"="+(numero*i));    
    }
    }while(numero!=0);
}        
    
    
    
    
    
    
}