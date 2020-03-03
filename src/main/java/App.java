import calculos.CalculadoraDeCambio;
import tratamentoDeDados.FormatadorDeSaida;
import tratamentoDeDados.InterpretadorDeEntrada;
import valoresMoedasETaxas.Moeda;

import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InterpretadorDeEntrada interpretadorDeEntrada = new InterpretadorDeEntrada();
        CalculadoraDeCambio calculadoraDeCambio = new CalculadoraDeCambio();
        FormatadorDeSaida formatadorDeSaida = new FormatadorDeSaida();

        System.out.println("Digite a moeda de origem, o valor e moeda de destino: ");
        String entrada = scanner.nextLine();

        Moeda moedaInicial = interpretadorDeEntrada.extrairMoedaInicial(entrada);
        List<Moeda> moedasFInais = interpretadorDeEntrada.extrairMoedasFinais(entrada);
        Double valor = interpretadorDeEntrada.extrairValor(entrada);

        Double taxa = 0.0;
        Double resultado = 0.0;
        String saida = "";

        for(Moeda moedaFinal : moedasFInais){
            taxa = interpretadorDeEntrada.detectarTaxaDeCambio(moedaInicial, moedaFinal);
            resultado = calculadoraDeCambio.calcularValorFinal(valor, taxa);

            saida = saida + formatadorDeSaida.formatarSaida(moedaFinal, resultado);
        }
        System.out.println(saida);

        scanner.close();
    }
}
