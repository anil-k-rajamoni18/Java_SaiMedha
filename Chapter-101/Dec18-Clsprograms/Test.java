class A{

  public static void main(String[] args) {
    Test t = new Test();
    t.main(args);
  }
}
class B{}
interface Bus{}

public class Test{
  final public  synchronized   void main(String[] args) {
    System.out.println("Saimedha hello world");
  }

}