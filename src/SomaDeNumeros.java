import java.util.Scanner;

public class SomaDeNumeros{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int soma = 0;

        System.out.printf("Digite um número: ");
        int number = scanner.nextInt();

        for (int i = 0; i <= number ; i++){
            soma += i;
            System.out.println("A soma dos números 1 a " + number + " é igual a : " + soma);
        }

        scanner.close();
    }
}




