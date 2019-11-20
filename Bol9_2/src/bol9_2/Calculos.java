package bol9_2;

/**
 *
 * @author jalvarezbarciela
 */
public class Calculos {
    private int i;
    private int suma;
    private double producto;
    private int numero;
    public Calculos(){}    
    public void calcularSumaProducto(){
        numero=10;
        producto=1;
        for(i=10;i<90;i++){
        suma=numero+suma;
        producto=numero*producto;
        numero++;
        }
        System.out.println("Suma="+suma+"\nProducto="+producto);
    }
    
    
    
    
    
    
    
    
    
    
    
}
