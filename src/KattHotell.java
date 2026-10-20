import java.util.ArrayList;
import java.util.List;

public class KattHotell {
    private final List<Katt> katter = new ArrayList<>();

    public boolean checkaIn(Katt katt) {
        for (Katt befintligKatt : katter) {
            if (befintligKatt.getChipnummer() == katt.getChipnummer()) {

                System.out.println("Katten är redan incheckad!");
                return false;
            }

        }
        katter.add(katt);
        return true;

    }
    public int antalKatter() {
        return katter.size();
    }
}
