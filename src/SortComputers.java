import java.util.*;

public class SortComputers {
    private static final String SORT_NAME = "name";
    private static final String SORT_CPU = "cpu";
    private static final String SORT_MEMORY = "ram";

    public static void main(String[] args) {
        Computer[] computers = createComputers();
        Comparator<Computer> comparator = getComputerComparator();
        sortAndPrint(computers, comparator);
    }

    private static void sortAndPrint(Computer[] computers, Comparator<Computer> comparator) {
        Arrays.sort(computers, comparator);
        for (Computer computer : computers) {
            System.out.println(computer);
        }
    }

    private static Comparator<Computer> getComputerComparator() {
        System.out.println("Po czym sortujemy:");
        System.out.printf( "%s, %s, %s?\n",SORT_NAME, SORT_CPU, SORT_MEMORY);
        Scanner scanner = new Scanner(System.in);
        String sortOrder = scanner.nextLine();
        Comparator<Computer> comparator = null;


        switch (sortOrder) {
            case SORT_NAME:
                break;
            case SORT_CPU:
                comparator = new CpuComparator();
                break;
            case SORT_MEMORY:
                comparator = new MemoryComparator();
                break;
            default:
                System.out.println("Nie ma takiego kryterium sortowania");
                System.exit(0);
        }
        return comparator;
    }

    private static Computer[] createComputers() {
        return new Computer[]{
                new Computer("hp 3000", 3000, 4000),
                new Computer("hp 3800", 3800, 8000),
                new Computer("apple 4500", 4500, 16000),
                new Computer("dell 4000", 4000, 8000),
                new Computer("dell 3600", 3600, 4000),
        };
    }
}
