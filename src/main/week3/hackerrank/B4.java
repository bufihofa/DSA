package main.week3.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class B4 {
    public static List<Integer> closestNumbers(List<Integer> arr) {
        // Write your code here
        Collections.sort(arr);
        ArrayList<Integer> a = new ArrayList<Integer>();
        int n = arr.size();
        int min = arr.get(1) - arr.get(0);
        for(int i = 0;i < n-1; ++i){
            if(arr.get(i+1) - arr.get(i) < min){
                min = arr.get(i+1) - arr.get(i);
            }
        }
        for(int i = 0 ;i < n-1; ++i){
            if(arr.get(i+1) - arr.get(i) == min){
                a.add(arr.get(i));
                a.add(arr.get(i+1));
            }
        }
        return a;
    }
}
