import org.junit.Assert;
import org.junit.Test;

public class TestesInterpretadorDeEntrada {

    private InterpretadorDeEntrada interpretador = new InterpretadorDeEntrada();

    @Test
    public void retornaApenasMoedaInicial(){
        String entrada = "BRL110 CLP";

        String moedaInicial = interpretador.extrairMoedaInicial(entrada);

        Assert.assertEquals("BRL", moedaInicial);
    }

    @Test
    public void retornaApenasValor(){
        String entrada = "BRL100 CLP";

        Double valor = interpretador.extrairValor(entrada);

        Assert.assertEquals(java.util.Optional.of(100.0), java.util.Optional.of(valor));
    }

    @Test
    public void retornaUmaMoedaFinal(){
        String entrada = "BRL100 CLP";

        String moedaFinal = interpretador.extrairMoedaFinal(entrada);

        Assert.assertEquals("CLP", moedaFinal);
    }

    @Test
    public void retornaDuasMoedasFinais(){
        String entrada = "BRL100 CLP EUR";

        String moedasFinais = interpretador.extrairMoedaFinal(entrada);

        Assert.assertEquals("CLP EUR", moedasFinais);
    }

    @Test
    public void retornaTodasMoedasFinais(){
        String entrada = "BRL100 EUR USD CLP ARS";

        String moedasFinais = interpretador.extrairMoedaFinal(entrada);

        Assert.assertEquals("EUR USD CLP ARS", moedasFinais);
    }

    @Test
    public void retornaMoedaInicialMaisFinal(){
        String moedaInicial = "BRL";
        String moedaFinal = "CLP";

        String resultado = interpretador.detectarMoedasParaConversao(moedaInicial, moedaFinal);

        Assert.assertEquals("BRLCLP", resultado);
    }

}
