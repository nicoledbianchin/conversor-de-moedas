public class InterpretadorDeEntrada {

    String moedaInicial;
    Double valor;
    String moedaFinal;

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
            for (int i = 2; i < entrada.split(" ").length; i++){
                moedaFinal = moedaFinal + " " + entrada.split(" ")[i];
            }
            return moedaFinal;
        } else{
            return moedaFinal;
        }
    }

    public String detectarMoedasParaConversao(String moedaInicial, String moedaFinal){
        return moedaInicial + moedaFinal;
    }

}