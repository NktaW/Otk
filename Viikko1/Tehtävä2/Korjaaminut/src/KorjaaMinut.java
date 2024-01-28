import java.util.ArrayList;
import java.util.List;

public class KorjaaMinut {
    public static void main(String[] args) {
        // Testataan metodia erilaisilla syötteillä
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(-1);
        lista.add(3);
        lista.add(-4);
        lista.add(-5);
        lista.add(6);
    

        poistaNegatiiviset(lista);
        System.out.println(lista);
}
    

    /**
     * Metodi poistaa listasta kaikki nollaa pienemmät alkiot
     * @param lista lista, josta alkiot poistetaan
     */
    public static void poistaNegatiiviset(ArrayList<Integer> lista) {

        for (int indeksi = lista.size() - 1; indeksi > 0; indeksi--) {
            if (lista.get(indeksi) < 0) {
                lista.remove(indeksi);

            }
        }
    }
}