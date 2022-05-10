/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entornospgit;

import java.util.Scanner;

/**
 *
 * @author Ronal Arrayaza
 */
public class numeros {
    //Lectura de variables desde consola
     public void maximo() {
        //variables
        int max = 0, num = 0;       
        Scanner entrada = new Scanner(System.in);
        
        do{
            System.out.println("Introduzca un numero o -1 para salir");
            num=entrada.nextInt();
            if(num>max && num!=-1){
                max=num;
            }            
        } while (num!=-1);
        System.out.println("El mayor es " + max);            
    }
     
     public void minimo(){
         int min = 0, num = 0;
       
        Scanner entrada = new Scanner(System.in);
        
        do{
            System.out.println("Introduzca un numero o -1 para salir");
            num=entrada.nextInt();
            if(num<min && num!=-1){
                min=num;
            }            
        } while (num!=-1);
        System.out.println("El menor es " + min);  
     }
}
