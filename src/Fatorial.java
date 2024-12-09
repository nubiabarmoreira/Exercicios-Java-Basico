import java.util.Scanner;

public class Fatorial {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        int resultado = 1;
        int i = 1;

        System.out.printf("Digite um número: ");
        int number = sc.nextInt();

        while (i <= number) {
            resultado *= i;
            i++;
            System.out.println("O fatorial do número " + number + " é igual a : " + resultado);
        }

        sc.close();
    }
}
