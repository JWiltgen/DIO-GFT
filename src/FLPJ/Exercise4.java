package FLPJ;

// 1 - Fundamentos da Linguagem de Programação Java

import java.util.Scanner;
public class Exercise4 {
    public  static void run() 
    {
        // This method calculates the age difference between two people based on user input.
        System.out.println("Calculando a diferença de idade entre duas pessoas.");
        // Prompt the user for the names and ages of two people
        System.out.println("Qual o nome da primeira pessoa?");
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        // Read the name of the first person
        String nome1 = scanner.nextLine();
        // Prompt the user for the age of the first person
        System.out.println("Qual a idade de " + nome1 + "?");
        // Read the age of the first person
        int idade1 = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character left by nextInt()
        // Prompt the user for the name of the second person
        System.out.println("Qual o nome da segunda pessoa?");
        // Read the name of the second person
        String nome2 = scanner.nextLine();
        // Prompt the user for the age of the second person
        System.out.println("Qual a idade de " + nome2 + "?");
        // Read the age of the second person
        int idade2 = scanner.nextInt();
        // Calculate the age difference between the two people
        int diferencaIdade = Math.abs(idade1 - idade2);
        // Print the names and the age difference to the console
        System.out.println("A diferença de idade entre " + nome1 + " e " + nome2 + " é de " + diferencaIdade + " anos.");
        scanner.close(); // Close the scanner to prevent resource leaks
    }
}
