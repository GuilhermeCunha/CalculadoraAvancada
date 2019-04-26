/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora_avancada;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Raiz {
    /**
     * Este método calcula a raiz de um número
     * @param a
     * @param b
     * @return A raiz de um número
     */
    public static double raiz(double a, double b){
        double result = 0.0;
        try{
            if ( a < 0 ){
                throw new Exception("NumeroNegativo");
            } else if (a == 1){
                result = a;
            } else    if (b == 2){
                result = Math.sqrt(a);
            } else    if (b == 3){
                result = Math.cbrt (a);
            }
        }catch(Exception e){
            System.out.println("Algum erro ocorreu!");
        }
        return result;
    }
}
