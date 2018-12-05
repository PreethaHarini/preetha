import java.util.Scanner;
    class Factorial
    {  
     public static void main(String args[])
     {  
         Scanner sc=new Scanner(System.in);
         int n1=sc.nextInt();
        
        
      int i,fact=1;  
     //int number=5;   
      for(i=1;i<=n1;i++)
      {    
          fact=fact*i;    
      }    
      System.out.println("Factorial of "+n1+" is: "+fact);   
     }  
    }  
    
