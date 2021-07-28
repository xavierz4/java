
import java.util.Scanner;

/*
FUNCION PARA SUMAR DOS NUMEROS
 */

/**
 *
 * @author xavierz
 */
public class FuncionSuma {
    
    public static int Sumar(int x, int y){
        
        return x+y;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese Numero uno");
        int numero1 = sc.nextInt();
        System.out.println("Ingrese Numero dos");
        int numero2 = sc.nextInt();
        
        System.out.println("La suma es "+Sumar(numero1,numero2));
        
        
        
    }
    
    
}
