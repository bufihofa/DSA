package main.week5.exercise;

import java.util.Random;

public class SelectionSort {
    public static void main(String[] args) {
        Random r = new Random();
        int m = 200000;
        int[] a = new int[m];
        int n = a.length;

        for(int i = 0; i < n; ++i){
            a[i] = r.nextInt(200000);
        }
        long start = System.currentTimeMillis();
        int t = 0;
        int temp;
        for(int i = 0; i < n-1; ++i){
            for(int j = i; j < n; ++j){
                if(a[t] > a[j]) {
                    t = j;
                }
            }
            temp = a[t];
            a[t] = a[i];
            a[i] = temp;
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
        /*
        for(int i = 0; i < n; ++i){
            System.out.print(a[i] + " ");
        }
         */
    }


}
