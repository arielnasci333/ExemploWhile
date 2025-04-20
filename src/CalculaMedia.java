import java.util.Scanner;


public class CalculaMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        String[] alunos = {"Camila", "Lucas", "Bruna", "Pedro"}; 
        double media = calculaMediaDaTurma(alunos, scan);
        System.out.printf("Media da turma %.2f", media);
    }

    public static double calculaMediaDaTurma(String[] alunos, Scanner scanner) {
        double soma = 0;
        for (String aluno : alunos) {
            System.out.printf("Nota do aluno %s ", aluno);
            double nota = scanner.nextDouble();
            soma += nota;
        }
        return soma / alunos.length;
}
/* Resultados obtidos, entrando com virgula inves de ponto:
Nota do aluno Camila 7,5
Nota do aluno Lucas 5,7
Nota do aluno Bruna 3,9
Nota do aluno Pedro 10,0
Media da turma 6,77
*/
}
