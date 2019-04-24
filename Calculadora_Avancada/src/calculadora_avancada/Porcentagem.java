
package calculadora_avancada;

public class Porcentagem {
     public static double porcentagem(double a, double b){
        double result = 0.0;
        
        try{
            result = (a*(b/100));
        }catch(Exception e){
            System.out.println("Algum erro ocorreu!");
        }
        return result;
     }
}
