package StringOperations;

public class StringBuilderExample {
    public static void main(String[] args) {
//        StringBuilder sb = new StringBuilder("Hello");
//        System.out.println(Long.MAX_VALUE);



        int start = (int) System.currentTimeMillis();
        for(int i=0;i<1000000;i++){
            StringBuffer sb = new StringBuffer("Hello world");
        }

        int end = (int) System.currentTimeMillis();

        System.out.println(end-start);

    }
}
