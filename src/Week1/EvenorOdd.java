package Week1;

public class EvenorOdd {
    public static void main(String[] args) {
        int x=0;
        EvenorOdd(x);
        String result = EvenorOdd(15);
        System.out.println(result);


    }
    public static String EvenorOdd(int x)
    {
        if(x%2==0)
            return "Even";
        else
            return "Odd";
    }
}
