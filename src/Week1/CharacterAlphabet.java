package Week1;

public class CharacterAlphabet {
    public static void main(String[] args) {
        char c ='*';
        alphabet(c);
        boolean result = alphabet('b');
        System.out.println(result);

    }
    public static boolean alphabet(char c)
    {
        if((c>='a'&& c<='z')||(c>='A'&&c<='Z'))
            return true;
        else
            return false;
    }
}
