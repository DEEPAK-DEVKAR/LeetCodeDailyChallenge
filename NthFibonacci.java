package LeetCode.Bootcamp;

import java.util.HashMap;

public class NthFibonacci {

    public static void main(String[] args) {
        System.out.println(fib(6));
    }

    public static int fib(int n) {
        return findFibo(n, new HashMap<Integer,Integer>());
    }

    private static int findFibo(int number, HashMap<Integer,Integer> memo)
    {
        if(number == 0)
            return 0;

        if(number == 1)
            return 1;

        int currentKey = number;
        if(memo.containsKey(currentKey))
            return memo.get(currentKey);

        memo.put(currentKey,(findFibo(number-1,memo) + findFibo(number-2,memo)));
        return (findFibo(number-1,memo) + findFibo(number-2,memo));
    }
}

//without dp
//t.c = o(2^n)
//s.c = o(n)

//after dp
//t.c = o(n)
//s.c = o(n)

