/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/*
Se necesita una solución que permita generar operaciones aritméticas, tales 
como: suma, resta, multiplicación, división, módulo, potencia. 
Independientemente de la operación que se vaya a realizar, se solicita trabajar 
con dos número ingresados por teclado. Existe una restricción, se puede ejecutar 
cualquiera de las operaciones, siempre que el primer número ingresado, sea mayor 
al segundo ingresado.

Ejemplo: Si el usuario decide hacer una resta, la misma se la puede hacer con 
valores como: num1 = 10 y num2 = 8.

*/
package problema01;
import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author Usuarioo
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
 
        double valor1;
        double valor2;
        double resultado = 0;
        
        System.out.println("Ingrese el primer valor la operación");
        valor1 = entrada.nextDouble();
        
        System.out.println("Ingrese el segundo valor la operación");
        valor2 = entrada.nextDouble();

        System.out.println("Selecciones la operación que desea realizar\n"
                + "Ingrese 1 para sumar\n"
                + "Ingrese 2 para restar\n"
                + "Ingrese 3 para multiplicar\n"
                + "Ingrese 4 para dividir\n"
                + "Ingrese 5 para potencia\n"
                + "Ingrese 6 para módulo\n");
        
            int operador = entrada.nextInt();

        if (valor1 > valor2 ) {
            
            switch (operador) {

                
                case 1:
                    resultado = valor1 + valor2;
                    break;

                case 2:
                    resultado = valor1 - valor2;
                    break;

                case 3:
                    resultado = valor1 * valor2;
                    break;
                
                case 4:
                    resultado = valor1 / valor2;
                    break;
                
                case 5:
                    resultado = Math.pow(valor1, valor2);
                    break;
                
                case 6:
                    resultado = (valor1 % valor2);
                    break;
                default:
                    System.out.println("Operación incorrecta");
                    break;

            }

        } else {
            System.out.println("Valor fuera de rango");

        }

  System.out.printf("El resultado de la operación es : %s\n", resultado);
        
        
        
    }
    
}
