//package Threading;
//
//import StoppenNicely.ConsoleHelper;
//
//import java.sql.SQLOutput;
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
//        System.out.println("Drücken Sie eine Taste, um die Threads zu stoppen!");
//
//        System.out.println(t1.getState());
//        System.out.println(t2.getState());
//
//        if(ConsoleHelper.readLine() != null){
//            P1.requestShutDown();
//            System.out.println(t1.getState());
//            System.out.println(t2.getState());
//        }
//
//        if(ConsoleHelper.readLine() != null){
//            P2.requestShutDown();
//            System.out.println(t1.getState());
//            System.out.println(t2.getState());
//        }
//       try {
//        t1.join();
//        t2.join();
//    } catch (InterruptedException e) {
//           throw new RuntimeException(e);
//       }
//        System.out.println("");
//}
