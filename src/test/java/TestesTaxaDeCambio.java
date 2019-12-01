import org.junit.Assert;
import org.junit.Test;

public class TestesTaxaDeCambio {

    TaxaDeCambio taxaDeCambio = new TaxaDeCambio();

    @Test
    public void retornaMoedasDeOrigemEDestino(){
        String moedaInicial = "BRL";
        String moedaFinal = "CLP";

        String resultado = taxaDeCambio.determinarTaxaDeCambio(moedaInicial, moedaFinal);

        Assert.assertEquals("BRL CLP", resultado);
    }

}
