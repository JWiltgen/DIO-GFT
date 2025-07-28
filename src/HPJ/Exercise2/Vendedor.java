package HPJ.Exercise2;

class Vendedor extends Usuario {
    private int quantidadeVendas;

    public Vendedor(String nome, String email, String senha) {
        super(nome, email, senha, false);
        this.quantidadeVendas = 0;
    }

    // Returns the number of sales made
    public int getQuantidadeVendas() {
        return quantidadeVendas;
    }

    // Increments the sales count
    public void realizarVenda() {
        quantidadeVendas++;
        System.out.println("Venda realizada. Total: " + quantidadeVendas);
    }

    // Displays the total sales
    public void consultarVendas() {
        System.out.println("Total de vendas: " + quantidadeVendas);
    }
}
