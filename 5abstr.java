abstract class Shape
{
  abstract void draw();
}
class Circle  extends Shape
{
  void draw()
  {
    System.out.println("Drawing Circle");
  }
}
class Rectangle  extends Shape
{
  void draw()
  {
    System.out.println("Drawing Rectangle");
  }
}
class Abstr
{
  public static void main(String[] args)
  {
    Circle obj1 = new Circle();
    Rectangle obj2 = new Rectangle();
    obj1.draw();
    obj2.draw();
  }
}
