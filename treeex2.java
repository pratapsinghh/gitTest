import java.util.*;
class treeex2
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
   public int compare(Integer i1,Integer i2)
   {
     return -(i1.compareTo(i2));
    }
}
