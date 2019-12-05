import org.junit.Assert;
import org.junit.Test;

public class TestesFinais {

    private InterpretadorDeEntrada interpretadorDeEntrada = new InterpretadorDeEntrada();
    private ValidadorDeMoedas validadorDeMoedas = new ValidadorDeMoedas();
    private CalculadoraDeCambio calculadoraDeCambio = new CalculadoraDeCambio();

    @Test
    public void calculoFinalApenasUmRetorno(){
        String entrada = "BRL100 CLP";
        String moedaInicial = interpretadorDeEntrada.extrairMoedaInicial(entrada);
        String moedaFinal = interpretadorDeEntrada.extrairMoedaFinal(entrada);
        String moedasConversao = interpretadorDeEntrada.detectarMoedaParaConversao(moedaInicial, moedaFinal);
        Double valor = interpretadorDeEntrada.extrairValor(entrada);

        Boolean validacaoInicial = validadorDeMoedas.validarUmaMoeda(moedaInicial);
        Boolean validacaoFinal = validadorDeMoedas.validarUmaMoeda(moedaFinal);
        Double taxa = calculadoraDeCambio.determinarTaxaDeCambio(moedasConversao);
        Double resultado = calculadoraDeCambio.calcularValorFinal(valor, taxa);

        Assert.assertEquals(true, validacaoInicial);
        Assert.assertEquals(true, validacaoFinal);
        Assert.assertEquals(java.util.Optional.of(175.65), java.util.Optional.of(taxa));
        Assert.assertEquals(java.util.Optional.of(17565.0), java.util.Optional.of(resultado));
    }

}
