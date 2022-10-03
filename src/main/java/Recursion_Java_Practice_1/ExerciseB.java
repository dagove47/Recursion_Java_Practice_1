package Recursion_Java_Practice_1;

import javax.swing.JOptionPane;

/**
 *
 * @author David Gomez, Gabriel Brilla, Gerald Blanco, Alexander Torres
 */
public class ExerciseB {
    
    public static void SolucionB() {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero del cual quiera obtenga la suma de los números naturales desde 1 hasta ese numero.\n\n")); 
        int suma = (Adicion(num));
        JOptionPane.showMessageDialog(null, "El resultado de la suma deseada es = " + suma);
    }
    
    public static int Adicion(int num){
        if (num != 0){
            return num + Adicion (num - 1);
        }
        else{
            return num;
        }
    }  
}
