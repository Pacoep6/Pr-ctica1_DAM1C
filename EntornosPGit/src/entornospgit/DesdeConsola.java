/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entornospgit;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class DesdeConsola {
    int max=0;
    int min=999999999;
    int numero;
    int cont=0;
   public void maximo(){ 
       while (cont<=10){
            Scanner entrada= new Scanner(System.in);
            System.out.println("Escribe un numero");
            numero=entrada.nextInt();
            if (max < numero){
            max=numero;
           cont++;
        }
        System.out.println("El minimo es "+ max);

    }
}
   public void minimo(){
       while(cont<=10){
        Scanner entrada= new Scanner(System.in);
        System.out.println("Escribe un numero");
        if(min > numero){
         min=numero;
        }
        cont++;
       }
       System.out.println("El minimo es "+ min);
    }
}
    
   
    
    

