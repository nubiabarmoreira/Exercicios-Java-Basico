import java.util.Scanner;

public class MultiplosDeNumero {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número base: ");
        int numberBase = input.nextInt();
        System.out.println("Digite um número limite: ");
        int numberLimit = input.nextInt();

        System.out.println("Multiplos de " + numberBase + " até " + numberLimit + ":");

        for (int current = numberBase; current <= numberLimit; current += numberBase) {
            System.out.print(current + " ");
        }

        System.out.println();

        input.close();
    }
}

// Exercício realizado com base em pesquisas. Tive dificuldade em elaborar esse raciocínio.
