package class21;

public class Testerpolymorphsim {
        public static void main(String[] args) {
           Car obj=new BMW();
           Car obj1=new Tesla();
           Car obj2=new Toyota();

            BMW bmw = new BMW();
            bmw.start();
            bmw.stop();
            bmw.park();
            System.out.println("--------------------------");
            Tesla tesla = new Tesla();
            tesla.start();
            tesla.stop();
            tesla.park();
            System.out.println("--------------------------");
            Toyota toyota = new Toyota();
            toyota.start();
            toyota.stop();
            toyota.park();
            System.out.println("------------------------------");
            Car[] cars = {new BMW(), new Tesla(), new Toyota()};
            for (Car all:cars
                 ) {
                all.park();
                all.start();
                all.stop();
            }

        }
    }


