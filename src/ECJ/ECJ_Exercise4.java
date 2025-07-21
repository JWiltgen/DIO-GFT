package ECJ;

// 2 - Estrutura de Controle Java\

import java.util.Scanner;

public class ECJ_Exercise4
{
    public static void run()
   {
        // Print a welcome message to the console

        System.out.println("Bem-vindo ao exercício de divisão com resto!");
        System.out.println("Informe um número inicial:");
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        // Read the initial number from the user
        int numeroInicial = scanner.nextInt();
        // Print a message indicating the start of the loop
        while (true) {
            // Prompt the user for a new number
            System.out.print("Informe um novo número: ");
            // Read the new number from the user
            int numero = scanner.nextInt();

            // Ignore numbers less than the initial number
            if (numero < numeroInicial) {
                System.out.println("Número ignorado (menor que o número inicial).");
                // Continue to the next iteration of the loop
                continue;
            }

            // Verify if the number is divisible by the initial number
            if (numero % numeroInicial != 0) {
                System.out.println("Execução encerrada! O número " + numero + " não é divisível por " + numeroInicial + ".");
                break;
            // Print the result if the number is divisible
            } else {
                System.out.println("O número " + numero + " é divisível por " + numeroInicial + ".");
            }
        }
    }
}