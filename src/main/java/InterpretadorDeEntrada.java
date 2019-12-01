public class InterpretadorDeEntrada {

    String moedaInicial;
    Double valor;

    public String extrairMoedaInicial(String entrada) {
        moedaInicial = entrada.substring(0, 3);
        return moedaInicial;
    }

    public Double extrairValor(String entrada){
        valor = Double.parseDouble(entrada.replaceAll("[^0-9]*", ""));
        return valor;
    }
}
