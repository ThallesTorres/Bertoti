import java.util.ArrayList;
import java.util.List;

public class Incendio {
    public final List<Emergencia> listeners = new ArrayList<>();

    public void addListener(Emergencia toAdd) {
        listeners.add(toAdd);
    }

    public Incendio() {
        this.addListener(new CorpoBombeiro());
        this.addListener(new DonoCasa());
    }
}
