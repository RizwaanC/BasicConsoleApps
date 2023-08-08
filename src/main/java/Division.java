public class Division {
    public Long x;
    public Long y;

    public Division(Long x, Long y) {
        this.x = x;
        this.y = y;
    }

    public Division() {
    }

    @Override
    public String toString() {
        return "Division{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public Long divide (Division division){
        return x/y;
    }
}
