/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora_avancada;

/**
 *
 * @author ANGELO
 */
public class Logaritmo {
    
    /**
     * Este método calcula o logaritmo de um número
     * @param dnumeros1
     * @param dnumeros2
     * @return O logaritmo de um número
     */
    public static double logaritmo(double dnumeros1, double dnumeros2){
        double result=0;
        try{
            result = Math.log10(dnumeros2)/Math.log10(dnumeros1);
        }catch(Exception e){
            System.out.println("Algum erro ocorreu!");
        }
        return result;
    }
}
