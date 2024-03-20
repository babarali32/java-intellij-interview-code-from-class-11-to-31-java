package class20;
public class varargs {
  // this is var args varible lentht arguments
    public void print(String ... array){
        int add=0;
        for (String word:array
             ) {
            System.out.println(word);
        }
    }
    public String print(String a, String b) {
       return a+b;
    }
    private void print(String a, String b, String c) {
        System.out.println(a+b+c);
    }
    public void print(String a, String b, String c,String d) {
        System.out.println(a+b+c+d);
    }

    public static void main(String[] args) {
        varargs obj=new varargs();
         obj.print(" A "," B "," C ");
    }
}
