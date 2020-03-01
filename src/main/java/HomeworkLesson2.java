public class HomeworkLesson2 {
    public static void main(String[]args){
        System.out.println("Alisa");
        int a = 5;
        double d = 5.5;
        long l = 4444l;
        float f = 7.7f;
        short s = 3;
        byte b = 4;
        char c = 'X';
        c = 12;

        boolean h = a > d;
        System.out.println("Result of true or false: "+h);

        int p = s*b*a;
        System.out.println("Result of multiplying: "+p);

        int w = c/b;
        System.out.println("Result of division: "+w);

        int j = a+s;
        System.out.println("Result of adding: "+j);

        int k = (int) (l-f);
        System.out.println("Result of subtraction: "+k);

        System.out.println("p mod 8 = "+ p % 8);
        System.out.println("d mod 33 = "+ d % 33);

        int y = 71;
        int r = 93;
        ++y;
        --r;
        System.out.println("Incremental result: "+y);
        System.out.println("Decremental result: "+r);


    }
}
