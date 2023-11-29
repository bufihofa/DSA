package main.week5.hackerrank;

import java.io.*;
import java.util.*;

public class SimpleTextEditor {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        String text = "";
        Stack<String> st = new Stack<>();
        for (int i = 0; i < q; ++i) {
            int request = sc.nextInt();
            switch (request) {
                case 1:
                {
                    st.push(text);
                    String append = sc.next();
                    text += append;
                    break;
                }
                case 2:
                {
                    st.push(text);
                    int k = sc.nextInt();
                    if (k >= text.length()) text = "";
                    else {
                        int leng = text.length();
                        String newText = text.substring(0, leng - k);
                        text = newText;
                    }
                    break;
                }
                case 3:
                {
                    int k = sc.nextInt();
                    System.out.println(text.charAt(k - 1));
                    break;
                }
                case 4:
                {
                    if (!st.isEmpty()) {
                        String oldText = st.pop();
                        text = oldText;
                    }
                    break;
                }
            }
        }
    }
}