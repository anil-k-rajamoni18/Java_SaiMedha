public class TestJava {
 static int movie_c = 0; // static 
 int user_count = 0;  // instance 
 TestJava(){ // constructor
  movie_c = movie_c + 1;
  this.user_count +=1;
 }
  public static void main(String[] args) {
    
    TestJava o = new TestJava(); // object creation...
  

    TestJava o1 = new TestJava();
    TestJava o2 = new TestJava();

    TestJava o3 = new TestJava();
    TestJava o4 = new TestJava();
    TestJava o5 = new TestJava();


    System.out.println(TestJava.movie_c);
    System.out.println(o2.user_count);

  }
}
