
package Hello;

/**
 *
 * @author Abdel Majid nadar
 */
import java.time.LocalTime;
import greeter.Greeter;

public class HelloWorld {
  public static void main(String[] args) {
       
    LocalTime  currentTime = LocalTime.now();
    System.out.println("The current local time is: " + currentTime);

    Greeter greeter = new Greeter("Abdel Majid");
    System.out.println(greeter.sayHello());
  }
}
