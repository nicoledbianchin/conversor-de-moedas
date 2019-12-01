public class InterpretadorDeEntrada {

    String moedaInicial;

    public String extrairMoedaInicial(String entrada) {
        moedaInicial = entrada.substring(0, 3);
        return moedaInicial;
    }
}
