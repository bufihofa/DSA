package main.week3.exercise;

import edu.princeton.cs.algs4.In;

import java.util.HashMap;

public class ThreeSum {
    public static void main(String[] args) {
        //In in = new In("E:\\dsa\\algs4-data\\1Kints.txt");
        //int[] arr = in.readAllInts();
        int[] arr = {-8, -4,-2, -2, 0, 1, 2, 3, 4, 8};
        //int[] arr = {-5, -2, -1, 0, 1, 2, 3, 6 ,7};
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < arr.length - 1; ++i) {
            for (int j = i + 1; j < arr.length; ++j) {
                int temp = (arr[i] + arr[j])*-1;
                if (map.containsKey(temp)) {
                    System.out.println(i+" "+j+"|"+arr[i] + " " + arr[j] + " " + temp);
                }
            }
            map.put(arr[i], 1);
            System.out.println(arr[i]);
        }


    }
}
