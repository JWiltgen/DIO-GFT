package HPJ.Exercise2;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Predefined users for demonstration
        Gerente gerente = new Gerente("Carlos", "carlos@empresa.com", "1234");
        Vendedor vendedor = new Vendedor("Ana", "ana@empresa.com", "abcd");
        Atendente atendente = new Atendente("Pedro", "pedro@empresa.com", "4321");

        int opcao;
        // Loop for interactive menu
        do {
            System.out.println("\n==== MENU ====");
            System.out.println("1. Login como Gerente");
            System.out.println("2. Login como Vendedor");
            System.out.println("3. Login como Atendente");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    gerente.realizarLogin();
                    gerente.gerarRelatorioFinanceiro();
                    gerente.consultarVendas();
                    gerente.realizarLogoff();
                    break;
                case 2:
                    vendedor.realizarLogin();
                    vendedor.realizarVenda();
                    vendedor.consultarVendas();
                    vendedor.realizarLogoff();
                    break;
                case 3:
                    atendente.realizarLogin();
                    atendente.receberPagamento(150.0);
                    atendente.fecharCaixa();
                    atendente.realizarLogoff();
                    break;
                case 0:
                    System.out.println("Saindo do aplicativo. Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
