public class InterpretadorDeEntrada {

    String moedaInicial;
    Double valor;
    String moedaFinal;
    String[] moedas;
    String moedasFinais;

    public String extrairMoedaInicial(String entrada) {
        moedaInicial = entrada.substring(0, 3);
        return moedaInicial;
    }

    public Double extrairValor(String entrada) {
        valor = Double.parseDouble(entrada.replaceAll("[^0-9]*", ""));
        return valor;
    }

    public String extrairMoedaFinal(String entrada){
        moedas = entrada.split(" ");
        moedaFinal = moedas[1];
        moedasFinais = moedas[1];
        if (moedas.length > 2){
            for (int i = 2; i < moedas.length; i++){
                moedasFinais = moedasFinais + " " + moedas[i];
            }
            return moedasFinais;
        } else{
            return moedaFinal;
        }
    }

}