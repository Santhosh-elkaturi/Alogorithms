package com.practice.algorithms;

public class PrintPermutations {


	static void printPermutn(String str, String ans)
    {
  
        // If string is empty
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }
  
        
        for (int i = 0; i < str.length(); i++) {
  
            char ch = str.charAt(i);  // abc
            
            String ros = str.substring(0, i) + str.substring(i + 1);
                         
            printPermutn(ros, ans + ch);
        }
    }
  
    // Driver code
    public static void main(String[] args)
    {
        String s = "abc";
        printPermutn(s, "");
        //char[] charArray = s.toCharArray();
        //printPermutations2(charArray,0,s.length()-1);
    }
}


