package ECJ;

// 2 - Estrutura de Controle Java

import java.util.Scanner;

public class ECJ_Exercise2 
{
    public static void run()
    {
        // Print a welcome message to the console
        System.out.println("Bem-vindo ao exercício de Cálculo de IMC!");
        System.out.println("Este exercício irá calcular o Índice de Massa Corporal (IMC) com base no peso e altura fornecidos pelo usuário.");
        // Create a Scanner object to read user input
        var scanner = new Scanner(System.in);
        // Prompt the user for their weight
        System.out.print("Digite seu peso (em kg): ");
        // Read the user's input weight
        double peso = scanner.nextDouble();
        // Prompt the user for their height
        System.out.print("Digite sua altura (em metros): ");
        // Read the user's input height
        double altura = scanner.nextDouble();
        // Calculate the IMC
        double imc = peso / (altura * altura);
        // Print the calculated IMC
        System.out.printf("Seu IMC é: %.2f%n", imc);
        // Determine the weight category based on the IMC
        if (imc < 18.5) {
            System.out.println("Você está abaixo do peso.");
        } else if (imc < 24.9) {
            System.out.println("Você está com peso normal.");
        } else if (imc < 29.9) {
            System.out.println("Você está com sobrepeso.");
        } else {
            System.out.println("Você está obeso.");
        }
    }
}