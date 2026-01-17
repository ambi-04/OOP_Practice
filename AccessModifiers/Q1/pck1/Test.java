package pck1;
public class Test
{
  public static void main (String[] args) throws Exception
  {
    Helper obj2 = new Helper();
    try
    {
      System.out.println("obj2(object of helper class) created  another class Test.");
      obj2.x = 11;
    }
    catch(Exception e)
    {
      System.out.println(e);
    }
    obj2.func();
  }
}
