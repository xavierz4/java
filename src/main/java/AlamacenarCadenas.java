
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
public class AlamacenarCadenas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        //String cadena; 
        char simbolo;
        //System.out.println("Digite una cadena");
        System.out.println("Digita un Caracter");
        simbolo = sc.next().charAt(0);
        //cadena = sc.nextLine();
        
       // System.out.println("La cadena es "+cadena);
        System.err.println("El caracter es "+simbolo);
    }
    
}
