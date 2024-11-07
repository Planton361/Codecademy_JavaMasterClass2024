public class OverloadMethodChallenge {
    public static void main(String[] args) {
        System.out.println(convertToCentimeters(68));
        System.out.println(convertToCentimeters(5,8));
    }



    public static double convertToCentimeters(int inches){
        return (double) (inches * 2.54);
    }

    public static double convertToCentimeters (int feet, int inches){
        inches = feet * 12 + inches;
        return (double) (inches * 2.54);

    }
}


