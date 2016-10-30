package sevenkyu.getmiddlechar;

/**
 * Kata link: https://www.codewars.com/kata/56747fd5cb988479af000028
 * 7 kyu
 * Java
 */
public class GetMiddleChar {

    public String getMiddle(String word) {
        int m = word.length();
        if (m % 2 == 0) return word.substring(m / 2 - 1, m / 2 + 1);
        else return word.substring(m / 2, m / 2 + 1);
    }

    public static void main(String[] args) {

        GetMiddleChar g = new GetMiddleChar();
        System.out.println(g.getMiddle("middle"));
    }
}
