class Userdefine extends Exception 
{
  public Userdefine(String s)
  {
    super(s);
    //OR
    System.out.println(s);
  }
}
class UerExce
{
  public static void main(String[] args)
  {
    try
      {
        int a = 10;
        if(a<30)
        {
          throw new Userdefine("a is less than 30");
        }
      }
    catch(Userdefine e)
      {
        System.out.println("Error : "+e);
      }
    finally
      {
        System.out.println("Program Completed");
      }
  }
}
