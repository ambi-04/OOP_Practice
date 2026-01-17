import java.util.*;
class Apple
{
  private float weight;
  protected String imported_from;
  public String color;
  int batch_no;
  public static void main(String[] args)
  {
    System.out.println("Hello...we are inside apple class.");
    Apple a1 = new Apple();
    a1.weight = 100.7f;
    a1.imported_from = "USA";
    a1.color = "green";
    a1.batch_no = 198;
    System.out.println("Apple object created.Properties of this apple\n: color : "+a1.color + "\n imported_from :" + a1.imported_from + "\nweight:" + a1.weight + "\n batch_no:" + a1.batch_no);
  }
  
}
