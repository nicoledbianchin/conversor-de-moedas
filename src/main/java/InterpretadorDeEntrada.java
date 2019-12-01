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
        String[] moeda = entrada.split(" ");
        moedaFinal = moeda[1];
        if (moeda.length > 2){
            for (int i = 2; i < moeda.length; i++){
                moedaFinal = moedaFinal + " " + moeda[i];
            }
            return moedaFinal;
        } else{
            return moedaFinal;
        }
    }

    public String detectarMoedaParaConversao(String origem, String destino){
        if (destino.length() > 3){
            return detectarMoedasParaConversao(origem, destino);
        }
        else {
            return origem + destino;
        }
    }

    public String detectarMoedasParaConversao(String origem, String destinos){
        String[] lista = destinos.split(" ");
        String moedas = origem + lista[0];
        for (int i = 1; i < lista.length; i++){
            moedas = moedas + " " + origem + lista[i];
        }
        return moedas;
    }

}