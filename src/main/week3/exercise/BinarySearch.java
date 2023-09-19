package main.week3.exercise;

public class BinarySearch {
    public static int binarySearch(int[] a, int number){
        int l = 0;;
        int r = a.length-1;
        int mid = (l+r)/2;
        while(l<=r){
            mid = (l+r)/2;
            if(a[mid] == number){
                return mid;
            }
            if(a[mid]>number){
                r = mid-1;
            }
            else l = mid+1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int a[] = {1,2,3,5,6,7,8,9,10};
        System.out.println(binarySearch(a,4));
    }
}
