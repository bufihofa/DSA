package main.week3.hackerrank;

import java.util.HashMap;
import java.util.List;

public class B5 {
    public static int pairs(int k, List<Integer> arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int res = 0;
        int n = arr.size();
        for(int i = 0; i < n; ++i){
            if(map.containsKey(arr.get(i))){
                map.put(arr.get(i), map.get(arr.get(i))+1);
            }
            else map.put(arr.get(i), 1);
        }
        for(int i = 0; i < n; ++i){
            if(map.containsKey(arr.get(i)-k)){
                res+=map.get(arr.get(i)-k);
            }
        }
        return res;

    }

}
