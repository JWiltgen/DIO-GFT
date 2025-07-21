package ECJ;

// 2 - Estrutura de Controle Java

import java.util.Scanner;

public class ECJ_Exercise1 
{
    public static void run()
    {
        // Print a welcome message to the console
        System.out.println("Bem-vindo ao exercício de Estrutura de Controle Java!");
        System.out.println("Este exercício irá gerar a tabuada de um número fornecido pelo usuário.");
        // Create a Scanner object to read user input
        var scanner = new Scanner(System.in);
        // Prompt the user for a number to generate its multiplication table
        System.out.println();
        System.out.print("Digite um número para gerar a tabuada: ");
        // Read the user's input number
        int numero = scanner.nextInt();
        // Print the multiplication table for the given number
        System.out.println("Tabuada do " + numero + ":");
        // Loop through numbers 1 to 10 to generate the multiplication table
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            // Print the result of the multiplication
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}