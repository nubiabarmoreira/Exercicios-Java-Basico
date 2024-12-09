import java.util.Scanner;

public class NumeroPrimo {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int number = sc.nextInt();

        boolean isPrime = isPrime(number);

        if (isPrime) {
            System.out.println(number + " é um número primo.");
        } else {
            System.out.println(number + " não é um número primo.");
        }

        sc.close();
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        } else{
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }

        return true;
        }
    }
}

// Exercício realizado com base em pesquisas. Tive dificuldade em elaborar esse raciocínio.


