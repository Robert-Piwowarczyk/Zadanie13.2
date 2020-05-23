import java.util.Comparator;

class MemoryComparator implements Comparator<Computer> {
    @Override
    public int compare(Computer comp1, Computer comp2) {
        return Integer.compare(comp1.getRam(), comp2.getRam());
    }
}