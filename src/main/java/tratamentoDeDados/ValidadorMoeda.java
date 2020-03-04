package tratamentoDeDados;

import valoresMoedasETaxas.*;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

public class ValidadorMoeda {
    List<Moeda> moedasDisponiveis = new ArrayList<Moeda>(EnumSet.allOf(Moeda.class));
    boolean valida = false;

    public boolean validarMoeda(String moeda){
        for (Moeda moedaValida : moedasDisponiveis) {
            if (moedaValida.getMoeda().equals(moeda)) {
                valida = true;
            }
        }
        return  valida;
    }
}
