public class Computer implements Comparable<Computer> {
    private String name;
    private int cpu;
    private int ram;

    public Computer(String name, int cpu, int ram) {
        this.name = name;
        this.cpu = cpu;
        this.ram = ram;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCpu() {
        return cpu;
    }

    public void setCpu(int cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public int compareTo(Computer c) {
        return this.name.compareTo(c.name);
    }

    @Override
    public String toString() {
        return "Computer name: " + name  + ", cpu: " + cpu +
                ", ram: " + ram;
    }
}