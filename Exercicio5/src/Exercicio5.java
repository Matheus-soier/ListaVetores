import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] valores = new int[10];
        int[] valoresPar = new int[10];
        int[] valoresModificados = new int[10];
        int verificador;
        int i;

        System.out.println("Digite 10 valores inteiros: ");
        for(i = 0; i < 10; i++) {
            valores[i] = sc.nextInt();
        }
        for(i = 0; i < 10; i++) {
            verificador = valores[i] % 2;
            if(verificador == 0) {
                valoresModificados[i] = (valores[i] * 10);
            } else {
                valoresModificados[i] = (valores[i] + 5);
            }
        }

         for(i = 0; i < 10; i++) {
            System.out.println("Valores modificados: " + valoresModificados[i]);
         }
        sc.next();    
    }
    
}
