import java.util.Scanner;

public class Palindromo {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int number = input.nextInt();
        String palindromo = "";

        String numberConverted = String.valueOf(number);

        for (int i = numberConverted.length() -1; i >= 0; i --){
            palindromo += numberConverted.charAt(i);
        }

        if (palindromo.equals(numberConverted)) {
            System.out.print("O número " + palindromo + " é um palíndromo.");
        }
        else {
            System.out.print("O número " + palindromo + " não é um palíndromo.");

        }

        input.close();
    }
}

// Exercício realizado com base em pesquisas. Tive dificuldade em elaborar esse raciocínio.
