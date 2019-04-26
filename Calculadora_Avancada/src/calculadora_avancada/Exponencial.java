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
public class Exponencial {
    /**
     * Este método calcula o exponencial de um número
     * @param dnumeros1
     * @param dnumeros2
     * @return O exponencialde um número
     */
    public static double exponencial(double dnumeros1, double dnumeros2){
        int i=1;
        double result = 1;
        try{
            if(dnumeros2 == 0) throw new Exception("SegundoNumeroNulo");
            while(i<=dnumeros2){
            result = result * dnumeros1;
            i++;
            }
        }catch(Exception e){
            System.out.println("Segundo n�mero nulo!");
            result = 1;
        }
        return result; 
    }
}
