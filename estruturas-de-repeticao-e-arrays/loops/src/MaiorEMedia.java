import java.util.Scanner;

/*
 * Faça um programa que leia 5 números
 * e informe o maior número
 * e a média desses números.
 */

public class MaiorEMedia {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        double soma = 0;

        int count = 0;
        
        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            soma = soma + numero;

            if (numero > maior) maior = numero;

            count = count + 1;

        } while(count < 5);

        System.out.println("O Maior número é: " + maior);
        System.out.println("A média é: " + (soma/5));

    }
    
}
