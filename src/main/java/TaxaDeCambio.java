public class TaxaDeCambio {

    Moeda origem;
    Moeda destino;
    Double taxaDeCambio;

    public String determinarTaxaDeCambio(String moedaInicial, String moedaFinal){
        for (Moeda moeda : Moeda.values()){
            if (moedaInicial.equals(moeda.name())){
                origem = moeda;
            }
            if(moedaFinal.equals(moeda.name())){
                destino = moeda;
            }
        }
        return origem + " " +destino;
    }

}
