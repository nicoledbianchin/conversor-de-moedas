import calculos.CalculadoraDeCambio;
import tratamentoDeDados.FormatadorDeSaida;
import tratamentoDeDados.InterpretadorDeEntrada;
import validacoes.ValidadorDeMoedas;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InterpretadorDeEntrada interpretadorDeEntrada = new InterpretadorDeEntrada();
        ValidadorDeMoedas validadorDeMoedas = new ValidadorDeMoedas();
        CalculadoraDeCambio calculadoraDeCambio = new CalculadoraDeCambio();
        FormatadorDeSaida formatadorDeSaida = new FormatadorDeSaida();

        System.out.println("Digite a moeda de origem, o valor e moeda de destino: ");
        String entrada = scanner.nextLine();

        String moedaInicial = interpretadorDeEntrada.extrairMoedaInicial(entrada);
        String moedaFinal = interpretadorDeEntrada.extrairMoedaFinal(entrada);
        String moedasParaConversao = interpretadorDeEntrada.detectarMoedaParaConversao(moedaInicial, moedaFinal);

        Boolean validacaoMoedaInicial = validadorDeMoedas.validarMoeda(moedaInicial);
        Boolean validacaoMoedaFinal = validadorDeMoedas.validarMoeda(moedaFinal);

        if (!validacaoMoedaInicial) {
            System.out.println("Moeda não suportada: " + moedaInicial);
        }
        else if (!validacaoMoedaFinal) {
            System.out.println("Moeda não suportada: " + moedaFinal);
        } else {
            Double valor = interpretadorDeEntrada.extrairValor(entrada);
            Double taxaDeCambio = calculadoraDeCambio.determinarTaxaDeCambio(moedasParaConversao);
            Double resultado = calculadoraDeCambio.calcularValorFinal(valor, taxaDeCambio);

            System.out.println(formatadorDeSaida.formatarSaida(moedaFinal, resultado));

            scanner.close();
        }
    }
}
