package StringOperations;

import java.util.Locale;

public class Test {
    public static void main(String[] args) {
/*//        1.char arrays

        char name[] = {'R','a','m'};

        //char to String
        String s2 = new String(name);
        System.out.println(s2);
        System.out.println(s2.charAt(2));

        //2. using literals

        String country = "India"; // String constant pool

        // new operator

        String s3 = new String("Hello World"); //Heap Memory



        //methods
        System.out.println(country.contains("I"));
        System.out.println(country.charAt(4));
        System.out.println(country.length());

        System.out.println(country.toUpperCase());
        System.out.println(country.toLowerCase());

        System.out.println(country.indexOf("i"));
        System.out.println(country.indexOf("z"));

        System.out.println("  ".isBlank());
        System.out.println("".isEmpty());*/

       /* String txt = "      Java    ";
        System.out.println(txt + " "+txt.length());
        String txt2 = txt.trim();

        System.out.println(txt2 + " "+txt2.length());*/

//        System.out.println("Kumar".hashCode());

  /*      String s1 = "Hi",s2="Hi";
        System.out.println(s1==s2);

        String s3 = new String("Hello");
        String s4 = new String("Hello");

        System.out.println(s3==s4);

        System.out.println(s1.equals(s2));
        System.out.println("hello".equalsIgnoreCase("HELLO"));
*/
      /*  String pattern = "[a-zA-Z]+";
        System.out.println("kumar8989".matches(pattern));*/

        String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,20}$";
        String password = "Ka@123";
        System.out.println(password.matches(regex));




    }
}
