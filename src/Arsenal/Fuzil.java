package Arsenal;

public class Fuzil extends Arma {

    public static void main(String[] args) {
        Arma minhaArma = new Arma();

        minhaArma.setNome("Ak47");
        minhaArma.setModos("Automático, Semi");
        minhaArma.setMunicao(30);
        minhaArma.setMiraIntegrada(true);

        System.out.println(minhaArma.getNome());
        System.out.println(minhaArma.getModos());
        System.out.println(minhaArma.getMunicao());
        System.out.println(minhaArma.isMiraIntegrada());

    }
}