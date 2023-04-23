/* Crie um algoritmo que calcule a média de alunos.
O algoritmo devera pedir as 4 notas bimestrais e calcular a média
Caso a média seja acima de 5 imprima aprovado, caso seja abaixo imprima uma mensagem de reprova.
*/

import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = entrada.nextLine();

        System.out.print("Digite a nota do primeiro bimestre: ");
        double nota1 = entrada.nextDouble();

        System.out.print("Digite a nota do segundo bimestre: ");
        double nota2 = entrada.nextDouble();

        System.out.print("Digite a nota do terceiro bimestre:");
        double nota3 = entrada.nextDouble();

        System.out.print("Digite a nota do quarto bimestre ");
        double nota4 = entrada.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        if (media >= 6) {
            System.out.printf("Parabéns %s, Você foi aprovado!!!%n Sua média foi %.2f%n Boas Férias!!!  ", nome, media);

        } else {
            System.out.printf("%s, Você obteve média %.2f%n Você não alcançou a média mínima para passar" +
                    "%nSe esforce no proximo ano%n Você foi Reprovado%n Boas Férias ", nome, media);
        }



    }
}
