package com.in28minutes.springboot.web;

import java.util.Scanner;

public class TransposeMatrix {
	
		public static void main(String[] args) {
		    Scanner sc  = new Scanner(System.in);
		        int n = sc.nextInt();
		        int m = sc.nextInt();
		        int arr[][] = new int[n][m];
		        int trans[][] = new int[n][m];
		        for(int i = 0 ; i<n;i++){
		            for(int j = 0; j<m;j++){
		                arr[i][j] = sc.nextInt();
		                
		            }
		        }
		        
		        for(int i = 0 ; i<n;i++){
		            for(int j = 0; j<m;j++){
		              
		                trans[i][j]= arr[j][i];
		            }
		        }
		        
		          for(int i = 0 ; i<n;i++){
		            for(int j = 0; j<m;j++){
		              System.out.print(trans[i][j]+" ");  
		            }
		              System.out.println("");
		        }
		    }
		
}
