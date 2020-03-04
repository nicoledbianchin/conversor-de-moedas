import org.junit.Assert;
import org.junit.Test;
import tratamentoDeDados.ValidadorMoeda;

public class TestesValidador {
    ValidadorMoeda validador = new ValidadorMoeda();

    @Test
    public void deveRetornarFalso() {
        String entrada = "ASR";

        boolean resultado = validador.validarMoeda(entrada);

        Assert.assertEquals(false, resultado);
    }

    @Test
    public void deveRetornarVerdadeiro() {
        String entrada = "USD";

        boolean resultado = validador.validarMoeda(entrada);

        Assert.assertEquals(true, resultado);
    }
}
