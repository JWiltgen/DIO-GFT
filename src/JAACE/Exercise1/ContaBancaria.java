package JAACE.Exercise1;

// 3 - Java e a Arte da Abstração com Classes e Encapsulamento


public class ContaBancaria 
{
    // Attributes for the bank account
    private double saldo;
    // The cheque especial limit is set based on the initial deposit
    private double limiteChequeEspecial;
    // The amount used from the cheque especial
    private double valorUsadoChequeEspecial = 0;
    // Constructor to initialize the bank account with an initial deposit
    public ContaBancaria(double depositoInicial) {
        // Initialize the account balance with the initial deposit
        this.saldo = depositoInicial;
        // Set the cheque especial limit based on the initial deposit
        // If the initial deposit is less than or equal to 500, set a fixed limit
        if (depositoInicial <= 500) {
            // Set a fixed cheque especial limit of R$ 50
            this.limiteChequeEspecial = 50.0;
        } else {
            // If the initial deposit is greater than R$ 500, set the limit to 50% of the deposit
            this.limiteChequeEspecial = depositoInicial * 0.5;
        }
    }
    // Methods to interact with the bank account
    public double consultarSaldo() {
        // Return the current balance of the account
        return saldo;
    }
    // Method to check the cheque especial limit
    public double consultarChequeEspecial() {
        // Return the cheque especial limit
        return limiteChequeEspecial;
    }
    // Method to check if the account is using cheque especial
    public boolean estaUsandoChequeEspecial() {
        // Check if the current balance is negative, indicating that cheque especial is being used
        return saldo < 0;
    }
    // Method to deposit money into the account
    public void depositar(double valor) {
        
        System.out.println("Depositando R$ " + valor);
        // If the deposit amount is negative, print an error message and return
        if (valorUsadoChequeEspecial > 0) {
            // If the account is using cheque especial, calculate the total amount due
            double taxa = valorUsadoChequeEspecial * 0.2;
            // If the deposit is sufficient to cover the cheque especial, pay it off
            double totalDevido = valorUsadoChequeEspecial + taxa;
            // If the deposit amount is greater than or equal to the total due, pay it off
            if (valor >= totalDevido) {
                // Deduct the total due from the deposit amount
                valor -= totalDevido;
                // Reset the cheque especial usage to zero
                saldo += valor;
                // Print a message indicating that the cheque especial has been paid off
                System.out.println("R$ " + valorUsadoChequeEspecial + " de cheque especial quitado com taxa de R$ " + taxa);
                // Reset the cheque especial usage
                valorUsadoChequeEspecial = 0;
            } else {
                // If the deposit is insufficient to cover the cheque especial, reduce the amount used
                valorUsadoChequeEspecial -= valor / 1.2;
                // Print a message indicating the remaining amount used from cheque especial
                System.out.println("Depósito insuficiente para quitar cheque especial. Valor restante: R$ " + valorUsadoChequeEspecial);
                return;
            }
        }
        // If the deposit amount is valid, add it to the account balance
        saldo += valor;
    }
    // Method to withdraw money from the account
    public boolean sacar(double valor) {
        // If the withdrawal amount is negative, print an error message and return false
        if (saldo + limiteChequeEspecial >= valor) {
            // If the withdrawal amount is valid, deduct it from the account balance
            saldo -= valor;
            // If the balance goes negative, calculate the amount used from cheque especial
            if (saldo < 0) {
                // If the balance is negative, set the amount used from cheque especial
                valorUsadoChequeEspecial = -saldo;
            }
            // Print a message indicating the withdrawal was successful
            return true;
        } else {
            // If the withdrawal amount exceeds the available balance and cheque especial, print an error message
            System.out.println("Saldo insuficiente (incluindo cheque especial).");           // Return false to indicate the withdrawal was unsuccessful
            return false;
        }
    }
    // Method to pay a boleto using the account
    public boolean pagarBoleto(double valor) {
        // If the boleto amount is negative, print an error message and return false
        System.out.println("Pagando boleto de R$ " + valor);
        // Check if the account has sufficient funds to pay the boleto
        return sacar(valor);
    }
    // Method to display a summary of the account
    public void exibirResumo() {
        System.out.println("\n--- RESUMO DA CONTA ---");
        // Print the current balance, cheque especial limit, and whether cheque especial is being used
        System.out.println("Saldo atual: R$ " + String.format("%.2f", saldo));
        // Print the cheque especial limit and whether it is being used
        System.out.println("Cheque especial disponível: R$ " + String.format("%.2f", limiteChequeEspecial));
        // Print whether the account is using cheque especial and the amount used if applicable
        System.out.println("Usando cheque especial: " + (estaUsandoChequeEspecial() ? "Sim" : "Não"));
        // If cheque especial is being used, print the amount used
        if (valorUsadoChequeEspecial > 0) {
            // Print the amount used from cheque especial
            System.out.println("Valor usado do cheque especial: R$ " + String.format("%.2f", valorUsadoChequeEspecial));
        }
        System.out.println("--------------------------\n");
    }
}
