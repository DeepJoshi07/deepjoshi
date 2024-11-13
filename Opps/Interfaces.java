public class Interfaces {
    interface Computer{
         void code();
    }
    static class Laptop implements Computer{
        public void code(){
            System.out.println("can code with it");
        }
    }
    static class Mobile implements Computer{
        public void code(){
            System.out.println("can code with it");
        }
    }
    static class Desktop implements Computer{
        public void code(){
            System.out.println("can code with it");
        }
    }
    static class Devloper{
        public static void machine(Computer c){
            c.code();
        }
    }
    public static void main(String[] args) {
        Devloper d = new Devloper();
        Laptop l = new Laptop();
        Computer dk = new Desktop();
        Mobile m = new Mobile();
        d.machine(m);
    }
}
