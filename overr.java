class Base
{
  void type()
  {
    System.out.println("Type of Class : ");
  }
  void info()
  {
    System.out.println("Base Class");
  }
}
class Overri extends Base
{
  void info()
  {
    System.out.println("Main Class");
  }
  public static void main(String[] args)
  {
    Overri obj1 = new Overri();
    obj1.type();
    obj1.info();
    Base obj2 = new Base();
    obj2.info();
  }
}
