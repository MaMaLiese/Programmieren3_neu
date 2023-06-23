//package StoppenNicely;
//
//public class Main {
//    public static void main(String[] args) {
//
//        Person P1 = new Person("Hansi");
//        Person P2 = new Person("Ducess of the Big");
//
//        Thread t1 = new Thread(P1);
//        Thread t2 = new Thread(P2);
//
//        t1.start();
//        t2.start();
//        System.out.println("main() ende.");
//        try {
//            t1.join();
//            t2.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println("");
//    }
//}
