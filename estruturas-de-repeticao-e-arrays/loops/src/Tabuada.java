import java.util.Scanner;

/*
 * Desenvolva um gerador de tabuada,
 * capaz de gerar a tabuada de qualquer número inteiro entre 1 e 10.
 * O usuário deve informar de qual número ele deseja ver a tabuada.
 * A saída deve ser conforme o exemplo abaixo:
 * Tabuada de 5:
 * 5x1 = 5
 * 5x2 = 10
 * ...
 * 5x10 = 50
 */

public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual tabuada? ");
        int tabuada = scan.nextInt();

        System.out.println("Tabuada de " + tabuada);
        for (int i = 1; i <= 10; i =i + 1){
            System.out.println(tabuada + " X " + i + " = " + (tabuada*i));
        }
    }
}
