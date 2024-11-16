/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/*
Elaborar un programa en Java que permita leer los datos de un empleado (nombre, 
tipo de empleado y sueldo); luego que imprima el nombre, sueldo inicial, 
incremento de sueldo y su nuevo sueldo de acuerdo a lo siguiente:

Si es tipo de empleado 1 se le aumentará el 5%,
Si es tipo 2 se le aumentará el 7%,
Si es 3, el 9%,
Si es 4, el 12% y
Si es 5 o cualquier otro tipo, el 15%
*/
package problema03;
import java.util.Scanner;
/**
 *
 * @author Usuarioo
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner entrada = new Scanner(System.in);
        
        String nombre;
        int tipo_E;
        double sueldo ;
        double incremento_S= 0;
        
        
        System.out.println("Ingrese el nombre del empleado");
        nombre = entrada.nextLine();
        
        System.out.println("Ingrese el sueldo del empleado");
        sueldo = entrada.nextDouble();
        
        System.out.println("Ingrese que tipo de empleado es");
        tipo_E = entrada.nextInt();
        
        
        if (tipo_E == 1){
            incremento_S = sueldo * 0.5;
            
        }else{
            if (tipo_E == 2 ){
                incremento_S = sueldo * 0.7;
                
            }else{
                if (tipo_E == 3 ) {
                    incremento_S = sueldo *0.9;
                    
                }else{
                    if(tipo_E == 4){
                        incremento_S = sueldo *0.12;
                        
                    }else{
                        if (tipo_E >=5)
                            incremento_S = sueldo *0.12;
                    }
                }
            }
        }
        
       double sueldo_D = sueldo + incremento_S;
        
        
        System.out.printf("Nombres: %s\nSueldo inicial: $%.2f\n"
                         + "Incremento de sueldo: $%.2f\n"
                         + "Sueldo total: $%.2f\n",
                         nombre, 
                         sueldo, 
                         incremento_S, 
                         sueldo_D);  
    }
    
}
