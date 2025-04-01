import java.util.Random;
//import java.util.Scanner;
public class ExemploDoWhile {
    public static void main(String[] args) {
        System.out.println("Discando...");
        do {
            //executando repetidas vezes ate alguem atender
            System.out.println("Telefone tocando");    
        
        }while (tocando());
        System.out.println("Alo !!!");    
    }  
    
    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3) == 1;
            System.out.println("Atendeu ? " + atendeu);
        //negado o ato de continuar tocando
        return ! atendeu; 
        //retorna false para o while, assim o while para de executar 
    }
    
}
