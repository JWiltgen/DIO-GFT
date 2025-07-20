package FLPJ;

// 1 - Fundamentos da Linguagem de Programação Java
import java.util.Scanner;
public class Exercise2 {
    public static void run() {
        // This method calculates the area of a square based on user input.
        // Prompt the user for the side length of the square
        System.out.println("Calculando a área de um quadrado.");
        System.out.println("Informe o lado do quadrado:");
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        // Read the side length from the user
        double lado = scanner.nextDouble();
        // Calculate the area of the square
        double area = lado * lado;
        // Print the calculated area to the console
        System.out.println("A área do quadrado é: " + area);
        scanner.close(); // Close the scanner to prevent resource leaks
    }
}
