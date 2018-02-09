package Helper;

public class Display
{
    public static void array(String[] strings) {
        for (String str: strings)
            System.out.print(str);
        System.out.println();
    }

    public static void array(char[] chars) {
        for (char ch: chars)
            System.out.print(ch);
        System.out.println();
    }
}
