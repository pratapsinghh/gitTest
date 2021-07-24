import java.util.*;
class treeex7
{
   public static void main(String[] args)
   {
      TreeSet l=new TreeSet(new mycomprator());
      l.add(new StringBuffer("Shyam"));
      l.add(new StringBuffer("Ram"));
      l.add(new StringBuffer("Shohan"));
      l.add(new StringBuffer("Sun"));
      l.add(new StringBuffer("System"));
      System.out.println(l);
    }
}
class mycomprator implements Comparator
{
   public int compare(Object obj,Object obj1)
   {
     String s1=obj.toString();
     String s2=obj1.toString();
     return s2.compareTo(s1);
   }
}
