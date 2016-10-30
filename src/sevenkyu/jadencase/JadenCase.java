package sevenkyu.jadencase;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Kata link: https://www.codewars.com/kata/5390bac347d09b7da40006f6
 * 7 Kyu
 * Java
 */
public class JadenCase {

    public String toJadenCase(String phrase) {

        String out = "";

        if (phrase == null || phrase.equals("")) return null;

        String[] split = phrase.split(" ");
        for (String s : split) {
            String cap = s.substring(0, 1).toUpperCase() + s.substring(1);
            out += cap + " ";
        }

        return out.substring(0, out.length() - 1);
    }

    public String toJadenCaseStream(String phrase) {

        if (phrase == null || phrase.equals("")) return null;

        return Arrays.stream(phrase.split(" "))
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                .collect(Collectors.joining(" "));

    }

    public static void main(String[] args) {

        JadenCase jd = new JadenCase();
        String toJade = "most trees are blue";
        System.out.println(jd.toJadenCase(toJade));
        System.out.println(jd.toJadenCaseStream(toJade));
    }

}
