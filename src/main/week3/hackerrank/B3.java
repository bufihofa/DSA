package main.week3.hackerrank;

import java.util.List;

public class B3 {
    public static String balancedSums(List<Integer> arr) {
        int n = arr.size();
        int a[] = new int[n+1];
        for(int i = 0; i < n; ++i){
            a[i+1] = a[i] + arr.get(i);
        }
        for(int i = 0; i < n; ++i){
            if((a[i]-a[0]) == (a[n]-a[i+1])) return "YES";
        }
        return "NO";

    }
}
