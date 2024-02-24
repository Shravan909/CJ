//Write a program to create a class and implement the concepts of Method Overloading
public class Over
{
  public void A()
  {
    System.out.println("Hello world !");
  }
  void A(int a,int b)
  {
    System.out.println("Addition : "+(a+b));
  }
  void A(String s)
  {
    System.out.println("Name : "+s);
  }
  public static void main(String[] args)
  {
    Over obj = new Over();
    obj.A();
    obj.A(20,10);
    obj.A("Sumit");
  }
}
