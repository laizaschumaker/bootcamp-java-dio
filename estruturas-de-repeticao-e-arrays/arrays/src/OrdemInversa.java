
/*
 * Crie um vetor de 6 números inteiros;
 * Mostre-os na ordem inversa.
 */

public class OrdemInversa {
    public static void main(String[] args) throws Exception {

        int[] vetor = {-5, -6, 15, 50, 8, 4};

        //System.out.println(vetor.length);

        System.out.print("Vetor original: ");
        int count =0;
        while(count < (vetor.length)) {
            System.out.print(vetor[count] + " ");
            count++;
        }

        System.out.print("\nVetor inverso: ");
        for(int i = (vetor.length - 1); i >= 0; i --) {
            System.out.print(vetor[i] + " ");
        }

    }

}
