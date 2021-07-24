import java.util.*;
class treeex4
{
   public static void main(String[] args)
   {
      TreeSet<Integer> t=new TreeSet<Integer>(new mycomparator());
      t.add(11);
      t.add(21);
      t.add(1);
      t.add(3);
      t.add(2);
      t.add(20);
      t.add(16);
      System.out.println(t);
    }
}
class mycomparator implements Comparator<Integer>
{
   public int compare(Integer I1 , Integer I2)
   {
      if(I1<I2)
         return 1;
      else
         if(I1>I2)
           return -1;
         else
            return 0;
   }
}
         
