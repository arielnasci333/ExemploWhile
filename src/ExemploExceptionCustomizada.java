import java.util.Locale;
import java.util.Scanner;

// Definindo a exceção personalizada
class MinhaExcecao extends Exception {
    public MinhaExcecao(String mensagem) {
        super(mensagem);
    }
}

public class ExemploExceptionCustomizada {
    public static void verificarNumero(int subtracao) throws MinhaExcecao {
        if (subtracao < 0) {
            throw new MinhaExcecao("O 2º parametro deve ser maior que o 1º. Valor da subtracao =  " + subtracao);
        } else {

            for (int i = 1; i <= subtracao; i++) {
                System.out.println("Valor de i: " + i);
            }
            
            System.out.println("Números válidos. 2º prarametro - 1º parametro tem que ser > 0. Valor da subtracao = " + subtracao);
        }
    }

    public static void main(String[] args) {
        try {
                   //Configura o Scanner para usar o ponto como separador decimal
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);  
        
        System.out.println("Digite o primeiro parametro: ");
        int parametroUm = scanner.nextInt();
        
        System.out.println("Digite o segundo parametro: ");
        int parametroDois = scanner.nextInt(); 
         
        int subtracao = parametroDois - parametroUm;
            
            verificarNumero(subtracao);   // Número válido
            //verificarNumero(-5);   // Vai lançar a exceção
        } catch (MinhaExcecao e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        }
    }
}