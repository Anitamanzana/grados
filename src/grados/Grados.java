/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grados;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Grados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
       String respuesta="";
        do{
        System.out.println("introduce los grados");
        double grados=teclado.nextDouble();
        double kelvin;
        kelvin=(grados+273,15);
        System.out.println(grados+" grados son "+kelvin+ "grados kelvin")
        System.out.println("¿Quieres continuar? teclea SI/NO")
        }
        while(respuesta.equalsIgnoreCase("SI")
             );
        // TODO code application logic here
    }
    
}
