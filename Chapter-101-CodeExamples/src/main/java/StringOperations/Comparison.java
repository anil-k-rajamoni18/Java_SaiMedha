package StringOperations;

public class Comparison {
    public static void main(String[] args) {

        //literals
        double start = System.currentTimeMillis();
        for(int i=0;i<1000000;i++){
            String s1 = "hello";
        }
        double end = System.currentTimeMillis();

        System.out.println(end-start);

        //new operator
        double start1 = System.currentTimeMillis();
        for(int i=0;i<1000000;i++){
            StringBuffer s1 = new StringBuffer("hello");
        }
        double end1 = System.currentTimeMillis();

        System.out.println(end1-start1);


    }
}
