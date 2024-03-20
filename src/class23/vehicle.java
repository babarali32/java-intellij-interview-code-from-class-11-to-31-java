package class23;

public abstract class vehicle {
    String vinumber;
    static int total;
    vehicle (String vinumber){
        total++;
        this.vinumber=vinumber;
        System.out.println("grandpa construcotr is called ");
    }
    public void printCount(){
        System.out.println(total+" vehicle object number ");
    }
    public void drive(){
        System.out.println(" vehcile is driving by me");
    }
    public void stop(){
        System.out.println("use brakes to stop car");
    }

    public abstract void speed();

    public abstract void start();
}
abstract class car extends vehicle{
    public car(String vinnumber){
        super(vinnumber);
    }
    @Override
    public void drive(){
        System.out.println(" vehcile is driving by driver");
    }
    public abstract void speed();
}
class BMW extends vehicle {
    public BMW (String vinnumber) {
        super(vinnumber);
    }
    @Override
    public void speed() {
        System.out.println("");
    }
    @Override
    public void start() {
        System.out.println("");
    }
}
class testerclass{
    public static void main(String[] args) {
        vehicle obj=new BMW("203");
        obj.drive();
        obj.printCount();
        obj.stop();
        obj.start();


    }
}