import java.util.Scanner;
public class ExercicioIMC {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite seu sexo M - Masculino ou F - Feminino ");
        String sexo = entrada.nextLine();

        System.out.print("Digite sua altura: ");
        double altura = entrada.nextDouble();

        System.out.print("Digite seu peso: ");
        double peso = entrada.nextDouble();

       double imc = peso / (altura * altura);

        if (sexo.equals("F") || sexo.equals("f")){
            if(imc < 19.1){
                System.out.printf("Ola %s!!%nDe acordo com os dados informados:%nPeso:%.2f%nAltura%.2f%nSeu IMC é" +
                        " de %.2f%nVocê está abaixo do peso.", nome, peso, altura, imc);
            } else if (imc > 19.1 && imc <25.8) {
                System.out.printf("Ola %s!!%nDe acordo com os dados informados:%nPeso:%.2f%nAltura%.2f%nSeu IMC é" +
                        " de %.2f%nVocê está no peso ideal.", nome, peso, altura, imc);
            } else if (imc > 25.9 && imc < 27.3) {
                System.out.printf("Ola %s!!%nDe acordo com os dados informados:%nPeso:%.2f%nAltura%.2f%nSeu IMC é" +
                        " de %.2f%nVocê está um pouco acima do peso ideal.", nome, peso, altura, imc);
            } else if (imc > 27.4 && imc < 32.3) {
                System.out.printf("Ola %s!!%nDe acordo com os dados informados:%nPeso:%.2f%nAltura%.2f%nSeu IMC é" +
                        " de %.2f%nVocê está acima do peso ideal.", nome, peso, altura, imc);
            } else {
                System.out.printf("Ola %s!!%nDe acordo com os dados informados:%nPeso:%.2f%nAltura%.2f%nSeu IMC é" +
                        " de %.2f%nO seu caso se caracteriza obesidade, procure um médico!!.", nome, peso, altura, imc);
            }
        } else if (sexo.equals("M") || sexo.equals("m")) {
            if(imc < 20.7){
                System.out.printf("Ola %s!!%nDe acordo com os dados informados:%nPeso:%.2f%nAltura%.2f%nSeu IMC é" +
                        " de %.2f%nVocê está abaixo do peso.", nome, peso, altura, imc);
            } else if (imc > 20.8 && imc < 26.4) {
                System.out.printf("Ola %s!!%nDe acordo com os dados informados:%nPeso:%.2f%nAltura%.2f%nSeu IMC é" +
                        " de %.2f%nVocê está no peso ideal.", nome, peso, altura, imc);
            } else if (imc > 26.5 && imc < 27.8) {
                System.out.printf("Ola %s!!%nDe acordo com os dados informados:%nPeso:%.2f%nAltura%.2f%nSeu IMC é" +
                        " de %.2f%nVocê está um pouco acima do peso ideal.", nome, peso, altura, imc);
            } else if (imc > 27.9 && imc < 31.1) {
                System.out.printf("Ola %s!!%nDe acordo com os dados informados:%nPeso:%.2f%nAltura%.2f%nSeu IMC é" +
                        " de %.2f%nVocê está acima do peso ideal.", nome, peso, altura, imc);
            }else {
                System.out.printf("Ola %s!!%nDe acordo com os dados informados:%nPeso:%.2f%nAltura%.2f%nSeu IMC é" +
                        " de %.2f%nO seu caso se caracteriza obesidade, procure um médico!!.", nome, peso, altura, imc);
            }
        }

    }
}
