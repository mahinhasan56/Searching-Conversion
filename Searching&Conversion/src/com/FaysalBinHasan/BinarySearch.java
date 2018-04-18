package com.FaysalBinHasan;
import java.util.*;

public class BinarySearch {
	 public static void main(String []args)
	  {
	    int []binaryarray={20,49,51,56,64,67,74,86,93,96,145};
	    Scanner k=new Scanner (System.in);
	    System.out.println("Enter a number");
	    int Mykey=k.nextInt();
	    System.out.println(binarySearch(binaryarray,Mykey,0,binaryarray.length-1));
	  }
	  public static int binarySearch (int []array,int key,int min,int max){
	    if(min>max){
	      System.out.println("The value is not found");
	      return-1;
	    }
	    int midIndex=(min+max)/2;
	    if(array[midIndex]==key){
	      return midIndex;
	    }
	    else if(array[midIndex]>key){
	      max=max-1;
	    }else{
	      min=min+1;
	    }
	    return binarySearch(array,key, min,max);
	  }
}
