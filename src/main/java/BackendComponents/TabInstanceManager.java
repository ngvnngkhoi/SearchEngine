import java.util.HashMap;

public class TabInstanceManager {
    private HashMap<Integer, TabInstance> TabInstances;
    
    public TabInstanceManager(int ID, TabInstance TabInstance) {
        this.TabInstances = new HashMap<Integer, TabInstance>();
        this.TabInstances.put(ID, TabInstance);
    }

    public void addTabInstance(int ID, TabInstance TabInstance) {
        this.TabInstances.put(ID, TabInstance);
    }

    public void removeTabInstance(int ID) {
        this.TabInstances.remove(ID);
    }

    public TabInstance getTabInstance(int ID) {
        return this.TabInstances.get(ID);
    }
}