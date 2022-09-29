import javax.swing.JOptionPane;
package Recursion_Java_Practice_1;

/**
 *
 * @author David Gomez, Gabriel Brilla, Gerald Blanco, Alexander Torres
 */
public class ExerciseB {
    
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite el "
        + "hasta el que quiere sumar")); 
        int suma = (Adicion(num));
        System.out.println("El resultado de la suma deseada es = " + suma);
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
