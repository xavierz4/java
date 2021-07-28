
import java.util.Scanner;

/*
 RETO 1 MINTIC 2022
 */

/**
 *
 * @author xavierz
 */
public class Reto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Ingrese total indisponibilidad primer mes");
        Scanner sc = new Scanner(System.in);
        
        String nivel = ("");
        double primerMes = sc.nextInt();
        double segundoMes = primerMes * 2 + 4;
        double tercerMes =  (primerMes + segundoMes) / 5;
        
        
        if(tercerMes >= 0 && tercerMes <= 20){
           nivel = "uno";
        }
        if(tercerMes >=21 && tercerMes <=30){
           nivel = "dos"; 
        }
        if(tercerMes >= 31 && tercerMes <= 50){
            nivel = "tres";
        }
        if(tercerMes > 50){
            nivel = "cuatro";
        }
        
        System.out.println((int)primerMes);
        System.out.println((int)segundoMes);
        System.out.println((int)tercerMes);
        System.out.println(nivel);
       
    }
    
}
