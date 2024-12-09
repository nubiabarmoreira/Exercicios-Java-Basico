import java.util.Scanner;

public class InversaoDeNumero {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int number = sc.nextInt();

        int numberConverted = 0;

        while (number > 0) {
            numberConverted = numberConverted *10;
            numberConverted = numberConverted + (number % 10);
            number = number / 10;
        }
        System.out.println(numberConverted);

        sc.close();
    }
}

// Exercício realizado com base em pesquisas. Tive dificuldade em elaborar esse raciocínio.
