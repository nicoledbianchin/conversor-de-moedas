public class ValidadorDeMoedas {

    Boolean moedaValida = false;

    public Boolean validarMoeda(String moeda){
        for (Moeda moedasValidas : Moeda.values()){
            if (moeda.equals(moedasValidas.getMoeda())) {
                moedaValida = true;
            }
        }
        return moedaValida;
    }

}
