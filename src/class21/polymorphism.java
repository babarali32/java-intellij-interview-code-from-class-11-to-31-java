package class21;
public class polymorphism {
}
class Car {
        void start() {
            System.out.println("Use keys to start me");
        }
        void stop() {
            System.out.println("Use brake to stop me");
        }
        void park() {
            System.out.println("Park me manually");
        }
    }
    class BMW extends Car {
        @Override
        void start() {
            System.out.println("use the button to start me");
        }
    }
    class Tesla extends Car{
        @Override
        void start() {
            System.out.println("use the mobile app to start me");
        }
        @Override
        void park(){
            System.out.println("use sensors to park me");
        }
    }
    class Toyota extends Car{

}
