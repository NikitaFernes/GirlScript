package Week1;

public class PositiveNumbers {
    public static void main(String[] args) {
        double x = 12.3;
        positiveNumber(x);
        String result = positiveNumber(-15.9);
        System.out.println(result);
    }


    public static String positiveNumber(double x) {


        if (x > 0.0) {
            return "Positive";
        } else if (x < 0.0) {
            return "Negative";
        } else  {
            return "Zero";
        }
    }
}




