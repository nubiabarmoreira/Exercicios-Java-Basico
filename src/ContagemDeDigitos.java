import java.util.Scanner;

public class ContagemDeDigitos {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int number = sc.nextInt();

        String numberConverted = String.valueOf(number);
        System.out.println("O número " + number + " possui " + numberConverted.length() + " dígito(s).");

        sc.close();
    }
}
