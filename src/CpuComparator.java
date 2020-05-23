import java.util.Comparator;

class CpuComparator implements Comparator<Computer> {
    @Override
    public int compare(Computer comp1, Computer comp2) {
        if (comp1.getCpu() > comp2.getCpu())
            return 1;
        else if (comp1.getCpu() < comp2.getCpu())
            return -1;
        else
          return Integer.compare(comp1.getCpu(), comp2.getCpu());
    }
}