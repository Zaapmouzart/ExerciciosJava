import java.util.Scanner;

/*
Crie um programa que solicite 2 numeros e compara se os dois são iguais.
 */
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        System.out.print("Digite primeiro numero: ");
        int num1 = entrada.nextInt();

        System.out.print("Digite o seguno numero");
        int num2 = entrada.nextInt();

        if (num1 == num2){
            System.out.printf("O número %d é igual ao número %d%n", num1, num2);
        }else{
            System.out.printf("O número %d é diferente do número %d%n", num1, num2);
        }

        System.out.println("Fim do programa!!!");




    }
}
