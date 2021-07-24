import java.util.*;
class UMTR
{
   static int n=5;
   public static void set(int[] A,int i,int j,int x)
   {
     if(i<=j)
      A[n*(i-1)-((i-2)*(i-1)/2)+j-i]=x;
   }
   public static void display(int[] A)
   {
     for(int i=1;i<=n;i++)
     {
        for(int j=1;j<=n;j++)
        {
           if(i<=j)
              System.out.print(A[n*(i-1)-((i-2)*(i-1)/2)+j-i]+"  ");
           else
              System.out.print(0+"  ");
        }
        System.out.println();
     }
  }
  public static void main(String... args)
  {
    Scanner sc=new Scanner(System.in);
     int[] A=new int[n*(n+1)/2];
     for(int i=1;i<=n;i++)
     {
       for(int j=1;j<=n;j++)
       {
          int x=sc.nextInt();
          set(A,i,j,x);
        }
    }
    display(A);
  }
}
