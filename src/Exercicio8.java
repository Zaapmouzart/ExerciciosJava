/*
 Escreva um algoritmo que leia uma letra que represente o sexo de uma pessoa (M para Masculino e F para feminino).
 Se for masculino, mostra a mensagem “Seja bem-vindo, Senhor!”,
 se for feminino, mostra a mensagem “Seja bem-vinda, Senhora!”
*/
import java.util.Scanner;
public class Exercicio8 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Digite M - Masculino ou N- Feminino: ");
    String sexo = entrada.nextLine();

    if (sexo.equals("M") || sexo.equals("m")){
        System.out.println("Seja bem vindo Senhor ");
    } else if (sexo.equals("F") || sexo.equals("f")) {
        System.out.println("Seja bem Vinda senhora");
    }else{
        System.out.println("Opção inválida");
    }

    }
}
