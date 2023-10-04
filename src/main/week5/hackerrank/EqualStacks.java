package main.week5.hackerrank;

import java.util.List;

public class EqualStacks {
    /*
     * Complete the 'equalStacks' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY h1
     *  2. INTEGER_ARRAY h2
     *  3. INTEGER_ARRAY h3
     */

    public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
        // Write your code here
        int s1=0; int s2=0; int s3=0;
        for(int i: h1){
            s1+=i;
        }
        for(int i: h2){
            s2+=i;
        }
        for(int i: h3){
            s3+=i;
        }
        int u1=0;
        int u2=0;
        int u3=0;
        while (s1!=s2 || s1!=s3 || s2!=s3) {
            if(s1 > s2 || s1 > s3){
                s1 -= h1.get(u1);
                u1++;
            }
            else if(s2 > s1 || s2 > s3){
                s2 -= h2.get(u2);
                u2++;
            }
            else if(s3 > s2 || s3 > s1){
                s3 -= h3.get(u3);
                u3++;
            }
        }
        return s1;
    }
}
