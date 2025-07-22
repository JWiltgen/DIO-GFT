package ECJ;

// 2 - Estrutura de Controle Java

import java.util.Scanner;

public class ECJ_Home 
    {
        public static void run() 
            {
                int exerciseOption;
                do 
                    {
                        var scanner = new Scanner(System.in);
                        // Prompt the user to select an exercise within the first option
                        System.err.println();
                        System.err.println("Bem vindo aos exercícios de Estrutura de Controle Java");
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
                                case 1:
                                    
                                        System.out.println("Exercício 1 selecionado.");
                                        // Call the run method of Exercise1 class to execute the exercise
                                        ECJ_Exercise1.run();
                                        break;    

                                case 2:
                                    
                                        System.out.println("Exercício 2 selecionado.");
                                        //Call the run method of Exercise2 class to execute the exercise
                                        ECJ_Exercise2.run();
                                        break;
                                            
                                case 3:
                                    
                                        System.out.println("Exercício 3 selecionado.");
                                        // Call the run method of Exercise3 class to execute the exercise
                                        ECJ_Exercise3.run();
                                        break;

                                case 4:
                                    
                                        System.out.println("Exercício 4 selecionado.");
                                        // Call the run method of Exercise4 class to execute the exercise
                                        ECJ_Exercise4.run();
                                        break;

                                case 0: 
                                        System.out.println("Voltando ao menu principal.");
                                        break;
                                default: 
                                        System.out.println("Invalid exercise option selected.");
                                        break;
                            }

                    } while (exerciseOption != 0); // Continue until the user selects an option to exit{
                        
            }
    }