import org.junit.Assert;
import org.junit.Test;

public class TestesCalculadoraDeCambio {

    private CalculadoraDeCambio calculadoraDeCambio = new CalculadoraDeCambio();

    @Test
    public void retornaValorDaTaxa(){
        String entrada = "BRLEUR";

        Double resultado = calculadoraDeCambio.determinarTaxaDeCambio(entrada);

        Assert.assertEquals(java.util.Optional.of(0.23), java.util.Optional.of(resultado));
    }

    @Test
    public void calcularValorFinal(){
        Double resultado = calculadoraDeCambio.calcularValorFinal(100.0, 175.65);

        Assert.assertEquals(java.util.Optional.of(17565.0), java.util.Optional.of(resultado));
    }

    @Test
    public void calcularTaxEValorFinal(){
        String entrada = "BRLCLP";

        Double taxa = calculadoraDeCambio.determinarTaxaDeCambio(entrada);
        Double resultado = calculadoraDeCambio.calcularValorFinal(100.0, taxa);

        Assert.assertEquals(java.util.Optional.of(17565.0), java.util.Optional.of(resultado));
    }

}
