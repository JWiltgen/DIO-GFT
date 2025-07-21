package FLPJ;

// 1 - Fundamentos da linguagem de programação Java

import java.util.Scanner;

public class FLPJ_Home 
    {
        public static void run() 
                {   
                    int exerciseOption;
                    do
                        {
                            var scanner = new Scanner(System.in);
                            // Prompt the user to select an exercise within the first option
                            System.err.println();
                            System.err.println("Bem vindo ao exercício de Fundamentos de Linguagem de Programação Java");
                            System.out.println();
                            System.out.println("Selecione qual exercício deseja executar:");
                            System.out.println("1. Exercício 1");
                            System.out.println("2. Exercício 2");
                            System.out.println("3. Exercício 3");
                            System.out.println("4. Exercício 4");
                            System.out.println("0. Sair");
                            System.out.println();
                            System.out.print("Digite o número da opção desejada: ");
                                            
                            exerciseOption = scanner.nextInt();
                            // Use a switch statement to handle the user's choice of exercise
                            System.out.println(); // Print a new line for better readability

                            switch (exerciseOption) 
                                {
                                    case 1 -> {
                                        System.out.println("Exercício 1 selecionado.");
                                        // Call the run method of Exercise1 class to execute the exercise
                                        FLPJ_Exercise1.run();
                            }  

                                    case 2 -> {
                                        System.out.println("Exercício 2 selecionado.");
                                        //Call the run method of Exercise2 class to execute the exercise
                                        FLPJ_Exercise2.run();
                            }
                                                        
                                    case 3 -> {
                                        System.out.println("Exercício 3 selecionado.");
                                        // Call the run method of Exercise3 class to execute the exercise
                                        FLPJ_Exercise3.run();
                            }

                                        case 4 -> {
                                            System.out.println("Exercício 4 selecionado.");
                                            // Call the run method of Exercise4 class to execute the exercise
                                            FLPJ_Exercise4.run();
                            }

                                        default -> System.out.println("Invalid exercise option selected.");

                                }

                        } while (exerciseOption != 0); // Continue until the user selects an option to exit{
                            
                }
        }
    
