import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      // input - don't change this code
      Scanner scn = new Scanner(System.in);
      int marks = scn.nextInt();
      // input - don't change this code
      
      // code here
      if(marks>90)
      System.out.print("excellent");
      else if(marks>80)
      System.out.print("good");
      else if(marks>70)
      System.out.print("fair");
      else if(marks>60)
      System.out.print("meets expectations");
      else 
      System.out.print("below par");//thiss is old school grading system
      
  
   }
  }
