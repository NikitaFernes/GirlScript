package Week1;

public class LargestNumber {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        int z = 0;
        LargestNumber(x,y,z);
        int result = LargestNumber(15,17,20);
        System.out.println("Largest Number = "+result);

    }

    public static Integer LargestNumber(int x, int y, int z) {
        if (x > y && x > z)
            return x;
        else if (y > z && y > x)
            return y;
        else
            return z;
    }


    }
