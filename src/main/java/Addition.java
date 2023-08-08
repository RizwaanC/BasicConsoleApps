public class Addition {
    public Integer x;
    public Integer y;

    public Addition() {
    }

    public Addition(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Addition{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public Integer adding (Addition addition){
        return x + y;
    }


}
