import java.util.Scanner;

/*
 * Faça um programa que peça N números inteiros,
 * calcule e mostre a quantidade de números pares
 * e a quantidade de números impares.
 */

public class ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int quantPares = 0, quantImpares = 0;

        System.out.println("Informe a quantidade de números desejados: ");
        quantNumeros = scan.nextInt();

        int count = 0;
        do{
            System.out.println("Numero: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) quantPares++;
                else quantImpares++;

            count++;
        } while(count <  quantNumeros);

        System.out.println("Quantidade de números Par: " + quantPares);
        System.out.println("Quantidade de números Ímpar: " + quantImpares);

    }
}
