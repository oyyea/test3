package test3;

import java.util.Scanner;

public class U8_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the size for the matrix: ");
		int n;
		n=sc.nextInt();
		
		int [][]a=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				a[i][j]=(int)(Math.random()*2);
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(a[i][j]);
			}
			System.out.printf("\n");
		}
		
		int f=0;
		for(int i=1;i<=n;i++) {
			int s0=0,s1=0;
			for(int j=0;j<n;j++) {
				if(a[i-1][j]==0) s0++;
				else s1++;
			}
			if(s0==n) {
				System.out.println("All 0s on row " + i);
				f=1;
			}
			else if(s1==n) {
				System.out.println("All 1s on row " + i);
				f=1;
			}
		}
		if(f==0) System.out.println("No same numbers on a row");
		
		f=0;
		for(int i=1;i<=n;i++) {
			int s0=0,s1=0;
			for(int j=0;j<n;j++) {
				if(a[j][i-1]==0) s0++;
				else s1++;
			}
			if(s0==n) {
				System.out.println("All 0s on column " + i);
				f=1;
			}
			else if(s1==n) {
				System.out.println("All 1s on column " + i);
				f=1;
			}
		}
		if(f==0) System.out.println("No same numbers on a column");
		
		int s0=0,s1=0;
		for(int i=0;i<n;i++) {
			if(a[i][i]==0) s0++;
			else s1++;
		}
		if(s0==n) System.out.println("All 0s on the major diagonal");
		else if(s1==n) System.out.println("All 1s on the major diagonal");
		else System.out.println("No same numbers on the major diagonal");
		
		s0=0;
		s1=0;
		for(int i=0;i<n;i++) {
			if(a[i][n-i-1]==0) s0++;
			else s1++;
		}
		if(s0==n) System.out.println("All 0s on the sub-diagonal");
		else if(s1==n) System.out.println("All 1s on the sub-diagonal");
		else System.out.println("No same numbers on the sub-diagonal");
	}

}
