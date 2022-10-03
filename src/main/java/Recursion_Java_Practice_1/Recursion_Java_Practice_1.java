/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Recursion_Java_Practice_1;

import javax.swing.JOptionPane;

/**
 *
 * @author David Gomez, Gabriel Brilla, Gerald Blanco, Alexander Torres
 */
public class Recursion_Java_Practice_1 {

    public static void main(String[] args) {
        String practiceSelect = MainMenu();        
        switch (practiceSelect) {
            case "a":
                ExerciseA exerciseA  = new ExerciseA();
                exerciseA.solucionA();
                break;
            case "b":
                ExerciseB.SolucionB();
                break;
            case "c":
                ExerciseC exerciseC  = new ExerciseC();
                exerciseC.solutionC();
                break;
            case "d":
                ExerciseD.SolutionD();
                break;
        }
    }
    
    
    public static String MainMenu() {
        boolean repeat = true;
        String practiceSelect = "";
        while (repeat) {
            practiceSelect = JOptionPane.showInputDialog("Práctica Recursividad \n\n" + 
                "a. Elimine las vocales de una oración e imprima la oración resultante. \n" +
                "b. Crear un método que obtenga la suma de los números naturales desde 1 hasta N. \n" +
                "c. Compruebe si un número es binario. Un número binario está formado únicamente por ceros y unos. \n" +
                "d. Convierta el siguiente código de ciclos for en funciones recursivas. \n\n" +
                "Digite  'a',  'b',  'c'  o  'd' \n").toLowerCase();            
            if((practiceSelect.equals("a")) || (practiceSelect.equals("b")) || (practiceSelect.equals("c")) || (practiceSelect.equals("d"))) {
                repeat = false;
            } else {
                JOptionPane.showMessageDialog(null, "Valor invalido");
            }
        }
        return practiceSelect;
    }
    
    
}
