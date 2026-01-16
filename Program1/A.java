//program to understand how equals() and hashCode() works in java
import java.util.*;
class A
{
  int x;
  public static void main(String[] args)
  {
    A obj1 = new A();
    obj1.x = 10;
    A obj2 = new A();
    obj2.x = 10;
    System.out.println(obj1.hashCode());
    System.out.println(obj2.hashCode());
    System.out.println(obj1.equals(obj2));
    
    A obj3 = obj2;
    System.out.println(obj2.hashCode());
    System.out.println(obj3.hashCode());
    System.out.println(obj2.equals(obj3));
    
  }
  
}
/* Output
1973538135
1365202186
false
1365202186
1365202186
true
*/
