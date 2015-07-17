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
public class Rombo {
    
    
    public static void main(String[] args) {
    double diagonalmayor= Double.parseDouble(args[0]);
    double diagonalmenor= Double.parseDouble(args[1]);
  
    double areaRombo = (diagonalmayor * diagonalmenor) / 2;
        
       
    System.out.println("La diagonal mayor es"+ diagonalmayor);
    
    System.out.println("La diagonal menor es"+ diagonalmenor);
    
    System.out.println("El área del rombo es: "+ areaRombo);
    

}
    
    
}