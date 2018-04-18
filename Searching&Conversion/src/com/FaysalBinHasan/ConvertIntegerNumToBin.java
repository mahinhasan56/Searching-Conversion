package com.FaysalBinHasan;
import java.util.*;

public class ConvertIntegerNumToBin {
	public static void main(String []args)
	  {
	    Scanner k=new Scanner (System.in);
	    System.out.println("Enter a number");
	    int searchkey=k.nextInt();
	    System.out.println(binary(searchkey));
	  }
	  public static String binary(int num)
	  {
	    if(num<0){
	      num=Math.abs(num);
	    }
	    int i=num/2;{
	      int r=num%2;
	      if(i==0)
	      {
	        return " "+r;
	      }
	      String s1=binary(i);
	      String s=s1+r;
	      return s;
	    }
	  }
}
