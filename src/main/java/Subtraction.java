public class Subtraction {
    public Integer x;
    public Integer y;

    public Subtraction(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    public Subtraction() {
    }

    @Override
    public String toString() {
        return "Subtraction{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
    
    public Integer minusing  (Subtraction subtraction){
        return x - y;
    }
}
