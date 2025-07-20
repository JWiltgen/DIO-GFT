import java.util.Scanner;

import FLPJ.FLPJ_Exercise1;
import FLPJ.FLPJ_Exercise2;
import FLPJ.FLPJ_Exercise3;
import FLPJ.FLPJ_Exercise4;
public class App {
   
    public static void main(String[] args) {
        int exerciseOption;
        // This is the main entry point of the Java application.
        // It prompts the user to select an exercise to execute.
       
        int option = 0; // Initialize option to 0 to enter the loop
       do 
        {// Print a welcome message to the console
                var scanner = new Scanner(System.in);
                System.out.println();
                System.out.println("Bem-vindo ao aplicativo Java!");
                System.out.println();
                System.out.println("Este aplicativo permite que você execute diferentes exercícios de programação Java.");
                System.out.println();
                System.out.println("Por favor, selecione uma opção abaixo para continuar.");
                System.out.println();
                System.out.println("Escolha o exercício que deseja executar:");
                System.out.println("1. Fundamentos da linguagem de programação Java");
                System.out.println("2. Estrutura de Controle Java");
                System.out.println("3. Java e a Arte da Abstração com Classes e Encapsulamento");
                System.out.println("4. Herança e Polimorfismo em Java");
                System.out.println("5. Dominando Interfaces e Lambdas em Java");
                System.out.println("6. Praticando com Collections e Outras Classes Úteis do Java");
                System.out.println("0. Sair");
                System.out.println();
                System.out.print("Digite o número da opção desejada: ");
                
                // Read the user's choice of exercise
                option = scanner.nextInt();
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
                        System.out.println();
                        System.out.print("Digite o número da opção desejada: ");
                        
                        exerciseOption = scanner.nextInt();
                        // Use a switch statement to handle the user's choice of exercise
                        System.out.println(); // Print a new line for better readability

                        switch (exerciseOption) {
                            case 1:

                                System.out.println("Exercício 1 selecionado.");
                                // Call the run method of Exercise1 class to execute the exercise
                                FLPJ_Exercise1.run();
                                
                                break;  

                            case 2:

                                System.out.println("Exercício 2 selecionado.");
                                //Call the run method of Exercise2 class to execute the exercise
                                FLPJ_Exercise2.run();

                                break;
                                
                            case 3:

                                System.out.println("Exercício 3 selecionado.");
                                // Call the run method of Exercise3 class to execute the exercise
                                FLPJ_Exercise3.run();
                                break;

                            case 4:

                                System.out.println("Exercício 4 selecionado.");
                                // Call the run method of Exercise4 class to execute the exercise
                                FLPJ_Exercise4.run();
                                break;

                            default:
                                System.out.println("Invalid exercise option selected.");
                                break;
                        }
                        break;


                    case 2:
                        System.out.println("Opção 2 selecionada.");
                        // Prompt the user to select an exercise within the first option
                        System.out.println();
                        System.out.println("Selecione qual exercício deseja executar:");
                        System.out.println("1. Exercício 1");
                        System.out.println("2. Exercício 2");
                        System.out.println("3. Exercício 3");
                        System.out.println("4. Exercício 4");
                        System.out.print("Digite o número da opção desejada: ");
                        // Read the user's choice of exercise
                        exerciseOption = scanner.nextInt();
                        // Use a switch statement to handle the user's choice of exercise
                        System.out.println(); // Print a new line for better readability
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
                    case 0:
                        System.out.println("Saindo do aplicativo. Até logo!");
                        break;
                    default:
                        System.out.println("Invalid option selected.");
                        break;
                }
               
                
        } while (option != 0); // Continue the loop until the user selects option 0 to exit{
            
        
    }

}
