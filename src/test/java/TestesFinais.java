import calculos.CalculadoraDeCambio;
import org.junit.Assert;
import org.junit.Test;
import tratamentoDeDados.InterpretadorDeEntrada;
import valoresMoedasETaxas.Moeda;

import java.util.List;

public class TestesFinais {

    private InterpretadorDeEntrada interpretadorDeEntrada = new InterpretadorDeEntrada();
    private CalculadoraDeCambio calculadoraDeCambio = new CalculadoraDeCambio();

    @Test
    public void calculoFinalApenasUmRetorno(){
        String entrada = "BRL100 CLP";

        Moeda moedaInicial = interpretadorDeEntrada.extrairMoedaInicial(entrada);
        List<Moeda> moedasFinais = interpretadorDeEntrada.extrairMoedasFinais(entrada);

        Double valor = interpretadorDeEntrada.extrairValor(entrada);
        Double taxa = 0.0;
        Double resultado = 0.0;

        for(Moeda moedaFinal : moedasFinais ) {
            taxa = interpretadorDeEntrada.detectarTaxaDeCambio(moedaInicial, moedaFinal);
            resultado = calculadoraDeCambio.calcularValorFinal(valor, taxa);
        }

        Assert.assertEquals(java.util.Optional.of(175.65), java.util.Optional.of(taxa));
        Assert.assertEquals(java.util.Optional.of(17565.0), java.util.Optional.of(resultado));
    }

}
