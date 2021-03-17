package com.visa.practice;

public class HCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HCF obj = new HCF();
		obj.methodgcf(27,12);

	}

   	
	public void methodgcf(int n1,int n2) {
   	while (n2 > 0)
   	{
   	     int temp = n2;
   	     System.out.println("temp "+temp);
   	     n2 = n1% n2; 
   	  System.out.println("n2 "+n2);
   	     n1 = temp;
   	  System.out.println("n1 "+n1);
   	}
	System.out.println("hcf "+n1);
	}
}



