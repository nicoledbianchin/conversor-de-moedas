package valoresMoedasETaxas;

import java.util.HashMap;
import java.util.Map;

import static valoresMoedasETaxas.Moeda.*;

public class TaxaDeCambio {

    public Moeda moedaInicial;
    public Map<Moeda, Double> taxas = new HashMap<>();

    public TaxaDeCambio(Moeda moedaInicial) {
        this.moedaInicial = moedaInicial;
        if(moedaInicial == BRL ) {
            taxas.put(CLP, 175.65);
            taxas.put(EUR, 0.23);
            taxas.put(USD, 0.23);
        } else if(moedaInicial == CLP) {
            taxas.put(BRL, 0.0057);
            taxas.put(EUR, 0.0013);
            taxas.put(USD, 0.0012);
        } else if(moedaInicial == EUR) {
            taxas.put(BRL, 4.29);
            taxas.put(CLP, 754.01);
            taxas.put(USD, 1.101);
        } else if(moedaInicial == USD) {
            taxas.put(BRL, 4.23);
            taxas.put(CLP, 804.5);
            taxas.put(EUR, 0.907);
        }
    }

}
