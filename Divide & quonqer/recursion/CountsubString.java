package recursion;

public class CountsubString {
    // public static int countsubstrings(String any,int i,new String()){
    // if(i >= 0){
    // return;
    // }
    // countsubstring(any,i-1,new String(any.substring(i-1)))
    // }

    // public static void main(String[] args) {
    // String alpabets = "abcab";
    // int i = alphabets.length();
    // System.out.println(countsubstring(alphabets, i, new String()));
    // }

    // Java program to count substrings
    // with same first and last characters

    // Function to count substrings
    // with same first and
    // last characters
    static int countSubstrs(String str, int i,
            int j, int n) {
        // base cases
        if (n == 1)
            return 1;
        if (n <= 0)
            return 0;

        int res = countSubstrs(str, i + 1, j, n - 1) +
                countSubstrs(str, i, j - 1, n - 1) -
                countSubstrs(str, i + 1, j - 1, n - 2);

        if (str.charAt(i) == str.charAt(j))
            res++;

        return res;
    }

    // Driver code
    public static void main(String[] args) {
        String str = "abcab";
        int n = str.length();
        System.out.print(countSubstrs(str, 0, n - 1, n));
    }
}

// This code is contributed by Anant Agarwal.
