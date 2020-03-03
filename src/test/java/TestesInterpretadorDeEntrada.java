import org.junit.Assert;
import org.junit.Test;
import tratamentoDeDados.InterpretadorDeEntrada;
import valoresMoedasETaxas.Moeda;

import java.util.List;

public class TestesInterpretadorDeEntrada {

    private InterpretadorDeEntrada interpretador = new InterpretadorDeEntrada();

    @Test
    public void retornaApenasMoedaInicial(){
        String entrada = "BRL110 CLP";

        Moeda moedaInicial = interpretador.extrairMoedaInicial(entrada);

        Assert.assertEquals(Moeda.BRL, moedaInicial);
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

        List<Moeda> moedaFinal = interpretador.extrairMoedasFinais(entrada);

        Assert.assertEquals(Moeda.CLP, moedaFinal.get(0));
    }

    @Test
    public void retornaDuasMoedasFinais(){
        String entrada = "BRL100 CLP EUR";

        List<Moeda> moedasFinais = interpretador.extrairMoedasFinais(entrada);

        Assert.assertEquals(Moeda.CLP, moedasFinais.get(0));
        Assert.assertEquals(Moeda.EUR, moedasFinais.get(1));
    }

//    @Test
//    public void retornaTodasMoedasFinais(){
//        String entrada = "BRL100 EUR USD CLP";
//
//        String moedasFinais = interpretador.extrairMoedaFinal(entrada);
//
//        Assert.assertEquals("EUR USD CLP", moedasFinais);
//    }
//
//    @Test
//    public void retornaQuantasMoedasFinaisSao(){
//        String moedasFinais = "BRL EUR USD";
//
//        int quantidadeMoedasFinais = interpretador.retornaQuantidadeMoedasFinais(moedasFinais);
//
//        Assert.assertEquals(3, quantidadeMoedasFinais);
//    }

//    @Test
//    public void retornaMoedaInicialMaisFinal(){
//        String moedaInicial = "BRL";
//        String moedaFinal = "CLP";
//
//        String resultado = interpretador.detectarMoedaParaConversao(moedaInicial, moedaFinal);
//
//        Assert.assertEquals("BRLCLP", resultado);
//    }
//
//    @Test
//    public void retornaMoedasIniciaisEFinais(){
//        String moedaInicial = "BRL";
//        String moedaFinal = "CLP EUR USD";
//
//        String resultado = interpretador.detectarMoedaParaConversao(moedaInicial, moedaFinal);
//
//        Assert.assertEquals("BRLCLP BRLEUR BRLUSD", resultado);
//}

}
