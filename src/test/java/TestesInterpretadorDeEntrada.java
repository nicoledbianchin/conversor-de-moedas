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

}
