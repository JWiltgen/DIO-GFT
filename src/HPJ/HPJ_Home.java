package HPJ;

// 4 - Herança e Polimorfismo em Java

import java.util.Scanner;

public class HPJ_Home 
{
    public static void main() 
    {
        int exerciseOption;
        
        do
        
        { 
            var scanner = new Scanner(System.in);
            exerciseOption = scanner.nextInt();
            
            switch (exerciseOption) 
            
            {
                case 1:
                //NOT FINISHED
                    System.out.println("Exercício 1 selecionado.");
                    HPJ_Exercise1.run();
                
                case 2:
                //NOT FINISHED
                    System.out.println("Exercício 2 selecionado.");
                    HPJ_Exercise2.run();
                    
                case 3:
                    

                case 0:

                    System.out.println("Saindo do aplicativo. Até logo!");
                    break;

                default: System.out.println("Opção inválida!");                  
            }
            
        } while (exerciseOption != 0);
    }
}
