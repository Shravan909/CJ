//1.A Write a program to create a class and implement a default, overloaded and copy Constructor.
public class Const
{
  int roll=10;
  Const()
  {
    System.out.println("D : Roll no : "+roll);
  }
  public Const(int x)
  {
    this.roll = x;
    System.out.println("P : Roll no : "+roll);
  }
  public Const(Const obj)
  {
    this.roll = obj.roll;
    System.out.println("C : Roll no : "+roll);
  }
  public static void main(String[] args)
  {
    Const o1 = new Const();
    Const o2 = new Const(20);
    Const o3 = new Const(o1);
    Const o4 = new Const(o2);
  }
}
