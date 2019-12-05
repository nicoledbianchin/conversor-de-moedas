public class ValidadorDeMoedas {

    private Boolean moedaValida = false;

    public void validarMoedas(String moeda){
        if(moeda.length() == 6){
            String primeiraMoeda = moeda.substring(0, 3);
            String segundaMoeda = moeda.substring(4);
            Boolean validaPrimeiraMoeda = validarUmaMoeda(primeiraMoeda);
            Boolean validaSegundaMoeda = validarUmaMoeda(segundaMoeda);

            if(validaPrimeiraMoeda && validaSegundaMoeda){
                moedaValida = true;
            }
        }
        else if(moeda.length() == 9){
            String primeiraMoeda = moeda.substring(0,3);
            String segundaMoeda = moeda.substring(4,7);
            String terceiraMoeda = moeda.substring(8);
        }

    }

    public Boolean validarUmaMoeda(String moeda){
        for (Moeda moedasValidas : Moeda.values()){
            if (moeda.equals(moedasValidas.getMoeda())) {
                moedaValida = true;
                break;
            } else{
                moedaValida = false;
            }
        }
        return moedaValida;
    }

}
