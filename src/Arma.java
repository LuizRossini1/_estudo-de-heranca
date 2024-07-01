public class Arma {
    private String nome;
    private int municao;
    private String modos;
    private boolean miraIntegrada;

    public void somArma() {
        System.out.println("Pow, pow");
    }

    //getters
    public String getNome() {
        return nome;
    }

    public int getMunicao() {
        return municao;
    }

    public String getModos() {
        return modos;
    }

    public boolean isMiraIntegrada() {
        return miraIntegrada;
    }
}