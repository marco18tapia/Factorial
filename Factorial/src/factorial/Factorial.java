
package factorial;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner IFactorial = new Scanner(System.in);
        
        System.out.println("Ingrese el numero del que desea el factorial");
        int NFac = IFactorial.nextInt();
        
        CalculoFactorial calculofactorial = new CalculoFactorial();
        calculofactorial.mostrarfactorial(NFac);
    }
}
