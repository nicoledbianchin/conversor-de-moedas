import org.junit.Assert;
import org.junit.Test;

public class TestesCalculadoraDeCambio {

    private CalculadoraDeCambio calculadoraDeCambio = new CalculadoraDeCambio();

    @Test
    public void retornaValorDaTaxa(){
        String entrada = "BRLCLP";

        Double resultado = calculadoraDeCambio.determinarTaxaDeCambio(entrada);

        Assert.assertEquals(java.util.Optional.of(175.65), java.util.Optional.of(resultado));
    }

}
