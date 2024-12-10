import java.util.Scanner;

public class Fibonacci {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número para limite da sequência de Fibonacci: ");
        int number = input.nextInt();

        int a = 0, b = 1;

        System.out.println("Série de Fibonacci: ");
        int contador = 0;
        while (contador < number) {
            System.out.println(a + " ");
            int next = a + b;
            a = b;
            b = next;
            contador++;
        }
        System.out.println();

        input.close();
    }
}

// Exercício realizado com base em pesquisas. Tive dificuldade em elaborar esse raciocínio.
