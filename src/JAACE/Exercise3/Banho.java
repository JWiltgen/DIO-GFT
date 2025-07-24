package JAACE.Exercise3;

// 3 - Java e a Arte da Abstração com Classes e Encapsulamento

public class Banho 
{

    // Attributes for the pet washing machine
    private boolean temPetNaMaquina = false;
    // Indicates if there is a pet in the washing machine
    private boolean petEstaLimpo = false;
    // Indicates if the pet is clean
    private boolean precisaLimpar = false;
    // Indicates if the machine needs cleaning

    private final int MAX_AGUA = 30;
    // Maximum water capacity
    private final int MAX_SHAMPOO = 10;
    // Maximum shampoo capacity
    
    private int nivelAgua = 0;
    // Current water level
    private int nivelShampoo = 0;
    // Current shampoo level

    
    public void colocarPet() 
    {
        // Check if there is already a pet in the machine or if it needs cleaning
        if (temPetNaMaquina) 
        {
        
            System.out.println("Já tem um pet na máquina.");

        
        } 
        // Check if the machine needs cleaning before placing another pet
        else if (precisaLimpar) 
        {
            System.out.println("A máquina precisa ser limpa antes de colocar outro pet.");
        } 

        // If the machine is empty and does not need cleaning, place the pet in the machine
        else 
        {
            // Set the pet in the machine and mark it as clean
            temPetNaMaquina = true;
            // The pet is clean when placed in the machine
            petEstaLimpo = false;

            System.out.println("Pet colocado na máquina.");
        }
    }

    // Method to remove the pet from the washing machine
    public void retirarPet() 
    {
        // Check if there is a pet in the machine
        if (!temPetNaMaquina) 
        {
            System.out.println("Não há pet na máquina para retirar.");
        } 

        // If there is a pet, check if it is clean or dirty
        else 
        {
            // Remove the pet from the machine
            temPetNaMaquina = false;
            
            // If the pet is dirty, set the need for cleaning
            if (!petEstaLimpo) 
            {
                // If the pet is dirty, set the need for cleaning
                precisaLimpar = true;
                // Print a message indicating that the machine needs cleaning
                System.out.println("Pet retirado SUJO. A máquina precisa ser limpa.");
            } 
            
            // If the pet is clean, simply remove it without needing to clean the machine
            else 
            {
                System.out.println("Pet limpo retirado da máquina.");
            }
        }
    }


    // Methods to manage the washing machine's water and shampoo levels
    public void darBanho() 
    {
        // Check if there is a pet in the machine and if there is enough water and shampoo
        if (!temPetNaMaquina) 
        {
            System.out.println("Não há pet na máquina para dar banho.");
            
            // If there is no pet, exit the method
            return;
        }

        // Check if there is enough water and shampoo to give the bath
        if (nivelAgua < 10 || nivelShampoo < 2) 
        {
            
            System.out.println("Nível insuficiente de água ou shampoo para o banho.");
            
            // If there is not enough water or shampoo, exit the method
            return;
        }

        // If there is a pet and enough resources, perform the bath
        nivelAgua -= 10;

        // Decrease the water level by 10L
        nivelShampoo -= 2;

        // Decrease the shampoo level by 2L
        petEstaLimpo = true;

        System.out.println("Banho realizado com sucesso!");
    }

    // Method to clean the washing machine after use
    public void limparMaquina() 
    {  

        // Check if the machine needs cleaning and if there is enough water and shampoo
        if (!precisaLimpar) 
        {
            System.out.println("A máquina não precisa ser limpa.");
            
            // If the machine does not need cleaning, exit the method
            return;
        }

        // Check if there is enough water and shampoo to clean the machine
        if (nivelAgua < 3 || nivelShampoo < 1) 
        {
            System.out.println("Nível insuficiente de água ou shampoo para limpeza.");
            
            // If there is not enough water or shampoo, exit the method
            return;
        }

        // If the machine needs cleaning and there are enough resources, perform the cleaning
        
        nivelAgua -= 3;
        // Decrease the water level by 3L
        
        nivelShampoo -= 1;
        // Decrease the shampoo level by 1L
        
        precisaLimpar = false;
        // Set the need for cleaning to false

        System.out.println("Máquina limpa com sucesso.");
    }

    // Methods to manage the washing machine's water and shampoo levels
    public void abastecerAgua() 
    {
        
        // Check if the water level is already at maximum capacity
        if (nivelAgua + 2 > MAX_AGUA) 
        {
            System.out.println("Capacidade máxima de água atingida.");
        }
        
        // If there is space, increase the water level by 2L
        else 
        {   
            // Increase the water level by 2L
            nivelAgua += 2;
            System.out.println("Abastecido 2L de água. Nível atual: " + nivelAgua + "L");
        }
    }
    
    // Method to refill shampoo in the washing machine
    public void abastecerShampoo() 
    {   
        // Check if the shampoo level is already at maximum capacity
        if (nivelShampoo + 2 > MAX_SHAMPOO) 
        {
            System.out.println("Capacidade máxima de shampoo atingida.");
        } 
        
        // If there is space, increase the shampoo level by 2L
        else 
        {
            // Increase the shampoo level by 2L
            nivelShampoo += 2;
            System.out.println("Abastecido 2L de shampoo. Nível atual: " + nivelShampoo + "L");
        }
    }


    // Methods to check the status of the washing machine
    public void verificarNivelAgua() 
    {
        System.out.println("Nível de água: " + nivelAgua + "L");
    }
    
    // Method to check the current water level in the washing machine
    public void verificarNivelShampoo() 
    {
        System.out.println("Nível de shampoo: " + nivelShampoo + "L");
    }

    //  Method to check if there is a pet in the washing machine
    public void verificarPetNaMaquina() 
    
    {   
        // Print a message indicating whether there is a pet in the machine
        if (temPetNaMaquina) 
        {
            System.out.println("Há um pet na máquina.");
        }
        
        // If there is no pet, print a message indicating that
        else 
        {
            System.out.println("Não há pet na máquina.");
        }
    }
}
