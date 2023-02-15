import java.util.Scanner;

/*
* Faça um programa que leia conjuntos de dois valores;
* O primeiro representando o nome e o segundo representando a idade;
* Pare o programa quando inserir o valor 0 no campo nome.
*/

public class NomeEIdade {
    public static void main(String[] args) throws Exception {

         Scanner scan = new Scanner(System.in);

         String nome;
         int idade;

         while(true){
            System.out.println("Nome: ");
            nome = scan.next();
            
            if (nome.equals("0")) break;

            System.out.println("Idade: ");
            idade = scan.nextInt();
         }

         System.out.println("Após break no while, continua daqui...");
    }
}
