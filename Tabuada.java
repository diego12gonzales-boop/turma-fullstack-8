import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero");
        int numero = input.nextInt();

        System.out.println("Tabuada do " + numero + ":");

        for(int i = 1; i<=10; i = i+1){
          System.out.println(numero + "x" + i + "=" +(numero*i));

        }
    }
}
