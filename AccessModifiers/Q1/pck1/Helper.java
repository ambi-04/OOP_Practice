package pck1;
public class Helper
{
  private int x;
  public void func()
  {
    System.out.println("Hello. I am a public method inside Helper class");
  }
  public static void main(String[] args)
  {
    Helper obj1 = new Helper();
    obj1.x = 10;
    obj1.func();
    System.out.println("obj1 inside same Helper class. value of x : " + obj1.x);
  }
  
}

