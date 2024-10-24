package q1;

public class Runner1 {
    public static void main(String[] args) {
        Worker worker = new Worker("Akib",2000);
        Supervisor supervisor = new Supervisor("Tamzid",2000,"D1");
        Director director = new Director("Tawhid",4000,"D2");
        System.out.println(worker);
        System.out.println(supervisor);
        System.out.println(director);
    }
}
