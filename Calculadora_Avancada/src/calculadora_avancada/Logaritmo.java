/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package log1;

/**
 *
 * @author ANGELO
 */
public class Logaritmo {
     private double result;

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
    public double logaritmo(double dnumeros1, double dnumeros2){ 
        
            this.result=Math.log10(dnumeros2)/Math.log10(dnumeros1);
            return result;
       
        
    }
}
