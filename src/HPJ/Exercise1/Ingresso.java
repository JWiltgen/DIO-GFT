package HPJ.Exercise1;

public class Ingresso 
{
    
    protected double valor;
    
    protected String filme;

    protected String tipoAudio;


    public Ingresso(double valor, String filme, String tipoAudio) 
    {

        this.valor = valor;

        this.filme = filme;
        
        this.tipoAudio = tipoAudio;

    }

    public double getValorReal() 
    {

        return valor;

    }

    public void exibirInformacoes() 
    {

        System.out.println("Filme: " + filme);

        System.out.println("Tipo de áudio: " + tipoAudio);

        System.out.println("Valor final: R$ " + String.format("%.2f", getValorReal()));

    }
}