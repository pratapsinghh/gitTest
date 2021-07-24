import java.util.*;
class treeSet3
{
   public static void main(String[] args)
   {
      TreeSet<Integer> set=new TreeSet<>();
      set.add(11);
      set.add(2);
      set.add(13);
      set.add(14);
      set.add(12);
      set.add(15);
      set.add(24);
      System.out.println(set);
      
      System.out.println(set.descendingSet());
      
      System.out.println(set.headSet(2,true));
      System.out.println(set.subSet(2,false,24,true));
      System.out.println(set.tailSet(11,true));
    }
}
