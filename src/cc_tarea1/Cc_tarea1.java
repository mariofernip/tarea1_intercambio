/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cc_tarea1;

/**
 *
 * @author andradema
 */
public class Cc_tarea1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int valor1 = 12;
        int valor2 = 8;
        
        
        System.out.println("Valor 1:"+valor1+" ******");
        
        System.out.println("Valor 2: "+valor2+" ******");
        
        System.out.println("Valores intercambiados");
        
        valor1 = valor1 + valor2;
        valor2 = valor1 - valor2;
        valor1 = valor1 - valor2;
        
        //prubea de git
        
        System.out.println("Valor 1:"+valor1+" ******");
        
        System.out.println("Valor 2:"+valor2+" ******");
    }
    
}
