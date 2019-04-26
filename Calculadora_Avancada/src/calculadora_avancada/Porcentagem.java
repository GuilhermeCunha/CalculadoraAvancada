
package calculadora_avancada;

public class Porcentagem {
    /**
     * Este método calcula uma certa porcentagem de um número
     * @param a
     * @param b
     * @return A porcentagem de um número
     */
     public static double porcentagem(double a, double b){
        double result = 0.0;
        
        try{
            if(b==0){
                return 0;
            }
            result = (a*(b/100));
        }catch(Exception e){
            System.out.println("Algum erro ocorreu!");
        }
        return result;
     }
}
