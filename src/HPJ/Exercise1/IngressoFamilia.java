package HPJ.Exercise1;

public class IngressoFamilia extends Ingresso 

{
    private int numeroPessoas;

    public IngressoFamilia(double valor, String filme, String tipoAudio, int numeroPessoas) 
    {

        super(valor, filme, tipoAudio);
        
        this.numeroPessoas = numeroPessoas;

    }

    @Override
    public double getValorReal() 
    {

        double total = valor * numeroPessoas;
        if (numeroPessoas > 3) 
        {

            total *= 0.95; // 5% de desconto

        }

        return total;
    }

    @Override
    public void exibirInformacoes() 
    {

        super.exibirInformacoes();
        System.out.println("Número de pessoas: " + numeroPessoas);

    }
}