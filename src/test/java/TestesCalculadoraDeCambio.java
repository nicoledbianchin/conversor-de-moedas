import calculos.CalculadoraDeCambio;
import org.junit.Assert;
import org.junit.Test;
import tratamentoDeDados.InterpretadorDeEntrada;

public class TestesCalculadoraDeCambio {

    private CalculadoraDeCambio calculadoraDeCambio = new CalculadoraDeCambio();

    InterpretadorDeEntrada interpretadorDeEntrada = new InterpretadorDeEntrada();

    @Test
    public void calcularValorFinal(){
        Double resultado = calculadoraDeCambio.calcularValorFinal(100.0, 175.65);

        Assert.assertEquals(java.util.Optional.of(17565.0), java.util.Optional.of(resultado));
    }

}
