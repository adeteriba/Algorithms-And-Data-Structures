//Find the xth biggest numbe

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int[] a = new int[in.nextInt()];
       
            for(int i = 0; i < a.length; i++) {
                a[i] = in.nextInt();
            }
            a = insertion(a);
        System.out.println(a[a.length-in.nextInt()]);
      
    }
    
    public static int[] insertion(int[] a) {
        for(int i = 0; i < a.length; i++) {
            for(int j = i+1; j < a.length; j++) {
                if(a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp; 
                }
            }
        }
        return a;
    }
    
}
