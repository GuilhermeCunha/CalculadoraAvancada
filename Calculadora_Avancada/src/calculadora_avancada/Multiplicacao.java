/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora_avancada;

/**
 *
 * @author aluno
 */
public class Multiplicacao {
    /**
     * Este método realiza a multiplicação entre dois números
     * @param a
     * @param b
     * @return A multiplicação entre dois números
     */
    public static double multiplicar(double a, double b){
        double result = 0.0;
        try{
            result = a * b;
        }catch(Exception e){
            System.out.println("Algum erro ocorreu!");
        }
        return result;
    }
}
