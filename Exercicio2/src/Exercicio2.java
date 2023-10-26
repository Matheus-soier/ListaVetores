import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in);
       
       float vetor1[] = new float[5];
       float vetor2[] = new float[5];
       float vetor3[] = new float[5];
       float soma=0, media;
        vetor1[0] = 33;
        vetor1[1] = 21;
        vetor1[2] = 45;
        vetor1[3] = 13;
        vetor1[4] = 3;

        vetor2[0] = 8;
        vetor2[1] = 4;
        vetor2[2] = 16;
        vetor2[3] = 28;
        vetor2[4] = 12;

        for(int i = 0; i < 5; i++) {
            vetor3[i] = (vetor1[i] + vetor2[i]) /2;      
            System.out.println("A média da soma de " + vetor1[i] + " com " + vetor2[i] + " é igual a: " + vetor3[i]);
        }
        for(int i = 0; i < 5; i++) {
            soma += vetor3[i];
        }

        media = soma/5;
        System.out.println("A media do vetor 3 é de: " + media);
       sc.close();
    }
}
