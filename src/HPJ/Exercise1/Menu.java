package HPJ.Exercise1;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Ingresso> ingressos = new ArrayList<>();

        int opcao;

        do 
        {
            System.out.println("\n--- MENU CINEMA ---");
            System.out.println("1. Comprar ingresso normal");
            System.out.println("2. Comprar meia-entrada");
            System.out.println("3. Comprar ingresso família");
            System.out.println("4. Listar ingressos");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) 
            {
                case 1:

                    ingressos.add(criarIngresso(scanner));
                    break;

                case 2:

                    ingressos.add(criarMeiaEntrada(scanner));
                    break;

                case 3:

                    ingressos.add(criarIngressoFamilia(scanner));
                    break;

                case 4:

                    listarIngressos(ingressos);
                    break;

                case 0:

                    System.out.println("Saindo do aplicativo. Até logo!");
                    break;

                default:

                    System.out.println("Opção inválida.");

            }

        } while (opcao != 0);

        
    }

    // Métodos auxiliares:
    private static Ingresso criarIngresso(Scanner scanner) 
    {
        System.out.print("Nome do filme: ");
        String filme = scanner.nextLine();
        System.out.print("Tipo de áudio (Dublado/Legendado): ");
        String audio = scanner.nextLine();
        System.out.print("Valor do ingresso: R$ ");
        double valor = scanner.nextDouble();
        scanner.nextLine();
        return new Ingresso(valor, filme, audio);
    }

    private static MeiaEntrada criarMeiaEntrada(Scanner scanner) 
    {
        System.out.print("Nome do filme: ");
        String filme = scanner.nextLine();
        System.out.print("Tipo de áudio (Dublado/Legendado): ");
        String audio = scanner.nextLine();
        System.out.print("Valor do ingresso cheio: R$ ");
        double valor = scanner.nextDouble();
        scanner.nextLine();
        return new MeiaEntrada(valor, filme, audio);
    }

    private static IngressoFamilia criarIngressoFamilia(Scanner scanner) 
    {
        System.out.print("Nome do filme: ");
        String filme = scanner.nextLine();
        System.out.print("Tipo de áudio (Dublado/Legendado): ");
        String audio = scanner.nextLine();
        System.out.print("Valor unitário do ingresso: R$ ");
        double valor = scanner.nextDouble();
        System.out.print("Número de pessoas: ");
        int pessoas = scanner.nextInt();
        scanner.nextLine();
        return new IngressoFamilia(valor, filme, audio, pessoas);
    }

    private static void listarIngressos(ArrayList<Ingresso> ingressos) 
    {
        if (ingressos.isEmpty()) 
        {
            System.out.println("Nenhum ingresso registrado.");
        } else 
        {
            int i = 1;
            for (Ingresso ingresso : ingressos) 
            {
                System.out.println("\n--- Ingresso " + i + " ---");
                ingresso.exibirInformacoes();
                i++;
            }
        }
    }
}
