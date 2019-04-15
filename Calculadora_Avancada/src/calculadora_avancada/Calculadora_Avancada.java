/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora_avancada;

import java.util.Scanner;

import static calculadora_avancada.Adicao.somar;
import static calculadora_avancada.Subtracao.subtrair;
import static calculadora_avancada.Multiplicacao.multiplicar;
import static calculadora_avancada.Divisao.dividir;
import static calculadora_avancada.Porcentagem.porcentagem;
import static calculadora_avancada.Raiz.raiz;
import static calculadora_avancada.Exponencial.exponencial;
import static calculadora_avancada.Logaritmo.logaritmo;


/**
 *
 * @author Guilherme
 */
public class Calculadora_Avancada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] strNumeros;
        String strTexto;
        double dnumeros1 = 0.0, dnumeros2 = 0.0;
        
        boolean teste;
        
        do{
            teste = false;
            System.out.println("Digite o que pretende calcular: \n");
            strTexto = entrada.nextLine();
            strNumeros = strTexto.split(" ");
            
            try{
                dnumeros1 = Double.parseDouble(strNumeros[0]);
                dnumeros2 = Double.parseDouble(strNumeros[2]);
            }catch(NumberFormatException e){
                System.out.println("O formato do calculo deve ser :\n<NUMERO(S)><ESPAÇO><OPERAÇÃO><ESPAÇO><NUMERO(S)>");
                teste = true;
            }
            
        }while(teste);
        
        
        
        
        
        //System.out.println("Limite1 : " + limite1 + "\nLimite2: " + limite2);
        //System.out.println("Numeros1 : " + dnumeros1 + "\nNumeros2: " + dnumeros2);
        
       
        switch(strNumeros[1]){
            case "+":
                System.out.println("Resultado da soma: " + somar(dnumeros1, dnumeros2));
                break;
            case "-":
                System.out.println("Resultado da subtração: " + subtrair(dnumeros1, dnumeros2));
                break;
            case "*":
                System.out.println("Resultado da multiplicação: " + multiplicar(dnumeros1, dnumeros2));
                break;
            case "/":
                System.out.println("Resultado da divisão: " + dividir(dnumeros1, dnumeros2));
                break;
              
            case "v":
                System.out.println("Resultado da raiz quadrada: " + raiz(dnumeros1, dnumeros2));
                break;
            case "l":
                System.out.println("Resultado desse logaritmo: " + logaritmo(dnumeros1, dnumeros2));
                break;
            case "^":
                System.out.println("Resultado dessa exponenciação: " + exponencial(dnumeros1, dnumeros2));
                break;
            case "%":
                System.out.println("Resultado dessa porcentagem: " + porcentagem(dnumeros1, dnumeros2));
                break;
            
            default: 
                break;             
        }
      
    }
    
}
