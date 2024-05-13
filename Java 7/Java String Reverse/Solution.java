/*
A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.

Given a string A, print Yes if it is a palindrome, print No otherwise.

Constraints

A will consist at most 50 lower case english letters.
Sample Input

madam

Sample Output

Yes
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        char[] AString = A.toCharArray();
        char[] invertedString = new char[A.length()];
        int lenghtOriginalString = A.length()-1;
        for(int i=0; i <A.length();i++){
            invertedString[i]=AString[lenghtOriginalString];
            lenghtOriginalString-=1;
        }
        
        String result = String.valueOf(invertedString);
        //System.out.println(String.valueOf(invertedString));
        
        
        if(A.equals(result)){
            System.out.println("Yes");
        }
        else{
             System.out.println("No");

        }
        
        
    }
}



