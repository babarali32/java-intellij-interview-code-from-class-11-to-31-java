package class24;
     interface interfaces {
     double gravity=9.8; // by default this is public static final
     void applefalling();  // by default this is public abstract
    public abstract void ballfall();
}
        interface rocket extends interfaces{
        @Override
            void applefalling();  // implementation interface is only occrued in class

        }
        interface plane extends rocket{

        }
        class play implements rocket {
            @Override
            public void applefalling(){
                System.out.println(" hello");
            }

            @Override
            public void ballfall() {
                System.out.println(" hello world");
            }

            public static void main(String[] args) {
                new play();
            }
        }