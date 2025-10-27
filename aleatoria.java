import java.util.Scanner;

public class aleatoria {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("digite seu peso");
        double peso = input.nextDouble();

        System.out.println("digite sua altura");
          double altura = input.nextDouble();


      double imc = peso / (altura  * altura);

        System.out.printf("Seu IMC é = %.2f\n", imc);


    }
}
