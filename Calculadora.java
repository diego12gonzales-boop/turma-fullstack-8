import java.util.Scanner;

public class Calculadora {
    public static void main(String[]args){
    
    Scanner input = new Scanner(System.in);
       System.out.println("digite a primeira nota");
        double n1 = input.nextDouble();
     System.out.println("digite a segunda nota");
    double n2 = input.nextDouble();

    double media = (n1 + n2)/2;

   System.out.printf("a media das notas é = %.2f/n", media);

    }
}
