package sets;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Setapp {
	
   public static void main(String args[])
   {
	   Set<Integer> s1= new HashSet<>(6);
	   Set<Integer> s2= new HashSet<>(6);
	   Set<Integer> s3= new HashSet<>(6);
	   
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter elements of set1");
       for(int i=0;i<6;i++)
       {
    	   int t= sc.nextInt();
    	   s1.add(t);
       }
       
       System.out.println("Enter elements of set2");
       for(int i=0;i<6;i++)
       {
    	   int t= sc.nextInt();
    	   s2.add(t);
       }
       
       for(Integer s1element : s1)
       {
           for(Integer s2element :s2)
           {
               if(s1element==s2element)
               {
            	   s3.add(s1element);
               }
           }
       }
    	 
       for(Integer s3element : s3)
       {
    	   System.out.println(s3element);
       }
   }

}
