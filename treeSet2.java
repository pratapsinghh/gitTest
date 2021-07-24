import java.util.*;
class treeSet2
{
   public static void main(String[] args)
   {
     TreeSet<Integer> set=new TreeSet<>();
     set.add(11);
     set.add(3);
     set.add(12);
     set.add(23);
     set.add(43);
     set.add(10);
     System.out.println(set.pollFirst());
     System.out.println(set.pollLast());
   }
}
