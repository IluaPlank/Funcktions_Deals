public class Homestead {
    private double length;
    private double width;
    private int price;

    public Homestead(double length, double width, int price) {
        this.length = length;
        this.width = width;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Homestead{" +
                "length=" + length +
                ", width=" + width +
                ", price=" + price +
                '}';
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
