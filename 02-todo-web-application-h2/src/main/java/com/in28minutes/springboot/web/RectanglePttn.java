package com.in28minutes.springboot.web;

public class RectanglePttn {

	public static void main(String[] args) {
		int n= 7;
        int k = n;
        for(int i = 1;i<=n;i++){
        	int t = n-k;
            for(int j = n;j>=1 ;j--){
                
                if(j == t+1){
                    System.out.print("*");
                }else{
                System.out.print(j);    
                }
            
            }
            k--;  
            System.out.println("");
        }
	
	}
}

