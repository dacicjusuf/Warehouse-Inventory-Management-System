import java.util.*;
import java.util.stream.*;

public class Skladiste {
    private Map<String, Proizvod> proizvodi;

    public Skladiste() {
        proizvodi = new HashMap<>();
    }

    public void dodajProizvod(Proizvod p) {
        proizvodi.put(p.getSifra(), p);
    }
    public void obrisiProizvod(String sifra) {
        proizvodi.remove(sifra);
    }
    public Proizvod pronadjiProizvod(String sifra) {
        return proizvodi.get(sifra);
    }

    public void prikaziSveProizvode() {
        proizvodi.values().forEach(System.out::println);
    }

    public Proizvod proizvodSNajvecimVrijednostima() {
        return proizvodi.values().stream()
                .max(Comparator.comparingDouble(Proizvod::vrijednostZaliha))
                .orElse(null);
    }

    public List<Proizvod> proizvodiSaNulaNaStanju() {
        return proizvodi.values().stream()
                .filter(p -> p.getKolicinaNaStanju() == 0)
                .collect(Collectors.toList());
    }

    public Collection<Proizvod> getProizvodi() {
        return proizvodi.values();
    }
}
