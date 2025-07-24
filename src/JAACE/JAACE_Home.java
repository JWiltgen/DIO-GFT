package JAACE;

// 3 - Java e a Arte da Abstração com Classes e Encapsulamento


import java.util.Scanner;


public class JAACE_Home {
    public static void run() {
        int exerciseOption;
        do {
            var scanner = new Scanner(System.in);
            // Prompt the user to select an exercise within the first option
            System.out.println();
            System.out.println("Bem vindo ao exercício de Java e a Arte da Abstração com Classes e Encapsulamento");
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

            switch (exerciseOption) {
                case 1:
                    System.out.println("Exercício 1 selecionado.");
                    // Call the run method of JAACE_Exercise1 class to execute the exercise
                    JAACE_Exercise1.run();
                    break;  

                case 2:
                    System.out.println("Exercício 2 selecionado.");
                    // Call the run method of JAACE_Exercise2 class to execute the exercise
                    JAACE_Exercise2.run();
                    break;

                case 3:
                    System.out.println("Exercício 3 selecionado.");
                    // Call the run method of JAACE_Exercise3 class to execute the exercise
                    //JAACE_Exercise3.run();
                    break;

                case 4:
                    System.out.println("Exercício 4 selecionado.");
                    // Call the run method of JAACE_Exercise4 class to execute the exercise
                    //JAACE_Exercise4.run();
                    break;

                case 0:
                    System.out.println("Saindo do aplicativo. Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (exerciseOption != 0);
    }
}
