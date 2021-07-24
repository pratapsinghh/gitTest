import java.util.*;
class treeex1
{
   public static void main(String[] args)
   {
       TreeSet<String> t=new TreeSet<String>(new custcomparator());
       t.add("hello");
       t.add("apple");
       t.add("banana");
       t.add("mango");
       t.add("orange");
       System.out.println(t);
    }
}
class custcomparator implements Comparator<String>
{
    public int compare(String s,String x)
    {
       int value=s.compareTo(x);
       if(value>0)
           return -1;
       else
       {
          if(value<0)
          return 1;
          else
            return 0;
       }
    }
}
