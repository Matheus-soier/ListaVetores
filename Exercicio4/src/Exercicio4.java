import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) throws Exception {
      Scanner sc = new Scanner(System.in);
      
      float[] vetor = new float[10];
      int aprovados = 0, reprovados = 0;
      
      System.out.println("Digite a nota dos 10 alunos: ");
      for(int i = 0; i < 10; i++) {
        vetor[i] = sc.nextInt();
      }
      for(int i = 0; i < 10; i++) {
        if(vetor[i] == 7) {
            System.out.println("Aluno " + i + " tirou " + vetor[i]);
        } else if(vetor[i] == 9) {
              System.out.println("Aluno " + i + " tirou " + vetor[i]);
        }
      }
      for(int i = 0; i < 10; i++) {
        if(vetor[i] >= 7) {
            aprovados++;
        } else if(vetor[i] < 7) {
            reprovados++;
        }
      }

      for(int i = 0; i < 10; i++) {
        System.out.println("Nota do aluno: " + i + " igual a: " + vetor[i]);
      }

      System.out.println("Aluno aprovados: " + aprovados);
      System.out.println("Aluno reprovados: " + reprovados);

      sc.close();
    }
}
