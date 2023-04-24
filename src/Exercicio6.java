import java.util.Scanner;
/*
Crie um algoritmo que leia dois valores (x e y) e informe qual o maior valor.
 */

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int n1 = entrada.nextInt();

        System.out.print("Digite um numero: ");
        int n2 = entrada.nextInt();

        if(n1 > n2 ){
            System.out.printf("O número %d é maior que o número %d", n1, n2);
        } else if (n1 == n2 ) {
            System.out.printf("O numero %d, é igual ao número %d", n1, n2);
        }else{
            System.out.printf("O número %d é maior que o número %d", n2, n1);
        }
    }
}
