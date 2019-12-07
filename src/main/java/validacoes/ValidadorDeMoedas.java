package validacoes;

import valoresMoedasETaxas.Moeda;

public class ValidadorDeMoedas {

    private Boolean moedaValida = false;

    public Boolean validarMaisDeUmaMoeda(String moeda){
        if(moeda.length() == 7){
            String primeiraMoeda = moeda.substring(0, 3);
            String segundaMoeda = moeda.substring(4);
            Boolean validaPrimeiraMoeda = validarMoeda(primeiraMoeda);
            Boolean validaSegundaMoeda = validarMoeda(segundaMoeda);

            if(validaPrimeiraMoeda && validaSegundaMoeda){
                moedaValida = true;
            }
        }
        else if(moeda.length() == 11){
            String primeiraMoeda = moeda.substring(0,3);
            String segundaMoeda = moeda.substring(4,7);
            String terceiraMoeda = moeda.substring(8);
            Boolean validaPrimeiraMoeda = validarMoeda(primeiraMoeda);
            Boolean validaSegundaMoeda = validarMoeda(segundaMoeda);
            Boolean validaTerceiraMoeda = validarMoeda(terceiraMoeda);

            if(validaPrimeiraMoeda && validaSegundaMoeda && validaTerceiraMoeda){
                moedaValida = true;
            } else {
                moedaValida = false;
            }
        }
        return moedaValida;
    }

    public Boolean validarMoeda(String moeda) {
        if (moeda.length() > 3) {
            validarMaisDeUmaMoeda(moeda);
        } else {
            for (Moeda moedasValidas : Moeda.values()) {
                if (moeda.equals(moedasValidas.getMoeda())) {
                    moedaValida = true;
                    break;
                } else {
                    moedaValida = false;
                }
            }
        }
        return moedaValida;
    }
}
