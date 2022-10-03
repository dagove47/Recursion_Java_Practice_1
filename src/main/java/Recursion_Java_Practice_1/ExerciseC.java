/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recursion_Java_Practice_1;

/**
 *
 * @author David Gomez, Gabriel Brilla, Gerald Blanco, Alexander Torres
 */
public class ExerciseC {
    
    helper help = new helper();
    private static boolean result;
    
    public void solutionC(){
        int num;
        num = help.recibeInt("Ingrese el número que desea validar: ");
        help.imprimeMensaje("Es el número " + num + " binario? : " + binario(num) + "\n");
    }

    public boolean binario(int num){
        if (num == 0){
            result = true;
        } else if (num % 10 > 1 || num <= -1) {
            result = false;
        }else {
            binario (num / 10);
        }
        return result;
    }
}
