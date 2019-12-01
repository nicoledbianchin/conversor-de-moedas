package validacoes;

import valoresMoedasETaxas.Moeda;

public class ValidadorDeMoedas {

    private Boolean moedaValida = false;

    public Boolean validarMoeda(String moeda){
        for (Moeda moedasValidas : Moeda.values()){
            if (moeda.equals(moedasValidas.getMoeda())) {
                moedaValida = true;
                break;
            }
        }
        return moedaValida;
    }

}
