package AllinterviewPractice;
public class swapnumbers {
    public static void main(String[] args) {
        int a=10;
        int b=8;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a);
        System.out.println(b);
        String x="hell";
        String y="world";
        x=x+y;
        y=x.substring(0,x.length()-y.length());
        x=x.substring(y.length());
        System.out.println(x);
        System.out.println(y);
        System.out.println(x.replace(x,y));
        System.out.println(y.replace(y,x));

    }
}
