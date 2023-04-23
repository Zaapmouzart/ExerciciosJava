/*
Crie um algoritmo que leia um numero do usuário
e informe se é positivo ou negativo.

 */
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Digite um número inteiro");
    int numero = entrada.nextInt();

    if (numero < 0 ){
        System.out.printf("O numero %d é um inteiro negativo ", numero);
    }else{
        System.out.printf("O número %d é um inteiro positivo ", numero);
    }



    }

}
