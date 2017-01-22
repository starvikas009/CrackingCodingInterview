package cci.recursion;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by vkumar on 1/22/17.
 */
public class ValidParens {
    public static Set<String> getValidParenCombinations(int n) {
        return getValidParenCombinations("", 0, n);
    }

    private static Set<String> getValidParenCombinations(String prefix, int openParens, int remainingParens) {
        Set<String> combinations = new HashSet<>();
        if(openParens == 0 && remainingParens == 0) {
            combinations.add(prefix);
            return combinations;
        }

        if(openParens > 0) {
            combinations.addAll(
                    getValidParenCombinations(prefix + ")", openParens -1, remainingParens));
        }

        if(remainingParens > 0) {
            combinations.addAll(
                    getValidParenCombinations(prefix + "(", openParens, remainingParens-1));
        }

        return combinations;
    }
}
