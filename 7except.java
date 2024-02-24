public class Excep
{
  public static void main(String[] args)
  {
    try
      {
        int a[] = {1,2,3,4};
        System.out.println("Array value : "+a[5]);
      }
    catch(ArrayIndexOutOfBoundsException e)
      {
        System.out.println("Error : "+e);
      }
    catch(ArithmeticException e)
      {
        System.out.println("Error : "+e);
      }
    finally
      {
        System.out.println("Program Completed");
      }
  }
}
