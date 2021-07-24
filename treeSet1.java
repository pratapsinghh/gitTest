import java.util.*;
class treeSet1
{
  public static void main(String[] args)
  {
   TreeSet<Integer> t=new TreeSet<>();
      t.add(12);
      t.add(1);
      t.add(45);
      t.add(32);
      t.add(2);
      t.add(3);
      Iterator i=t.descendingIterator();
      while(i.hasNext())
      {
         System.out.println(i.next());
      }
   }
}
