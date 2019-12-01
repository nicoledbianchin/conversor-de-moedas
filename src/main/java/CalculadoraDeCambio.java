import java.util.ArrayList;
import java.util.List;

public class CalculadoraDeCambio {

    private Double taxaDeCambio;
    List<Double> taxas = new ArrayList<>();

    public Double determinarTaxaDeCambio(String moedasParaConversao){
        for (TaxaDeCambio taxa : TaxaDeCambio.values()){
            if (moedasParaConversao.equals(taxa.name())){
                taxaDeCambio = taxa.getValor();
            }
        }
        return taxaDeCambio;
    }

    public Double calcularValorFinal(Double valor, Double taxaDeCambio){
        return valor * taxaDeCambio;
    }

}
