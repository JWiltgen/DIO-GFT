package FLPJ;

// 1 - Fundamentos da Linguagem de Programação Java

import java.util.Scanner;
public class FLPJ_Exercise3 
{
    public static void run() 
    {
        // This method calculates the area of a retangle based on user input.
        // Prompt the user for the side length of the rectangle.
        System.out.println("Calculando a área de um retângulo.");
        System.out.println("Informe a base do retângulo:");
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        // Read the side length from the user
        double base = scanner.nextDouble();
        System.out.println("Informe a altura do retângulo:");
        // Read the height from the user
        double altura = scanner.nextDouble();   
        // Calculate the area of the square
        double area = base * altura;
        // Print the calculated area to the console
        System.out.println("A área do retângulo é: " + area);
         // Close the scanner to prevent resource leaks
    }
}
    


