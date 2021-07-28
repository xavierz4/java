
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
public class Reto1Java {
    public static String nivelInd(int primerMes){
     
        
        String nivel = ("");
        
        int segundoMes = primerMes * 2 + 4;
        int tercerMes = primerMes + segundoMes / 5;   
        
 
        if(tercerMes >= 0 && tercerMes <= 20){
           nivel = "uno";
        }
        else if(tercerMes >=21 && tercerMes <=30){
           nivel = "dos"; 
        }
        else if(tercerMes >= 31 && tercerMes <= 50){
            nivel = "tres";
        }
        else if(tercerMes > 50){
            nivel = "cuatro";
        }
        return (nivel);
        
       
      
        
    }
          
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       System.out.println("Ingrese total indisponibilidad primer mes");
       Scanner sc = new Scanner(System.in); 
        int primerMes = sc.nextInt();
        String nivel = ("");
        
        int segundoMes = primerMes * 2 + 4;
        int tercerMes = primerMes + segundoMes / 5; 

        if(tercerMes >= 0 && tercerMes <= 20){
           nivel = "uno";
        }
        else if(tercerMes >=21 && tercerMes <=30){
           nivel = "dos"; 
        }
        else if(tercerMes >= 31 && tercerMes <= 50){
            nivel = "tres";
        }
        else if(tercerMes > 50){
            nivel = "cuatro";
        }
       
    
        
    }
    
}
