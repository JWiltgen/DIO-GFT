package JAACE.Exercise3;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) 
    {
        // Create a new Banho object
        Banho maquina = new Banho();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do 
        {
            System.out.println("\n=== MENU MÁQUINA DE BANHO ===");
            System.out.println("1. Colocar pet na máquina");
            System.out.println("2. Retirar pet da máquina");
            System.out.println("3. Dar banho no pet");
            System.out.println("4. Abastecer com água (+2L)");
            System.out.println("5. Abastecer com shampoo (+2L)");
            System.out.println("6. Verificar nível de água");
            System.out.println("7. Verificar nível de shampoo");
            System.out.println("8. Verificar se há pet na máquina");
            System.out.println("9. Limpar máquina");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) 
            {

                case 1 -> maquina.colocarPet();

                case 2 -> maquina.retirarPet();

                case 3 -> maquina.darBanho();

                case 4 -> maquina.abastecerAgua();

                case 5 -> maquina.abastecerShampoo();

                case 6 -> maquina.verificarNivelAgua();

                case 7 -> maquina.verificarNivelShampoo();

                case 8 -> maquina.verificarPetNaMaquina();

                case 9 -> maquina.limparMaquina();

                case 0 -> System.out.println("Saindo do aplicativo. Até logo!");

                default -> System.out.println("Opção inválida!");

            }

        } while (opcao != 0);

        
    }
}