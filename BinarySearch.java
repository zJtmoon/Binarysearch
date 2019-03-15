package org;

import java.util.Collections;

/**
 * Created by zjt on 18-3-8.
 */
public class BinarySearch {
    public int search(int[] arr,int k){
        int a=0;
        int b=arr.length-1;
        while(a<=b){
            int m=(a+b)/2;
            if(k<arr[m]){
                b=m-1;
            }else if(k>arr[m]){
                a=m+1;
            }else
                return m;

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr;
        arr= new int[]{1, 3, 5, 6, 7};
        BinarySearch b=new BinarySearch();
       int c= b.search(arr,4);
        System.out.println(c);
    }
}
