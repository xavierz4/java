
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
public class CuadradoNumero {
    
    public static double cuadrado(double x){
        return x*x;
    }
    
    
    public static void main (String[] args){
        System.out.println("Ingrese un numero");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
             
        System.out.println("El resultado es "+cuadrado(n));
    }
    
}

