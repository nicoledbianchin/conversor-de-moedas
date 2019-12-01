package valoresMoedasETaxas;

public enum TaxaDeCambio {

    BRLCLP(175.65),
    BRLEUR(0.23),
    BRLUSD(0.23),
    CLPBRL(0.0057),
    CLPEUR(0.0013),
    CLPUSD(0.0012),
    EURBRL(4.29),
    EURCLP(754.01),
    EURUSD(1.101),
    USDBRL(4.23),
    USDCLP(804.5),
    USDEUR(0.907);

    private Double valor;

    TaxaDeCambio(Double valor){
        this.valor = valor;
    }

    public Double getValor(){
        return valor;
    }

}
