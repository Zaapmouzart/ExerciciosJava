/*Crie um sistema de cadastro de usuário onde o usuário deva inserir os dados: Nome, Endereço, Telefone e
ano de nascimento.
E imprima todos esses dados na tela, calculando inclusive a idade do usuário.
 */
import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite seu Endereço");
        String endereco = entrada.nextLine();

        System.out.print("Digite seu telefone ");
        Long telefone = entrada.nextLong();

        System.out.print("Digite o ano em que você nasceu");
        int anoNascimento = entrada.nextInt();

        System.out.print("Digite o ano atual");
        int anoAtual = entrada.nextInt();

        int idade = anoAtual - anoNascimento;


        System.out.printf("Esses foram os dados cadastrados: %n %s%n %s%n %d%n %d%n %d%n %d%n ", nome, endereco, telefone, anoNascimento, anoAtual, idade);


    }
}
