/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recursion_Java_Practice_1;

import javax.swing.*;

/**
 *
 * @author David Gomez, Gabriel Brilla, Gerald Blanco, Alexander Torres
 */
public class ExerciseA {
    
    public void solucionA(){
        //Llamando datos
        char[] oracion = (JOptionPane.showInputDialog("Ingrese una oracion: ")).toCharArray();
        String nuevaOracion = String.valueOf(eliminarVocales(0, oracion));
        JOptionPane.showMessageDialog(null, "oracion sin vocales: " + nuevaOracion.replace(" ",""));
    }
    
    //Utilizando Recursividad
    public char[] eliminarVocales(int i, char[] array) {
        if (i == array.length) {
            return array;
        } else {
            char letra = array[i];
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'|| letra == 'A'
                    || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
                array[i] = ' ';
            }
            return eliminarVocales(++i, array);
        }
    }
}
