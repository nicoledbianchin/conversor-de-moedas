package tratamentoDeDados;

import valoresMoedasETaxas.Moeda;

public class FormatadorDeSaida {

    public String formatarSaida(Moeda moedaFinal, Double resultado){
        return moedaFinal.getMoeda() + resultado + " ";
    }

}
