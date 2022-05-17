/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entornospgit;

import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ian
 */
public class IntroducirNumeros {

    int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void maximo() {
        Scanner sc = new Scanner(System.in);//Creación de un objeto Scanner
        int salida = 1;
        int num, max = 0;
        System.out.println("Introduce el numero, introduce el 0 cuando quieras salir");
        while (salida != 0) {
            num = sc.nextInt();
            System.out.println("Introduce otro numero");
            salida = num;
            if (max < num) {
                max = num;
               
            }
        }
         System.out.println("El numero maximo ha sido: "+max);
    }

}
