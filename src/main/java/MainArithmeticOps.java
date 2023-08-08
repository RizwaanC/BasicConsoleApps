public class MainArithmeticOps {
    public static void main(String[] args) {

        Addition addition = new Addition(12,9);
        Subtraction subtraction = new Subtraction(8,19);
        Multiplication multiplication =new Multiplication(13,5);
        Division division = new Division(15l,3l);

        System.out.println("Arithmetics");
        System.out.println(" ");


        System.out.println(addition.toString());
        System.out.println(addition.adding(addition));

        System.out.println(subtraction.toString());
        System.out.println(subtraction.minusing(subtraction));

        System.out.println(multiplication.toString());
        System.out.println(multiplication.multiplying(multiplication));

        System.out.println(division.toString());
        System.out.println(division.divide(division));


    }

}
