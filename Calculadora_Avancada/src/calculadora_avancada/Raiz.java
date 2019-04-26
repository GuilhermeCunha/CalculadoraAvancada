/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora_avancada;

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
            result = Math.pow(a,b);
        }catch(Exception e){
            System.out.println("Algum erro ocorreu!");
        }
        return result;
    }
}
