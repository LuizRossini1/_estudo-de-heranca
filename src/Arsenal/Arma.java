package Arsenal;

public class Arma {
    private String nome;
    private int municao;
    private String modos;
    private boolean miraIntegrada;

    //Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMunicao(int municao) {
        this.municao = municao;
    }

    public void setModos(String modos) {
        this.modos = modos;
    }

    public void setMiraIntegrada(boolean miraIntegrada) {
        this.miraIntegrada = miraIntegrada;
    }

    public void somArma() {
        System.out.println("Pow, pow");
    }

    //Getters
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