import java.util.*;
public class Factors
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner (System.in);
    int i;
    int num = sc.nextInt();
    if(num==0)
     {
      System.out.println("No Factors");
     }
    else if(num>0)
     {
      for(i=1;i< num;i++)
       {
         if(num%i==0)
          {
           System.out.print(i+", ");
          }
        }
        System.out.println(num);
    }
    else
    {
     num=num*-1;
     for(i=1;i< num;i++)
     {
      if(num%i==0)
       {
         System.out.print(i+", ");
       }
      }
    System.out.println(num);
    }

}
}