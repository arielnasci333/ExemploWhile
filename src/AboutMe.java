import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
  try {   

    //Configura o Scanner para usar o ponto como separador decimal
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);  
         
        System.out.println("digite seu nome: ");
        String nome = scanner.next();
        
        System.out.println("Digite sue sobrenome: ");
        String sobreNome = scanner.next();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

    }
    //O catch vem depois do try, e é executado caso ocorra um erro no bloco try
    //O finally é opcional e é executado sempre, independente de erro ou não
    catch (InputMismatchException e) {
        System.out.println("Os campos idade e altura precisam serem numericos");
    } 

    }
}
