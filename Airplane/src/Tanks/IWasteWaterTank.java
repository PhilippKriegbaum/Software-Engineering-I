
public interface IWasteWaterTank {
    public String version();
    public void lock();
    public void unlock();
    public void add(int amount);
    public void pumpOut();
}
