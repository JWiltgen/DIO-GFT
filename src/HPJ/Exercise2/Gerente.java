package HPJ.Exercise2;

class Gerente extends Usuario {
    public Gerente(String nome, String email, String senha) {
        super(nome, email, senha, true);
    }

    // Generates a financial report
    public void gerarRelatorioFinanceiro() {
        System.out.println("Relatório financeiro gerado.");
    }

    // Consults sales data
    public void consultarVendas() {
        System.out.println("Consultando vendas como gerente.");
    }
}