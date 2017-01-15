package EncapsulationAndGetterSetter.examples.example2;

/**
 * Created by mosharrofrubel on 1/15/17.
 */
public class SDCard {

    private String name;
    private double size;
    private double freeSpace;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSize() {

        if(size > 8.0) {
            System.out.println("(Alert: Memory size is over 8GB!)");
        }
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getFreeSpace() {
        return freeSpace;
    }

    public void setFreeSpace(double freeSpace) {
        this.freeSpace = freeSpace;
    }
}
