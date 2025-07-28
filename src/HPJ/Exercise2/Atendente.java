package HPJ.Exercise2;

class Atendente extends Usuario {
    private double valorCaixa;

    public Atendente(String nome, String email, String senha) {
        super(nome, email, senha, false);
        this.valorCaixa = 0.0;
    }

    // Returns the current cash value
    public double getValorCaixa() {
        return valorCaixa;
    }

    // Adds a payment amount to the cash
    public void receberPagamento(double valor) {
        valorCaixa += valor;
        System.out.println("Pagamento de R$" + valor + " recebido. Total em caixa: R$" + valorCaixa);
    }

    // Finalizes the cash and resets it
    public void fecharCaixa() {
        System.out.println("Caixa fechado. Total final: R$" + valorCaixa);
        valorCaixa = 0.0;
    }
}