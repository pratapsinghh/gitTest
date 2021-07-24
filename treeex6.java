//compare to string by length
import java.util.*;
class treeex6
{
  public static void main(String[] args)
  {
     TreeSet<String> t=new TreeSet<String>(new mycomparator());
     t.add("XtreamXXX");
     t.add("Zamato_");
     t.add("Tamato_x");
     t.add("Patato");
     t.add("Orginazation");
     t.add("Management");
     System.out.println(t);
   }
}
class mycomparator implements Comparator
{
   public int compare(Object s,Object x)
   {
      String s1=s.toString();
      String s2=x.toString();
      int a=s1.length();
      int b=s2.length();
      if(a<b)
         return 1;
      else
         if(a>b)
           return -1;
         else
            return s1.compareTo(s2);
   }
}
