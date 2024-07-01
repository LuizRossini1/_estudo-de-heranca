package Arsenal;

public class Fuzil extends Arma {
    public Fuzil(String nome, int municao, String modos, boolean miraInegrada) {
        super(nome, municao, modos, miraInegrada);
    }

    public static void main(String[] args) {
        Arma fuzil01 = new Arma("Ak47", 30, "Travado, automático, semiautomático", true);

        fuzil01.fichaTecnica();
    }
}