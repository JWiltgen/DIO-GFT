package FLPJ;

// 1 - Fundamentos da Linguagem de Programação Java

import java.util.Scanner;
public class FLPJ_Exercise1 
{
    public static void run() 
    {
        System.out.println("Calculando a idade com base no ano de nascimento.");
        // Define a base year for the calculation
        int anoBase = 2025;
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        // Prompt the user for their name
        System.out.println("Qual seu nome?");
        // Read the user's name
        String nome = scanner.nextLine();
        // Prompt the user for their year of birth
        System.out.println("Em que ano você nasceu?");
        // Read the user's year of birth
        int anoNascimento = scanner.nextInt();
        // Calculate the user's age
        int idade = anoBase - anoNascimento;
        System.out.println(); // Print a new line for better readability
        // Print a greeting message with the user's name and age
        System.out.println("Olá " + nome + ", você tem " + idade + " anos.");
        // Close the scanner to prevent resource leaks
    }
}