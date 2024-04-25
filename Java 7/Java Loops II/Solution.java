/*
You are given  queries in the form of a, b, and n. For each query, print the series corresponding to the given a, b, and  values as a single line of n space-separated integers.
*/
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            String finalAnswer = "";
            int previousResult = 0; 
            for(int j=0; j<n; j++){
                int result =  (b*((int)Math.round(Math.pow(2,j))))+a+previousResult;
                finalAnswer += String.valueOf(result)+" ";
                previousResult += (b*((int)Math.round(Math.pow(2,j))));
                 
            }
            System.out.println(finalAnswer);
            
        }
        in.close();
    }
}
