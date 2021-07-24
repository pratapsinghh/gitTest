import java.util.*;
class Employee implements Comparable
{
   int id;
   String name;
   int marks;
   Employee(int id , String name,int marks)
   {
      this.id=id;
      this.name=name;
      this.marks=marks;
   }
   public String toString()
   {
      return id+" "+name+" "+marks;
   }
   public int compareTo(Object obj)
   {
      String name=this.name;
      Employee e=(Employee)obj;
      String name1=(String)e.name;
           return name.compareTo(name1);
    }
}
class treeex8
{
   public static void main(String[] args)
   {
      Employee e2=new Employee(2,"Mohan",45);
      Employee e5=new Employee(5,"Pawan",75);
      Employee e6=new Employee(6,"Ramu",50);
      Employee e1=new Employee(1,"Ram",35);
      Employee e7=new Employee(7,"Shyamu",90);
      Employee e8=new Employee(8,"Sita",80);
      Employee e3=new Employee(3,"Shyam",55);
      Employee e4=new Employee(4,"Harsh",65);
      Employee e9=new Employee(9,"Sona",52);
      TreeSet t=new TreeSet();
      t.add(e1);
      t.add(e2);
      t.add(e3);
      t.add(e4);
      t.add(e5);
      t.add(e6);
      t.add(e7);
      t.add(e8);
      t.add(e9);
      System.out.println(t);
   }
}
