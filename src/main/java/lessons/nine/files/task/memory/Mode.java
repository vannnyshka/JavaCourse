package lessons.nine.files.task.memory;

public enum Mode {
    BYTE(8.0),
    KILOBYTE(8000.0),
    MEGABYTE(8000000.0),
    GIGABYTE(8000000000.0);

    private double size;

    Mode(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }


}
