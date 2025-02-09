package LeetCodeProblem;

public class LeetEasy1 {
    public static void main(String[] args) {
        String s1 = "bank";
        String s2 = "kanb";
        System.out.println(areAlmostEqual(s1, s2));
    }

    static boolean areAlmostEqual(String s1, String s2) {
        int i = -1, j = -1;
        int cnt = 0;

        for (int k = 0; k < s1.length(); k++) {
            if (s1.charAt(k) != s2.charAt(k)) {
                cnt++;
                if (i == -1) i = k;
                else if (j == -1) j = k;
            }
        }

        if (cnt == 0) return true;
        else if (cnt == 2 && s1.charAt(i) == s2.charAt(j) && s1.charAt(j) == s2.charAt(i)) {
            return true;
        }


        return false;
    }
}
//            if (s1.equals(s2)) return true;
//
//            int first = -1, second = -1;
//            for (int i = 0; i < s1.length(); i++) {
//                if (s1.charAt(i) != s2.charAt(i)) {
//                    if (first == -1) first = i;
//                    else if (second == -1) second = i;
//                    else return false; // More than 2 differences
//                }
//            }
//
//            return second != -1 &&
//                    s1.charAt(first) == s2.charAt(second) &&
//                    s1.charAt(second) == s2.charAt(first);
//        }





