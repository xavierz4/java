
import java.util.Scanner;

/*
 * Almacenar datos numericos
 */

/**
 *
 * @author xavierz
 */
public class ScannerIn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
       
        
        System.out.println("Digita un numero");
        float numero = entrada.nextFloat();
        
        System.out.println("El numero es  "+numero);
    }
    
}
