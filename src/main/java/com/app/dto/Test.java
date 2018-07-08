package com.app.dto;

import java.util.Scanner;

public class Test {

	 public static boolean myVar = initializeClassVariable();
     static Scanner sc = new Scanner(System.in); 
  private static int B;
private static int H;
  private static boolean flag=initializeClassVariable();
  private static boolean initializeClassVariable() {
      
      B= sc.nextInt();
      H= sc.nextInt();
      if(B>0&&H>0){
          return true;
         
      }else{
         System.out.println("java.lang.Exception: Breadth and height must be positive");
      }
      return false;
      
  }
	public static void main(String []aa){
		
	}
}
