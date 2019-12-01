public class CalculadoraDeCambio {

    private Double taxaDeCambio;

    public Double determinarTaxaDeCambio(String moedasParaConversao){
        for (TaxaDeCambio taxa : TaxaDeCambio.values()){
            if (moedasParaConversao.equals(taxa.name())){
                taxaDeCambio = taxa.getValor();
            }
        }
        return taxaDeCambio;
    }

}
