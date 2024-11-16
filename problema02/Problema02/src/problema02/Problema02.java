/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/*
Se necesita una solución para un estación de peaje. El objetivo es saber el 
monto a cancelar por peaje, en función del tipo de vehículo y el avalúo del 
mismo. 
*/
package problema02;
import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author Usuarioo
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner entrada = new Scanner(System.in);
       entrada.useLocale(Locale.US);
       
        String propietario;
        double valor_V;
        int type;
        String ntype = "";
        double operacion = 0;
        
        System.out.print("Ingrese el nombre del propietario del vehiculo:");
        propietario = entrada.nextLine ();
        
        System.out.print("Ingrese el valor del vehículo:");
        valor_V = entrada.nextDouble ();
        
        System.out.print("Ingrese el tipo de vehículo:");
        type = entrada.nextInt ();
        
        switch (type) {
            case 1:
                ntype = "Su vehículo es uno liviano particular";
                operacion = (valor_V*1)/100 + 2;
                break;
                
            case 2:
                ntype = "Su vehículo es uno liviano particular";
                operacion = (valor_V*2)/100 + 2.5;
                break;
                
            case 3:
                ntype = "Su vehículo es uno liviano particular";
                operacion = (valor_V*4)/100 + 1.5;
                break;
                
            case 4:
                ntype = "Su vehículo es uno liviano particular";
                operacion = (valor_V*5)/100 + 2.2;
                break;
        }
        
        System.out.printf("Peaje "+" buena vía\n\tPropietario:%s\n"
                         + "Tipo:%s\n\tValor: $%.1f\n\tPeaje: $%.2fs\n\t",
                         propietario, 
                         ntype, 
                         valor_V, 
                         operacion);
       
       
        
    }
    
}
