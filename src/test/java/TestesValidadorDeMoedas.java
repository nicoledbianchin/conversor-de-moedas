import org.junit.Assert;
import org.junit.Test;

public class TestesValidadorDeMoedas {

    ValidadorDeMoedas validador = new ValidadorDeMoedas();

    @Test
    public void testaMoedaValida(){
        String moeda = "BRL";

        Boolean valida = validador.validarMoeda(moeda);

        Assert.assertEquals(true, valida);
    }

}
