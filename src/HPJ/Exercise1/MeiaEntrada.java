package HPJ.Exercise1;

public class MeiaEntrada extends Ingresso 
{

    public MeiaEntrada(double valor, String filme, String tipoAudio) 
    {
        super(valor, filme, tipoAudio);
    }

    @Override
    public double getValorReal() 
    {
        return valor / 2;
    }
    
}