
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
        int numero;
        
        System.out.println("Digita un numero");
        numero = entrada.nextInt();
        
        System.out.println("El numero es  "+numero);
    }
    
}
