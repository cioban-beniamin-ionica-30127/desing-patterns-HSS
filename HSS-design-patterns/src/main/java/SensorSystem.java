import java.util.Enumeration;
import java.util.Vector;

public class SensorSystem {

    private Vector listeners = new Vector();

    public void register(SensorListener sensorListener) {
        listeners.addElement(sensorListener);
    }

    public void notifyUser() {
        for (Enumeration e = listeners.elements(); e.hasMoreElements();) {
            ((SensorListener) e.nextElement()).detected();
        }
    }

}
