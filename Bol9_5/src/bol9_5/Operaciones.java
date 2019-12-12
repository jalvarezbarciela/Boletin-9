package bol9_5;

import java.util.Scanner;

/**
 *
 * @author Jose
 */
public class Operaciones {
    private int numero;
    private int elementos;
    private int contador;
    private int a=1;
    
    
    public Operaciones(int numero,int elementos,int contador,int a){
        this.numero=numero;
        this.elementos=elementos;
        this.contador=contador;
        this.a=a;
    }

    public Operaciones() {
        
    }
    
    public void setDatos(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce numero: ");
        elementos=sc.nextInt();
    }
    
    public void Calcular(){
        setDatos();
        for (contador = 0; contador < elementos; contador++) {
            numero +=2;
            System.out.println(numero);
        }
        System.out.println("Acabado");
        for(contador= 1; contador<= elementos; contador++){
            if(contador %2==0){
                numero=contador;}
            else{
                numero=-(contador);
            }
            System.out.println(numero);
        }
        System.out.println("Acabado");
        numero=0;
        for(contador=0; contador<=elementos;contador++) {
            System.out.println(numero);
            numero=numero+a;
            a=numero-a;
            
        }
        System.out.println("Acabado");
    }
}
