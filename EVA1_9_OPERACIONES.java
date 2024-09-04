/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_9_operaciones;

/**
 *
 * @author chiri
 */
public class EVA1_9_OPERACIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //OPERACIONES ARITMETICAS
        //INICIALIZACION DE UNA VARIABLE:
        int x = 10; //DECLARACION Y ASIGNACION
        int y = 5;
        //SI NECECITAN MUCHAS VARIABLES:
        int suma, resta, mult, div, pot, raiz;
        
        //SUMA Y RESTA:
        suma = x + y; //OPERADOR DE SUMA +
        System.out.println("La suma de x + y :");
        System.out.println(suma);
        
        resta = x + y;
        System.out.println("Resta es x - y:");
        System.out.println(resta);
        
        //MULTIPLICACION:
        mult = x * y; //OPERADOR DE MULTIPLICACION *
        System.out.println("Multiplicacion de x * y:");
        System.out.println(mult);
        
        //DIVISION:
        
        //EN JAVA, LAS OPERACIONES DEPENDEN DEL TIPO DE DATO
        //DIVIDES ENTEROS, JAVA DA COMO RESULTADO ENTERO
        div = x / y; //OPERADOR DE DIVISION /
        System.out.println("El resultado de la division x (10) / (6):");
        System.out.println(div);
        x = 5;
        y = 2;
        div = x / y;
        System.out.println("Division de x (5) / y (2):");
        System.out.println(div);
        
        //DIVISION CON NUMEROS CON PUNTO FLOTANTE
        double val1 = 5;
        double val2 = 2;
        double resu;
        resu = val1 / val2;
        System.out.println("Division de val1 (5) / val2 (2):");
        System.out.println(resu);
     
        
        
        
    }
    
}
