import java.util.Scanner;

public class BinarioParaDecimal {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número: ");
        String numberBinario = input.next();

        if (numberBinario.matches("[01]+")) {
            int decimal = Integer.parseInt(numberBinario, 2);
            System.out.println("O número decimal correspondente é: " + decimal);
        } else {
            System.out.println("Fineza informar um número binário.");
        }

        input.close();
    }
}

// Exercício realizado com base em pesquisas. Tive dificuldade em elaborar esse raciocínio.
