package class22;
public class son extends father {
     public son(String name) {
        super(" hello");
    }
    @Override
    public void sleep(){
        System.out.println(name+" sleep for 5 hours");
    }
    @Override
    public void eat(){
        System.out.println(name+" eat kababs ");
    }
}
