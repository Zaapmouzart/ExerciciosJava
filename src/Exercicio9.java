/*
Construa um algoritmo que leia do usuário o salário e exiba uma mensagem de acordo com as seguintes condições:
 se o salário for até R$ 1320, escreva a mensagem “Até 1 salário mínimo;
 se o salário for acima de R$ 1320 e até R$ 3960, escreva a mensagem “Até 3 salários mínimos”;
 se for acima de R$ 3960 e abaixo de R$ 6,600, escreva a mensagem “Até 5 salários mínimos”;
 se for acima de R$6,600, escreva a mensagem “Acima de 5 salários mínimos”.
*/
import java. util.Scanner;
public class Exercicio9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o seu salário bruto: ");
        double salario = entrada.nextDouble();

        if(salario <= 1320){
            System.out.printf("O salário: R$%.2f é de até um salário mínimo ", salario);
        }else if(salario >1320 && salario <=3960){
            System.out.printf("O salário: RS$%.2f é de até 3 salários mínimos", salario);
        }else if(salario >3960 && salario  <= 6600){
            System.out.printf("O salário: R$%.2f é de até 5 sálarios mínimos", salario);
        }else{
            System.out.println("O sálario é de mais de 5 sálarios mínimos");
        }
        System.out.println("Fim do programa!!!");
    }
}
