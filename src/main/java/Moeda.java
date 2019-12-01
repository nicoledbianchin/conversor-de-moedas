public enum Moeda {
    BRL("BRL"),
    CLP("CLP"),
    EUR("EUR"),
    USD("USD");

    private String nome;

    Moeda(String nome){
        this.nome = nome;
    }

    public String getMoeda(){
        return nome;
    }

}
