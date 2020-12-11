/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenedejercicio;

import java.util.Scanner;

/**
 *
 * @author DAM104
 */
public class ExamenEDEjercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner t=new Scanner(System.in);
        
        int opc;
        
        do{
            System.out.println("MENU");
            System.out.println("1- Horas a Segundos");
            System.out.println("2- Kilómetros a Metros");
            System.out.println("3- Salir");
            
            System.out.print("¿Qué hacemos? --> ");
            opc=t.nextInt();
            
            int horas, segundos;
            int km, metros;
            switch(opc){
                case 1:
                    System.out.print("Introduce las horas: ");
                    horas=t.nextInt();
                    
                    segundos=horas*3600;
                    
                    System.out.println(horas+"h = "+segundos+"s");
                    break;
                    
                case 2:
                    System.out.print("Introduce los kilómetros: ");
                    km=t.nextInt();
                    
                    metros=km*1000;
                    
                    System.out.println(km+"km = "+metros+"m");
                    break;
                    
                case 3:
                    System.out.println("Hasta Pronto");
                    break;
                    
                default:
                    System.out.println("Has introducido una opción errónea");
                    System.out.println("Introducela de nuevo");
            }
            
        } while(opc!=3);
    }
    
}
