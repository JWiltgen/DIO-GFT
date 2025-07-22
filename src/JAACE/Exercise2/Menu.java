package JAACE.Exercise2;

import java.util.Scanner;


public class Menu {
     public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Carro carro = new Carro();


        int opcao;

        do {

            System.out.println("\n=== MENU DO CARRO ===");

            System.out.println("1. Ligar o carro");

            System.out.println("2. Desligar o carro");

            System.out.println("3. Acelerar");

            System.out.println("4. Diminuir velocidade");

            System.out.println("5. Virar para a esquerda");

            System.out.println("6. Virar para a direita");

            System.out.println("7. Verificar velocidade");

            System.out.println("8. Trocar marcha");

            System.out.println("0. Sair");

            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) 
            {
                case 1:
                    // Call the ligar method to turn on the car
                    carro.ligar();
                    break;

                case 2:
                    // Call the desligar method to turn off the car
                    carro.desligar();
                    break;

                case 3:
                    // Call the acelerar method to increase the speed of the car
                    carro.acelerar();
                    break;

                case 4:
                    // Call the diminuirVelocidade method to decrease the speed of the car
                    carro.diminuirVelocidade();
                    break;

                case 5:
                    // Call the virar method to turn the car left
                    carro.virar("esquerda");
                    break;

                case 6:
                    // Call the virar method to turn the car right
                    carro.virar("direita");
                    break;

                case 7:
                    // Call the verificarVelocidade method to check the current speed of the car
                    carro.verificarVelocidade();
                    break;

                case 8:
                    // Prompt the user to enter the desired gear
                    System.out.print("Digite a marcha desejada (0 a 6): ");
                    // Read the new gear from the user
                    int novaMarcha = scanner.nextInt();
                    // Call the trocarMarcha method to change the gear of the car
                    carro.trocarMarcha(novaMarcha);

                    break;

                case 0:

                    System.out.println("Saindo do aplicativo. Até logo!");

                    break;

                default:

                    System.out.println("Opção inválida!");

            }

        } while (opcao != 0);

        
    }
}
