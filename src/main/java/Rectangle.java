/**
 * Class to define the measurements of a rectangle
 * @author Leon Chiang
 * @version 1.0.0
 */

class Rectangle {
    private double length;
    private double width;

    /**
     * Create a rectangle with width of 8 and length of 4
     */

    public Rectangle () {
        this.length=4;
        this.width=8;
    }

    /**
     * Create a rectangle with width of 8 and custom length
     * @param length Length of the rectangle
     */

    public Rectangle(double length) {
        this.length=length;
        this.width=8;
    }

    /**
     * Create a rectangle with custom length and width
     * @param length Length of the rectangle
     * @param width Width of the rectangle
     */

    public Rectangle(double length, double width) {
        this.length=length;
        this.width=width;
    }

    /**
     * Get length of the rectangle
     * @param length Length of the rectangle
     */

    public double getLength() {
        return this.length;
    }

    /**
     * Get width of the rectangle
     * @param width Width of the rectangle
     */

    public double getWidth() {
        return this.width;
    }
}