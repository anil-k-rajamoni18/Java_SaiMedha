package StringOperations;

public class StringBufferExample {
    public static void main(String[] args) {

        String s = new String("hello world");

        StringBuffer sb = new StringBuffer(s);

        sb.append("Java");
        sb.insert(0,"Python");
        System.out.println(sb);

        sb.replace(0,4,"Scala");
        System.out.println(sb);

        sb.delete(0,8);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);

    }
}
