package factorial;
public class CalculoFactorial {
    int contador;
    //declaracion metodo factorial recursiva
    public long factorial(long numero){
        if (numero<=1) 
            return 1;   
        else //paso recursivo
            return numero*factorial(numero-1);
    }
    public void mostrarfactorial(int NFa){
        //calcula los factoriales
        for ( contador = 0; contador <= (NFa-1); contador++) {
        }  // fin metodo mostrarFactorial
         System.out.printf("%d! = %d\n",contador,factorial(contador));
    }
}
