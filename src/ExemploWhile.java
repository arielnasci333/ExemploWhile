
import java.util.concurrent.ThreadLocalRandom;
public class ExemploWhile {
    public static void main(String[] args)  {
        double mesada  = 50.0;
        while( mesada>0 ) {
            Double valorDoce = valorAleatorio();

            /* //Foi comentado este trecho, para poder imprimir valor negativo da mesada
            if(valorDoce > mesada) 
               valorDoce = mesada;
            */

            System.out.println("Doce do valor " + valorDoce + " Adicionado ao Carrinho");
            mesada = mesada - valorDoce;
            
        }
        System.out.println("Mesada: " +  mesada);
        System.out.println("Joãozinho gastou toda a sua mesada com doces!");      
    } 
    
    //O metodo é colocado dentro da classe, mas fora do main, para que ele possa ser chamado por outros metodos. 
    private static Double valorAleatorio() {
        // Gera um valor aleatório entre 2 e 8
            return ThreadLocalRandom.current().nextDouble(2, 8);
}
}