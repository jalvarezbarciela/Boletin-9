package bol9_3;

import java.util.Scanner;

/**
 *
 * @author jalvarezbarciela
 */
public class Area {
    private int b;
    private int a;
    private Scanner sc=new Scanner(System.in);
    public Area(){
        
    }
    public void calcularArea(){
        System.out.println("Dime o valor da altura");
        a=sc.nextInt();
        do{
        System.out.println("Valor non valido, di outro");
        a=sc.nextInt();   
        }while(a<0);
        System.out.println("Dime o valor da base");
        b=sc.nextInt();
        do{
        System.out.println("Valor non valido, di outro");
        b=sc.nextInt();   
        }while(b<0);
        int area=b*a;
        System.out.println("El area es igual a"+area);   
            
           
    }
}
