import java.util.*;
import java.util.stream.*;

public class AnalizaZaliha {
    public Map<String, Long> brojProizvodaPoKategoriji(Skladiste s) {
        return s.getProizvodi().stream()
                .collect(Collectors.groupingBy(Proizvod::kategorija, Collectors.counting()));
    }

    public String kategorijaSaNajvise(Skladiste s) {
        return brojProizvodaPoKategoriji(s).entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);
    }

    public double ukupnaVrijednostZaliha(Skladiste s) {
        return s.getProizvodi().stream()
                .mapToDouble(Proizvod::vrijednostZaliha)
                .sum();
    }

    public List<String> sifreProizvodaIspodVrijednosti(Skladiste s, double prag) {
        return s.getProizvodi().stream()
                .filter(p -> p.vrijednostZaliha() < prag)
                .map(Proizvod::getSifra)
                .collect(Collectors.toList());
    }
}
