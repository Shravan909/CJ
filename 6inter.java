interface I1
{
  void show1();
}
interface I2
{
  void show2();
}
public class Inter  implements I1,I2
{
  
  public void show1()
  {
    System.out.println("1st show function");
  }
  public void show2()
  {
    System.out.println("2nd show function");
  }
  
  public static void main(String[] args)
  {
    Inter obj1 = new Inter();
    obj1.show1();
    obj1.show2();
  }
}
