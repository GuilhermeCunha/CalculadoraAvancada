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
public class Divisao {
    /**
     * Este método realiza a divisãp entre dois números
     * @param a
     * @param b
     * @return A divisão entre dois números
     */
    public static double dividir(double a, double b){
        double result = 0.0;
        try{
            if(b == 0) throw new Exception("DivisaoPor0");
            result = a/b;
        }catch(Exception e){
            System.out.println("Divisao por 0 nao permitida!");
            
        }
        return result;
    }    
}
