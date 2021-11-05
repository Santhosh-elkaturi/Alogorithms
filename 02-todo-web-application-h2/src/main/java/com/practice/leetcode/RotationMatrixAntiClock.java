package com.practice.leetcode;

public class RotationMatrixAntiClock {
	
		public static void main(String[] args) {
			
		      // Creating a 3 X 3 matrix.
		      int matrix[][] = new int[][]{ {1,2,3}, {4,5,6} , {7,8,9} };
		      int n = matrix.length;
		      System.out.println("The Original Matrix is: ");
		      for(int i=0;i<n;i++)
		      {
		          for(int j=0;j<n;j++)
		          {
		              System.out.print(matrix[i][j]+" ");
		          }
		          System.out.println();
		      }
		      
		      Transpose(matrix,n);
		      
		      System.out.println("after transpose Matrix is: ");
		      for(int i=0;i<n;i++)
		      {
		          for(int j=0;j<n;j++)
		          {
		              System.out.print(matrix[i][j]+" ");
		          }
		          System.out.println();
		      }
		      
		      rotateMatrix(matrix,n);
		      System.out.println("after rotation Matrix is: ");
		      
		      for(int i=0;i<n;i++)
		      {
		          for(int j=0;j<n;j++)
		          {
		              System.out.print(matrix[i][j]+" ");
		          }
		          System.out.println();
		      }
		  
		}

		private static void rotateMatrix(int[][] matrix, int n) {

			for (int i = 0; i < n/2; i++) {
				
				for (int j = 0; j < n; j++) {
					
					int temp = matrix[i][j];
					matrix[i][j] = matrix[n-i-1][j];
					matrix[n-i-1][j] = temp;
				}
				
			}
			
		}

		private static void Transpose(int[][] matrix, int n) {
			
			for (int i = 0; i < n; i++) {
				
				for (int j = i; j < n; j++) {
					
					int temp = matrix[i][j];
					matrix[i][j] = matrix[j][i];
					matrix[j][i] = temp;
				}
				
			}
			
		}

	}


