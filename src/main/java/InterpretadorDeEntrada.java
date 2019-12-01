public class InterpretadorDeEntrada {

    String moedaInicial;
    Double valor;
    String moedaFinal;
    String moedasFinais;
    String moeda;
    Boolean maisDeUmaMoeda = false;

    public String extrairMoedaInicial(String entrada) {
        moedaInicial = entrada.substring(0, 3);
        return moedaInicial;
    }

    public Double extrairValor(String entrada) {
        valor = Double.parseDouble(entrada.replaceAll("[^0-9]*", ""));
        return valor;
    }

    public String extrairMoedaFinal(String entrada){
        moedaFinal = entrada.split(" ")[1];
        if (entrada.split(" ").length > 2){
            return moedasFinais = moedaFinal + " " + entrada.split(" ")[2];
        } else{
            return moedaFinal;
        }
    }

}