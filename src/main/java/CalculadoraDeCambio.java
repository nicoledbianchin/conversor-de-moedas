public class CalculadoraDeCambio {

    private Double taxaDeCambio;

    public Double determinarTaxaDeCambio(String moedasParaConversao){
        if (moedasParaConversao.length() > 6){
            determinarTaxasDeCambio(moedasParaConversao);
        }

        return percorrerListaDeTaxas(moedasParaConversao);
    }

    public void determinarTaxasDeCambio(String moedasParaConversao){
        String[] lista = moedasParaConversao.split(" ");
        for (int i = 0; i < lista.length; i++) {
            percorrerListaDeTaxas(lista[i]);
        }
    }

    public Double percorrerListaDeTaxas(String moedasParaConversao){
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
