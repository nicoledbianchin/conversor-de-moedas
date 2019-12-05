import org.junit.Assert;
import org.junit.Test;

public class TestesValidadorDeMoedas {

    private ValidadorDeMoedas validador = new ValidadorDeMoedas();

    @Test
    public void testaMoedaValida(){
        String moeda = "EUR";

        Boolean valida = validador.validarUmaMoeda(moeda);

        Assert.assertEquals(true, valida);
    }

    @Test
    public void testaMoedaInvalida(){
        String moeda = "ARS";

        Boolean invalida = validador.validarUmaMoeda(moeda);

        Assert.assertEquals(false, invalida);
    }

}
