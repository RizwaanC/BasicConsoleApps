public class Multiplication {
    public Integer x;
    public Integer y;

    public Multiplication() {
    }

    public Multiplication(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Multiplication{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public Integer multiplying (Multiplication multiplication){
        return x * y;
    }
}
