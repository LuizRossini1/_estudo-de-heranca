package Arsenal;

public class Fuzil extends Arma {
    public Fuzil(String nome, int municao, String modos, boolean miraIntegrada) {
        super(nome, municao, modos, miraIntegrada);
    }

    @Override
    public void somArma() {
        super.somArma();
        System.out.println("Ta, ra, ta, ta, ta");
    }

    public static void main(String[] args) {
        Fuzil fuzil01 = new Fuzil("Ak47", 30, "Travado, automático, semiautomático", true);
        Fuzil fuzil02 = new Fuzil("M4", 30, "Travado, semiautomático, rajada", true);

        fuzil02.setNome("Oi");
        System.out.println(fuzil02.getNome());

        //fuzil01.fichaTecnica();
        //$fuzil02.fichaTecnica();

        //fuzil01.somArma();
    }
}