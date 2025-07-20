package FLPJ;
import java.util.Scanner;

public class FLPJ_HOME 
{
    public static void run() 
    {
        var scanner = new Scanner(System.in);
        int exerciseOption;
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
    }
}