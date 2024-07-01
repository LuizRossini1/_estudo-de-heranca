package Arsenal;

public class Arma {
    private String nome;
    private int municao;
    private String modos;
    private boolean miraIntegrada;

    //Construtor
    public Arma(String nome, int municao, String modos, boolean miraIntegrada) {
        this.nome = nome;
        this.municao = municao;
        this.modos = modos;
        this.miraIntegrada = miraIntegrada;
    }

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

    //Métodos

    public void somArma() {
        System.out.println("Pow, pow");
    }

    public void fichaTecnica() {
        System.out.println(getNome());
        System.out.println(getModos());
        System.out.println(getMunicao());
        System.out.println(isMiraIntegrada());
    }
}