package JAACE.Exercise2;

// 3 - Java e a Arte da Abstração com Classes e Encapsulamento



public class Carro 
{
    // Attributes for the car
    
    private boolean ligado;
    // The car is either on or off
    private int velocidade;
    
    private int marcha;
    // Constructor to initialize the car's state
    public Carro() 
    {   
        // Set the initial state of the car
        this.ligado = false;
        // Set the initial speed
        this.velocidade = 0;
        // Set the initial gear
        this.marcha = 0;
    }
    // Methods to control the car's behavior
    public void ligar() 
    {
        // Check if the car is already on
        if (!ligado) 
        {   
            // If the car is off, set it to on
            ligado = true;
            // Print a message indicating that the car is now on
            System.out.println("Carro ligado.");
        // If the car is already on, print a message indicating that it is already on
        } else 
        {
            System.out.println("O carro já está ligado.");
        }
    }
    // Method to turn off the car
    public void desligar() 
    {
        // Check if the car is on and not moving
        if (ligado && velocidade == 0 && marcha == 0) 

        {   
            // If the car is on and stopped, set it to off
            ligado = false;
            
            System.out.println("Carro desligado.");
            // If the car is on and moving, print a message indicating that it cannot be turned off
        } else 

        {
            System.out.println("Não é possível desligar o carro. Ele deve estar parado e em ponto morto.");
        }
    }
    // Method to accelerate the car
    public void acelerar() 
    {   
        // Check if the car is on and not in neutral gear
        if (!ligado) 

        {

            System.out.println("O carro está desligado.");

            return;
        }
        // Check if the car is in neutral gear
        if (marcha == 0) 

        {
            //
            System.out.println("Não é possível acelerar em ponto morto.");

            return;
        }
        // Check if the current speed is less than the maximum speed
        if (velocidade < 120) 

        {
            // Increase the speed by 1
            int novaVelocidade = velocidade + 1;

            // Check if the new speed is compatible with the current gear
            if (verificaVelocidadeParaMarcha(novaVelocidade, marcha)) 


            {   
                // If the new speed is compatible, set the speed to the new value
                velocidade = novaVelocidade;
                //
                System.out.println("Velocidade atual: " + velocidade + "km/h");

            } else 
            {   // If the new speed is not compatible with the current gear, print a message
                System.out.println("Velocidade incompatível com a marcha atual.");
            }
        } else 
        {   // If the speed is already at the maximum, print a message
            System.out.println("Velocidade máxima atingida.");
        }
    }

    // Method to decrease the speed of the car
    public void diminuirVelocidade() 
    {
        // Check if the car is on
        if (!ligado) 
        {
            // If the car is off, print a message
            System.out.println("O carro está desligado.");

            return;
        }
        // Check if the current speed is greater than 0
        if (velocidade > 0) 
        {
            // If the speed is greater than 0, decrease it by 1
            velocidade--;
            
            System.out.println("Velocidade atual: " + velocidade + "km/h");
            // Check if the speed is now 0
        } else 
        {
                // If the speed is already 0, print a message
            System.out.println("O carro já está parado.");
        }
    }
    
    // Method to turn the car left or right
    public void virar(String direcao) 
    {
        // Check if the car is on
        if (!ligado) 
        {
            System.out.println("O carro está desligado.");
            return;
        }
        // Check if the current speed is between 1 and 40
        if (velocidade >= 1 && velocidade <= 40) 
        {
            // If the speed is within the range, print a message indicating the direction
            if (direcao.equalsIgnoreCase("esquerda") || direcao.equalsIgnoreCase("direita")) 
            {
                System.out.println("Virando para a " + direcao + ".");
                // If the direction is valid, print a message indicating the turn
            } else 
            {
                System.out.println("Direção inválida.");
            }
            // If the speed is not within the range, print a message indicating that the speed is inadequate
        } else 
        {
            System.out.println("Velocidade inadequada para virar.");
        }
    }
    // Method to check the current speed of the car
    public void verificarVelocidade() 
    {
        System.out.println("Velocidade atual: " + velocidade + "km/h");
    }
    // Method to change the gear of the car
    public void trocarMarcha(int novaMarcha) 
    {
        // Check if the car is on
        if (!ligado) 
        {
            System.out.println("O carro está desligado.");
            return;
        }
        // Check if the new gear is valid (between 0 and 6)
        if (novaMarcha < 0 || novaMarcha > 6) 
        {
            System.out.println("Marcha inválida.");
            return;
        }
        // Check if the new gear is not the same as the current gear
        if (Math.abs(novaMarcha - marcha) != 1) 
        {
            System.out.println("Não é permitido pular marchas.");
            return;
        }
        // Check if the current speed is compatible with the new gear
        if (verificaVelocidadeParaMarcha(velocidade, novaMarcha)) 
        {
            marcha = novaMarcha;
            System.out.println("Marcha atual: " + marcha);
        } else 
        // If the speed is not compatible with the new gear, print a message
        {
            System.out.println("Velocidade incompatível com a marcha desejada.");
        }
    }
    // Method to check if the speed is compatible with the gear
    private boolean verificaVelocidadeParaMarcha(int velocidade, int marcha) 
    {
        // Check if the speed is compatible with the gear
        switch (marcha) 
        {
            // For each gear, check the speed range
            case 0: return velocidade == 0;
            // Neutral gear, speed must be 0
            case 1: return velocidade >= 0 && velocidade <= 20;
            // First gear, speed must be between 0 and 20
            case 2: return velocidade >= 21 && velocidade <= 40;
            // Second gear, speed must be between 21 and 40
            case 3: return velocidade >= 41 && velocidade <= 60;
            // Third gear, speed must be between 41 and 60
            case 4: return velocidade >= 61 && velocidade <= 80;
            // Fourth gear, speed must be between 61 and 80
            case 5: return velocidade >= 81 && velocidade <= 100;
            // Fifth gear, speed must be between 81 and 100
            case 6: return velocidade >= 101 && velocidade <= 120;
            // Sixth gear, speed must be between 101 and 120
            default: return false;
            // If the gear is invalid, return false

        }
    }    
}
