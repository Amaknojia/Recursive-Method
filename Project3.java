// Program Name: Recursive Method
// Programmer: Altaf Maknojia ID# 1585971
// Assignment Number: Project #3
// Purpose: Developing a recursive method to determine the different ways change can be given




import java.util.Scanner;

public class Project3
{
   static int q=0;
   static int di=0;
   static int ni=0;
   static int p=0;
   public static int coins(int n)
   {
       if(n == 1) return 1;//1cent=1penny
       else if(n == 2) return 5;//1nickel=5cents
       else if(n == 3) return 10;//1dime=10cents
       else if(n == 4) return 25;//1quarter=25cents
       return 0;
   }
   public static int ways(int amount, int d)
   {
       if (amount < 0) return 0;
       else if(amount==0)
       {
         
           System.out.println(q+"-quarter,"+di+"-Dime,"+ni+"-nickel,"+p+" penny");
           return 1;
       }
       else
       {
           int no_ways = 0;
           int c=coins(d);
                    
           switch(c)
           {
           case 25:
               if(amount-25>=0)
               {
                   q++;
                   no_ways += ways(amount - 25, 4);
                  q=0;
                 
               }
             
           case 10:
               if(amount-10>=0)
               {
                 
                   di++;
                   no_ways += ways(amount - 10, 3);
                   di=0;
               }
           case 5:
               if(amount-5>=0)
               {
                   ni++;
                   no_ways += ways(amount - 5, 2);
                   ni=0;
               }
           case 1:
               if(amount-1>=0)
               {                 
                   p++;
                   no_ways += ways(amount - 1, 1);
                   p=0;
               }
           }         
           return no_ways;
       }
   }
   public static void main(String args[])
   {
       Scanner input=new Scanner(System.in);
       System.out.println("Input the amount between 1 and 99:");
       int cents=input.nextInt();
       System.out.println("There are totally"+ " " + ways(cents, 4)+ " " + "ways");
     
   }
}