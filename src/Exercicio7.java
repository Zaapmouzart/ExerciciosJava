/*
Crie um algoritmo que leia um número do usuário
 e informe se e o número é par ou ímpar.
 */
import java.util.Scanner;
public class Exercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n1 = entrada.nextInt();


        if(n1 % 2 == 0){
            System.out.printf("O número %d é par", n1);
        }else{
            System.out.printf("O número %d não é par", n1);
        }
    }
}
