/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hipotenusa;

/**
 *
 * @author USER
 */
public class Hipotenusa {

    double lado1;
    double lado2;
    double hipotenusa;

    public double calcularHipotenusa(double lado1, double lado2) {
        double hipotenusa;
        
        hipotenusa = Math.sqrt(Math.pow(lado2, 2) + Math.pow(lado1, 2));
        return hipotenusa;
    

    }
}
