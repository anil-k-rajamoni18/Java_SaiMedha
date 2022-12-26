public class CommandLineArguments{
  public static int main(String[] args) {
    
    int n1 = Integer.parseInt(args[0]); // string --> int
    int n2 = Integer.parseInt(args[1]);
    float n3 = Float.parseFloat(args[3]); //string -- float
    System.out.println(n1+n2+n3);
    return 0;


  }
}