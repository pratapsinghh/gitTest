import java.util.*;
class union
{
   public static void main(String[] args)
   {
      Set<Integer> h1=new HashSet<>();
     h1.add(21);
     h1.add(1);
     h1.add(4);
     h1.add(15);
     h1.add(12);
    Set<Integer> h=new HashSet<>();
     h.add(22);
     h.add(1);
     h.add(4);
     h.add(25);
     h.add(12);
     Set<Integer> U=new HashSet<>(h1);
     U.addAll(h);
     System.out.println(U);
     
     Set<Integer> I=new HashSet<>(h1);
     I.retainAll(h);
     System.out.println(I);
     
     Set<Integer> D=new HashSet<>(h1);
     D.removeAll(h);
     System.out.println(D);
   }
}
