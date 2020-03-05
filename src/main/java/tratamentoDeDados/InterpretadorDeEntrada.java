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

    public Moeda extrairMoedaInicial(String entrada) throws Exception {
        String moedaEntrada = entrada.substring(0, 3);
        for (Moeda moeda : moedasDisponiveis){

            if (moedaEntrada.equals(moeda.getMoeda())){
                moedaInicial = moeda;
                break;
            } else if (moeda.equals(moedasDisponiveis.get(moedasDisponiveis.size() - 1))){
                throw new Exception("Moeda " + moedaEntrada + " inválida");
            }

        }
        return moedaInicial;
    }

    public Double extrairValor(String entrada) {
        valor = Double.parseDouble(entrada.replaceAll("[^0-9]*", ""));
        return valor;
    }

    public List<Moeda> extrairMoedasFinais(String entrada) throws Exception {
        List<String> moedasEntrada = Arrays.asList(entrada.split(" "));

        for(int i = 1; i < moedasEntrada.size(); i++){
            String moeda = moedasEntrada.get(i);
            for(Moeda moedaDisponivel : moedasDisponiveis) {

                if(moeda.equals(moedaDisponivel.getMoeda())){
                    moedasFinais.add(moedaDisponivel);
                    break;
                } else if (moedaDisponivel.equals(moedasDisponiveis.get(moedasDisponiveis.size() - 1))){
                    throw new Exception("Moeda " + moeda + "inválida.");
                }
            }
        }
        return moedasFinais;
    }

    public int retornaQuantidadeMoedasFinais(String moedasFinais) {
        String[] lista = moedasFinais.split(" ");
        return lista.length;
    }

    public double detectarTaxaDeCambio(Moeda moedaInicial, Moeda moedaFinal){
        TaxaDeCambio taxaDeCambio = new TaxaDeCambio(moedaInicial);
        double valor = taxaDeCambio.taxas.get(moedaFinal);
        return valor;
    }
}