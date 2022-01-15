package lk.cinec;

public class Primary {

    private double x = 20;
    private double y = 30;

    public Primary() {
    }

    public Primary(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void powerX() {
        this.x *= this.x;
    }

    public void powerY() {
        this.y *= this.y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Primary{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
