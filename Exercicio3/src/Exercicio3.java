import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
            int[] vetor = new int[5];
            System.out.println("Digite 5 valores: ");
            for(int i = 0; i < 5; i++) {
                vetor[i] = sc.nextInt();
            }
            for(int i = 0; i < 5; i++) {      
                 System.out.println("Posição dos vetores em ordem crescente: " + vetor[i]);
            }
            for(int i = 4; i >= 0; i--) {
                 System.out.println("Posição dos vetores em ordem decrescente: " + vetor[i]);
            }
        sc.close();
    }
}
