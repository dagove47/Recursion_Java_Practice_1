/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recursion_Java_Practice_1;

import javax.swing.JOptionPane;

/**
 *
 * @author David Gomez, Gabriel Brilla, Gerald Blanco, Alexander Torres
 */
public class ExerciseD {
    
    private static double resultR;
    private static double facR;
    
    public static void SolutionD() {
        resultR = 0;
        
        double number = Double.parseDouble(JOptionPane.showInputDialog("Digite el numero al que le desea calcular un exponente"));
        double exponent = Double.parseDouble(JOptionPane.showInputDialog("Digite el exponente que le desea calcular al numero"));
        
        JOptionPane.showMessageDialog(null, "Resultado utilizando ciclos for: " + calcExponential(number, exponent) + "\n\n" +
                "Resultado utilizando recursion: " + calcExponentialR(number, exponent) + "\n\n");      
    }

    //  Using Recursion 
    public static double calcExponentialR(double n, double x) {
        if (n > 0) {
            facR = 1;
            resultR += (Math.pow(x, n-1) / factorialR(n-1));
            calcExponentialR(n - 1, x);
        }
        return resultR;
    }
    public static double factorialR(double num) {
        if (num < 0) {
            JOptionPane.showMessageDialog(null, "Valor incorrecto \n\n" +
                    "El numero al que desea aplicar factorial es negativo");
            System.exit(0);
        } else if (num == 0) {
            facR *= 1;
        } else {
            facR = facR * (num);
            factorialR(num - 1);
        }
        return facR;
    }
    
    //  Using For Loop
    public static double calcExponential(double n, double x) {
        double result = 0;
        for (int i = 0; i < n; i++) {
            result = result + (Math.pow(x, i) / factorial(i));
        }
        return result;
    }
    public static double factorial(double num) {
        double result = 1;
        for (int i = 1; i <= num; i++) {
            result = result * i;
        }
        return result;
    }

}
