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
public class Consola {
    
    Consola(){
        
    }
    
    Scanner ent = new Scanner(System.in);
    
    int num1 = ent.nextInt();
    int num2 = ent.nextInt();
    
    public void maximo(){
        if(num1<num2){
            System.out.println("Num2 es mayor");
        }else{
            System.out.println("Num1 es menor");
        }
    }
    
    
    
      

    
    

    
}
