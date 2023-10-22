import java.util.*;

public class Solution {
    public static List<Long> fact(long n, List<Long> l, long i) {
        if (l.size() < 1) {
            l.add(i);
            return fact(n, l, i + 1);
        }
        if (l.get(l.size() - 1) * (i) <= n) {
            l.add(l.get(l.size() - 1) * (i));
            return fact(n, l, i + 1);
        }
        return l;
    }

    public static List<Long> factorialNumbers(long n) {
        // Write Your Code Here
        List<Long> l = new ArrayList<>();
        long f = 1;
        return fact(n, l, 1);
    }
}
