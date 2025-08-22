package recursion;

public class KthSymbolOfGrammar {


    public static int kthSymbolOfGrammar(int n, int k) {
        // this problem is not related to decision + choices
        if (n == 1 && k == 1)
            return 0;

        /**
         *
         * 0
         * 0 1
         * 0 1 1 0
         * 0 1 1 0 1 0 0 1
         * observations :
         * 1. every row has 2^n-1 elements
         * 2. first half of each row is similar to n-1 row
         * 3. every element of 2nd half is complement of n-1th row
         *
         * hypothesis
         * if(k<=mid)
         *  solve(n,k) = solve(n-1,k)
         * else
         *  solve(n,k) = !solve(n-1,k-mid)
         *
         *
         *
         */
        int len = 1 << (n - 1);
        int mid = len / 2;
        if (k <= mid)
            return kthSymbolOfGrammar(n - 1, k);
        else
            return Math.abs(kthSymbolOfGrammar(n - 1, k - mid) - 1);
    }
}
