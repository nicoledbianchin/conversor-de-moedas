package tratamentoDeDados;

import valoresMoedasETaxas.Moeda;
import valoresMoedasETaxas.TaxaDeCambio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;

public class InterpretadorDeEntrada {

    List<Moeda> moedasDisponiveis = new ArrayList<Moeda>(EnumSet.allOf(Moeda.class));
    List<Moeda> moedasFinais = new ArrayList<>();
    Moeda moedaInicial;
    Double valor;

    public Moeda extrairMoedaInicial(String entrada) {
        String moedaEntrada = entrada.substring(0, 3);
        for (Moeda moeda : moedasDisponiveis){
            if (moedaEntrada.equals(moeda.getMoeda())){
                moedaInicial = moeda;
            }
        }
        return moedaInicial;
    }

    public Double extrairValor(String entrada) {
        valor = Double.parseDouble(entrada.replaceAll("[^0-9]*", ""));
        return valor;
    }

    public List<Moeda> extrairMoedasFinais(String entrada){
        List<String> moedasEntrada = Arrays.asList(entrada.split(" "));
        for(String moeda : moedasEntrada){
            for(Moeda moedaDisponivel : moedasDisponiveis) {
                if(moeda.equals(moedaDisponivel.getMoeda())){
                    moedasFinais.add(moedaDisponivel);
                }
            }
        }
        return moedasFinais;
//        moedaFinal = moeda[1];
//        if (moeda.length > 2){
//            for (int i = 2; i < moeda.length; i++){
//                moedaFinal = moedaFinal + " " + moeda[i];
//            }
//            return moedaFinal;
//        } else{
//            return moedaFinal;
//        }
    }

    public int retornaQuantidadeMoedasFinais(String moedasFinais) {
        String[] lista = moedasFinais.split(" ");
        return lista.length;
    }

//    public double detectarTaxaDeCambio(Moeda moedaInicial, Moeda moedaFinal){
//        TaxaDeCambio taxaDeCambio = new TaxaDeCambio(moedaInicial);
//        double valor = taxaDeCambio.taxas.get(moedaFinal);
//        return valor;
//    }
//
//    public String detectarMoedaParaConversao(String origem, String destino){
//        if (destino.length() > 3){
//            return detectarMoedasParaConversao(origem, destino);
//        }
//        else {
//            return origem + destino;
//        }
//    }
//
//    public String detectarMoedasParaConversao(String origem, String destinos){
//        String[] lista = destinos.split(" ");
//        String moedas = origem + lista[0];
//        for (int i = 1; i < lista.length; i++){
//            moedas = moedas + " " + origem + lista[i];
//        }
//        return moedas;

//    }
}