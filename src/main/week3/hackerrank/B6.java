package main.week3.hackerrank;

import java.util.List;

class B6{
    public static void minimumBribes(List<Integer> q) {
        // Write your code here
        int n = q.size();
        int res = 0;
        int a[] = new int[n+1];
        a[0] = q.get(0);
        int j = 0;
        if(q.get(0) > 3){
            System.out.println("Too chaotic");
            return;
        }
        for(int i = 1; i < n; ++i){
            if(q.get(i) - i > 3){
                System.out.println("Too chaotic");
                return;
            }
            a[i]=q.get(i);
            j=i-1;
            while(j>=0 && a[j+1]<a[j]){
                int temp = a[j+1];
                a[j+1] = a[j];
                a[j] = temp;
                res++;
                j--;
            }
        }
        System.out.println(res);
    }

}
