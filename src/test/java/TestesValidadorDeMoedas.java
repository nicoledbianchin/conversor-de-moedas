import org.junit.Assert;
import org.junit.Test;
import validacoes.ValidadorDeMoedas;

public class TestesValidadorDeMoedas {

    private ValidadorDeMoedas validador = new ValidadorDeMoedas();

    @Test
    public void testaMoedaValida(){
        String moeda = "EUR";

        Boolean valida = validador.validarMoeda(moeda);

        Assert.assertEquals(true, valida);
    }

    @Test
    public void testaMoedaInvalida(){
        String moeda = "ARS";

        Boolean invalida = validador.validarMoeda(moeda);

        Assert.assertEquals(false, invalida);
    }

    @Test
    public void testaValidarDuasMoedasValidas(){
        String moeda = "BRL EUR";

        Boolean valida = validador.validarMoeda(moeda);

        Assert.assertEquals(true, valida);
    }

    @Test
    public void testaValidarTresMoedasValidas(){
        String moeda = "EUR USD CLP";

        Boolean valida = validador.validarMoeda(moeda);

        Assert.assertEquals(true, valida);
    }

    @Test
    public void testaValidarUmaMoedaValidaEUmaInvalida(){
        String moeda = "EUR ASD";

        Boolean invalida = validador.validarMoeda(moeda);

        Assert.assertEquals(false, invalida);
    }

    @Test
    public void testaValidarDuasMoedasValidasEUmaInvalida(){
        String moeda = "EUR ASD BRL";

        Boolean invalida = validador.validarMoeda(moeda);

        Assert.assertEquals(false, invalida);
    }

    @Test
    public void testaValidarDuasMoedasInvalidasEUmaValida(){
        String moeda = "AER ASD BRL";

        Boolean invalida = validador.validarMoeda(moeda);

        Assert.assertEquals(false, invalida);
    }

    @Test
    public void testaValidarTresMoedasInvalidas(){
        String moeda = "AER ASD FDA";

        Boolean invalida = validador.validarMoeda(moeda);

        Assert.assertEquals(false, invalida);
    }

}
