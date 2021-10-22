package test3;

import java.util.Scanner;

public class U8_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter matrix1: ");
		double [][]a=new double[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				a[i][j]=sc.nextDouble();
			}
		}
		
		System.out.print("Enter matrix2: ");
		double [][]b=new double[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				b[i][j]=sc.nextDouble();
			}
		}
		
		double [][]c=new double[3][3];
		c=multplyMatrix(a,b);
		
		System.out.println("The multiplication of the matrices is");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.printf(" %.1f", a[i][j]);
			}
			if(i==1) System.out.print("  * ");
			else System.out.print("    ");
			for(int j=0;j<3;j++) {
				System.out.printf(" %.1f", b[i][j]);
			}
			if(i==1) System.out.print("  = ");
			else System.out.print("    ");
			for(int j=0;j<3;j++) {
				System.out.printf(" %.1f", c[i][j]);
			}
			System.out.printf("\n");
		}
	}
	
	public static double[][]
			multplyMatrix(double[][] a,double [][] b){
		double [][]c=new double[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				c[i][j]=0;
				for(int k=0;k<3;k++) {
					c[i][j]+=a[i][k]*b[k][j];
				}
			}
		}
		return c;
	}

}
