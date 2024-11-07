public class ChallengeOperator {
    public static void main(String[] args) {


        double x = 20.00;
        double y = 80.00;
        double result = (x + y) * 100;

        double remainder = result % 40.00;

        boolean check = remainder == 0 || remainder != 0;

    System.out.println(check);
    }
}
