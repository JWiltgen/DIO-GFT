package ECJ;

// 2 - Estrutura de Controle Java

import java.util.Scanner;

public class ECJ_Exercise3
{
    public static void run()
    {
        // Print a welcome message to the console
        System.out.println("Bem-vindo ao exercício de Números Pares e Ímpares!");
        System.out.println("Este exercício irá mostrar os números pares e ímpares entre dois números fornecidos pelo usuário.");
        // Create a Scanner object to read user input
        var scanner = new Scanner(System.in);
        // Prompt the user for the first number
        System.out.print("Digite o primeiro número: ");
        // Read the user's input for the first number
        int primeiroNumero = scanner.nextInt();
        // Prompt the user for the second number
        System.out.print("Digite o segundo número: ");
        // Read the user's input for the second number
        int segundoNumero = scanner.nextInt();
        // Ensure the first number is less than or equal to the second number
        int start = Math.min(primeiroNumero, segundoNumero);
        // Ensure the second number is greater than or equal to the first number
        int end = Math.max(primeiroNumero, segundoNumero);

        // Print the even numbers between the two numbers
        System.out.println("Números pares entre " + start + " e " + end + ":");
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        // Print the odd numbers between the two numbers
        System.out.println("Números ímpares entre " + start + " e " + end + ":");
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();

    }
}