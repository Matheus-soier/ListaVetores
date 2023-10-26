import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float[] notas = new float[5];
		float media, soma = 0;
		
		System.out.println("Digite as 5 notas: ");
		
		for(int i = 0; i < 5; i++) {
			notas[i] = sc.nextFloat();
			soma += notas[i];
		}
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Nota do aluno " + i + ": " + notas[i]);
		}
		
		media = soma/5;
		System.out.println("Média total dos alunos é de: " + media);
		
		sc.close();
	}

}
