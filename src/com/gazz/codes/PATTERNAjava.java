package com.gazz.codes;

import java.util.Scanner;

public class PATTERNAjava {

	public static void main(String[] args) {
		{
			Scanner sc =new Scanner(System.in);
			System.out.println("enter the count of class:");
			int cls=sc.nextInt();
			System.out.println("enter the count of student: ");
			int stu=sc.nextInt();
			int arr[][]=new int[cls][stu];
			for(int i=0;i<cls;i++) {
				System.out.println("inside class:"+(i));
			for(int j=0;j<stu;j++) {
				System.out.println("enter marks of student no:"+(j+1));
				arr[i][j] =sc.nextInt();			}
			
			}
			for(int i=0;i<cls;i++) {
				System.out.println("inside class:"+(i+1));
				for(int j=0;j<stu;j++) {
					System.out.println("the marks of student no "+(j+1)+"is:"+arr[i][j]);
				}
			}
			
			
		}

	}

}
