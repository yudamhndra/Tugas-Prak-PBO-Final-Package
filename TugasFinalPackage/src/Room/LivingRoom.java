package Room;

public class LivingRoom extends Room{
    private double width;
    private double length;

    public LivingRoom(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double area() {
        return width * length;
    }
}
