/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea4_5;

import java.util.Scanner;



/**
 *
 * @author alwud
 */
public class Tarea4_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ingreso= new Scanner(System.in);
        
        do{
            System.out.print("Ingrese lista (x para salir): ");
            analizar(ingreso.nextLine());
            
            
        }while(!ingreso.equals("x"));
        
    }
    
    public static void analizar(String lista){
        Lexico lex;
        Sin sin;
        try{
            lex = new Lexico (new java.io.StringReader(lista));
            sin= new Sin(lex);
            sin.parse();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
