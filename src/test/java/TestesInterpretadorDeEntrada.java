import org.junit.Assert;
import org.junit.Test;

public class TestesInterpretadorDeEntrada {

    InterpretadorDeEntrada interpretador = new InterpretadorDeEntrada();

    @Test
    public void retornaApenasMoedaInicial(){
        String entrada = "BRL110 CLP";

        String moedaInicial = interpretador.extrairMoedaInicial(entrada);

        Assert.assertEquals(moedaInicial, "BRL");
    }

    @Test
    public void retornaApenasValor(){
        String entrada = "BRL100 CLP";

        Double valor = interpretador.extrairValor(entrada);

        Assert.assertEquals(java.util.Optional.of(valor), java.util.Optional.of(100.0));
    }

    @Test
    public void retornaUmaMoedaFinal(){
        String entrada = "BRL100 CLP";

        String moedaFinal = interpretador.extrairMoedaFinal(entrada);

        Assert.assertEquals(moedaFinal, "CLP");
    }

}
