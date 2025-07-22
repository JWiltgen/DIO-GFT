package JAACE.Exercise1;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o valor inicial da conta: R$ ");
        // Read the initial deposit amount from the user
        double depositoInicial = scanner.nextDouble();
        // Create a new ContaBancaria object with the initial deposit
        ContaBancaria conta = new ContaBancaria(depositoInicial);
        //
        int opcao;
        do {
            System.out.println("\n=== MENU CONTA BANCÁRIA ===");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Consultar cheque especial");
            System.out.println("3 - Depositar dinheiro");
            System.out.println("4 - Sacar dinheiro");
            System.out.println("5 - Pagar boleto");
            System.out.println("6 - Verificar se está usando cheque especial");
            System.out.println("7 - Exibir resumo da conta");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                // Print the current balance
                    System.out.println("Saldo atual: R$ " + String.format("%.2f", conta.consultarSaldo()));
                    break;
                case 2:
                // Print the cheque especial limit
                    System.out.println("Cheque especial: R$ " + String.format("%.2f", conta.consultarChequeEspecial()));
                    break;
                case 3:
                // Prompt the user for the deposit amount and deposit it
                    System.out.print("Informe o valor para depósito: R$ ");
                    // Read the deposit amount from the user
                    double deposito = scanner.nextDouble();
                    // Deposit the amount into the account
                    conta.depositar(deposito);
                    break;
                case 4:
                // Prompt the user for the withdrawal amount and withdraw it
                    System.out.print("Informe o valor para saque: R$ ");
                    // Read the withdrawal amount from the user
                    double saque = scanner.nextDouble();
                    // Attempt to withdraw the amount from the account
                    if (conta.sacar(saque)) {
                        // If the withdrawal is successful, print a success message
                        System.out.println("Saque realizado com sucesso.");
                    }
                    break;
                case 5:
                // Prompt the user for the boleto amount and pay it
                    System.out.print("Informe o valor do boleto: R$ ");
                    // Read the boleto amount from the user
                    double boleto = scanner.nextDouble();
                    // Attempt to pay the boleto using the account
                    if (conta.pagarBoleto(boleto)) {
                        System.out.println("Boleto pago com sucesso.");
                    }
                    break;
                case 6:
                // Check if the account is using cheque especial and print the result
                    System.out.println("Usando cheque especial: " + (conta.estaUsandoChequeEspecial() ? "Sim" : "Não"));
                    break;
                case 7:
                // Display a summary of the account
                    conta.exibirResumo();
                    break;
                case 0:
                // Exit the menu
                    System.out.println("Saindo. Obrigado por usar o banco!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        scanner.close();
    }
}