import java.util.Timer;
import java.util.TimerTask;

public class App {

    static int i = 0;

    public static void main(String[] args) {
        Incendio incendio = new Incendio();
        Vizinho vizinho = new Vizinho();

        incendio.addListener(vizinho);

        TimerTask timerTask = new TimerTask() {
            public void run() {
                i++;
                System.out.println(i);

                if ((i % 5) == 0 && i <= 20) {

                    for (Emergencia emergencia: incendio.listeners) {

                        emergencia.notificar();
                    }
                }
            }
        };
        Timer timer = new Timer();

        timer.scheduleAtFixedRate(timerTask, 1000L, 1000L);
    }
}
