/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entornospgit;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author Paco
 */
public class DesdeConsola {

    private static File f;

    DesdeConsola() {
        f = new File("Fichero.txt");
    }

    public void maxMinC() {
        //variables
        int max = 0, min=32767, num = 0;
        int numero=0;
        
        while(numero!=-1){
            System.out.println("Introduce numeros, cuando quieras parar introduce un -1");
            Scanner numIn= new Scanner(System.in);
            numero=numIn.nextInt();
            //compruebo maximo
            if(numero>max){
                max=numero;
            }
            if (numero<min){
                min=numero;
            }
            
        }
        System.out.println("El máximo es "+ max);
        System.out.println("El mínimo es "+ min);
        
        

    }

   
        
    
}



