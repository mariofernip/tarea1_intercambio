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
public class HoroscopoChino {
    public static void main(String[] args) {
        
        int anio= Integer.parseInt(args[0]);
        
       // int anio= 2012;
        
        while (anio >= 1912){                                      
         anio=anio-12;
        }
                   
        if(anio==1900)
        {
        System.out.println("Tu signo es la: RATA");
        }
        if(anio==1901)
        {
        System.out.println("Tu signo es el: BUEY ");
        }
        if(anio==1902)
        {
        System.out.println("Tu signo es el: TIGRE ");
        }
        if(anio==1903) 
        {
        System.out.println("Tu signo es el: CONEJO");
        }
        if(anio==1904) 
        {
        System.out.println("Tu signo es el: DRAGON");
        }
        if(anio==1905)
        {
        System.out.println("Tu signo es la: SERPIENTE");
        }
        if(anio==1906) 
        {
        System.out.println("Tu signo es el: CABALLO");
        }
        if(anio==1907) 
        {
        System.out.println("Tu signo es la: CABRA");
        }
        if(anio==1908) 
        {
        System.out.println("Tu signo es el: MONO");
        }
        if(anio==1909)
        {
        System.out.println("Tu signo es el: GALLO");
        }
        if(anio==1910)
        {
        System.out.println("Tu signo es el: PERRO");
        }
        if(anio==1911)
        {
        System.out.println("Tu signo es el: CERDO");
        }
        
        
        }
}
