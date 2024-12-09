import java.util.Scanner;

public class Potencia {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o número base: ");
        int numberBase = input.nextInt();
        System.out.println("Digite o número da potência: ");
        int numberPotencia = input.nextInt();

        System.out.println(expo(numberBase, numberPotencia));

        input.close();
    }

    private static int expo(int x, int y) {
        if (y == 0 || y == 1)
            return x;

        int total = x;

        for (int i = 1; i < y; i++) {
            total *= x;
        }
        return total;
    }
}

// Exercício realizado com base em pesquisas. Tive dificuldade em elaborar esse raciocínio.


