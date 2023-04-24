import java.util.Scanner;
/*
Crie um algoritmo que leia uma idade de uma pessoa e calcule quantos dias essa pessoa já viveu.
*/
public class Exercicio5 {
    public static void main(String[] args) {
    Scanner entrada= new Scanner(System.in);

    System.out.print("Digite seu nome: ");
    String nome = entrada.nextLine();

    System.out.print("Digite sua idade: ");
    int idade = entrada.nextInt();

    long diasVividos = (idade * 365);

    System.out.printf("Olá %s%nVocê já viveu %d dias!!!! %n ", nome, diasVividos);


    }
}
