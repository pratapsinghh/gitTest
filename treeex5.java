import java.util.*;
class treeex5
{
  public static void main(String[] args)
  {
     TreeSet<String> ts=new TreeSet<String>(new mycomparator());
     ts.add("Hello");
     ts.add("Sun");
     ts.add("Ram");
     ts.add("Mohan");
     ts.add("Shyam");
     ts.add("Shohan");
     System.out.println(ts);
   }
}
class mycomparator implements Comparator<String>
{
   public int compare(String obj,String obj1)
   {
     String s=obj.toString();
     String x=obj1.toString();
      return x.compareTo(s);
    }
}
