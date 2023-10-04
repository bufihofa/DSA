package main.week5.exercise;

public class SelectionSort {
    public static void main(String[] args) {
        int[] a = {6,4,-5,-3,5,7,1,9,-5,-2};
        int n = a.length;
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
        for(int i = 0; i < n; ++i){
            System.out.print(a[i] + " ");
        }
    }


}
