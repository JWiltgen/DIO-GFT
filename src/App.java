import java.util.Scanner;

import FLPJ.Exercise1;
import FLPJ.Exercise2;
import FLPJ.Exercise3;
import FLPJ.Exercise4;
public class App {

/* 


    // Constant for the welcome message
    private final static String WELCOME_STRING = "Welcome to the Java Application!";
    public static void main(String[] args) {
        // This is a simple Java application that prompts the user for their name
        // and prints a greeting message. 
        var scanner = new Scanner(System.in);
        // Print a welcome message to the console
        System.out.print("Enter your name: ");
        // Read the user's name from the console
        String name = scanner.nextLine();
         // Print a new line for better readability
        System.out.println();
        // Prompt the user for their age
        System.out.println("How old are you: ");
        // Read the user's age
        int age = scanner.nextInt();
        // Print the user's age
        System.out.println("You are " + age + " years old.");
        // Print a welcome message including the user's name
        System.out.println("Hello, " + name + "\n" + WELCOME_STRING);

        // Prompt the user with a simple math question
        System.out.println("Let's do a quick math problem!");
        // Ask the user to solve a simple math problem
        System.out.print("2 + 2 is equal to ? ");
        // Read the user's answer
        int a = scanner.nextInt();
        // Check if the answer is correct   
        if (a == 4) {
            // If the answer is correct, print a success message
            System.out.println("Correct!");
        } else {
            // If the answer is incorrect, print a failure message
            System.out.println("Incorrect, try again.");
        }
        
        // Close the scanner to prevent resource leaks
        scanner.close();
    }
*/      
    public static void main(String[] args) {

        // This is the main entry point of the Java application.
        // It prompts the user to select an exercise to execute.
        var scanner = new Scanner(System.in);

        // Print a welcome message to the console
        System.out.println("Bem-vindo ao aplicativo Java!");
        System.out.println("Este aplicativo permite que você execute diferentes exercícios de programação Java.");
        System.out.println("Por favor, selecione uma opção abaixo para continuar.");
        System.out.println("Escolha o exercício que deseja executar:");
        System.out.println("1. Fundamentos da linguagem de programação Java");
        System.out.println("2. Estrutura de Controle Java");
        System.out.println("3. Java e a Arte da Abstração com Classes e Encapsulamento");
        System.out.println("4. Herança e Polimorfismo em Java");
        System.out.println("5. Dominando Interfaces e Lambdas em Java");
        System.out.println("6. Praticando com Collections e Outras Classes Úteis do Java");
        System.out.print("Digite o número da opção desejada: ");
        
        // Read the user's choice of exercise
        int option = scanner.nextInt();
        // Use a switch statement to handle the user's choice
        System.out.println(); // Print a new line for better readability
        switch (option) {


            case 1:
                System.out.println("Opção 1 selecionada.");
                // Prompt the user to select an exercise within the first option
                System.out.println();
                System.out.println("Selecione qual exercício deseja executar:");
                System.out.println("1. Exercício 1");
                System.out.println("2. Exercício 2");
                System.out.println("3. Exercício 3");
                System.out.println("4. Exercício 4");
                System.out.print("Digite o número da opção desejada: ");
                // Read the user's choice of exercise
                int exerciseOption = scanner.nextInt();
                // Use a switch statement to handle the user's choice of exercise
                System.out.println(); // Print a new line for better readability

                switch (exerciseOption) {
                    case 1:

                        System.out.println("Exercício 1 selecionado.");
                        // Call the run method of Exercise1 class to execute the exercise
                        Exercise1.run();
                        
                        break;  

                    case 2:

                        System.out.println("Exercício 2 selecionado.");
                        //Call the run method of Exercise2 class to execute the exercise
                        Exercise2.run();

                        break;
                        
                    case 3:

                        System.out.println("Exercício 3 selecionado.");
                        // Call the run method of Exercise3 class to execute the exercise
                        Exercise3.run();
                        break;

                    case 4:

                        System.out.println("Exercício 4 selecionado.");
                        // Call the run method of Exercise4 class to execute the exercise
                        Exercise4.run();
                        break;

                    default:
                        System.out.println("Invalid exercise option selected.");
                        break;
                }
                break;


            case 2:
                System.out.println("You selected option 2.");
                break;
            case 3:
                System.out.println("You selected option 3.");
                break;
            case 4:
                System.out.println("You selected option 4.");
                break;
            case 5:
                System.out.println("You selected option 5.");
                break;
            case 6:
                System.out.println("You selected option 6.");
                break;
            default:
                System.out.println("Invalid option selected.");
                break;
        }
        scanner.close();
    }

}
