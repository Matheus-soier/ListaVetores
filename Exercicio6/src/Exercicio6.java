public class Exercicio6 {
    public static void main(String[] args) throws Exception {
       int[] valores = new int[5];
       int[] impares = new int[5];
       valores[0] = 3;
       valores[1] = 5;
       valores[2] = 6;
       valores[3] = 8;
       valores[4] = 10;
       int verificador;
       int soma = 0;
       int i;

        for(i =0;i<5;i++) {
           
            verificador = valores[i] % 2;
            if(verificador != 0) {
                impares[i] = valores[i];
            }
        }
        for(i =0;i<5;i++) {
            soma += impares[i];
        }
        System.out.println("Valor da soma dos impares: " + soma);
    }
}
