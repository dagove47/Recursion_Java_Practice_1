/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recursion_Java_Practice_1;

/**
 *
 * @author David Gomez, Gabriel Brilla, Gerald Blanco, Alexander Torres
 */
public class ExerciseB {
    int n = Integer.parseInt(JOptionPane.showInputDialog("Digite el el "
        + "hasta el que quiere sumar")); 
        //usuario digita el numero deseado y se convierte en un int
        int suma = (n*(n+1))/(2);
        System.out.println("La respuesta de la suma es : " + suma);
}
