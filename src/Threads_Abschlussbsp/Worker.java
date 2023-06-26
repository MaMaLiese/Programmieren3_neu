package Threads_Abschlussbsp;

public abstract class Worker { //kann class ableiten und dann abgeleitete Klasse instanzieren
    protected String name;
    protected boolean shouldRun;

    public Worker(String name) { //boolean nicht, weil in Angabe gewünscht
        this.name = name;
        this.shouldRun = true; //passt ohne this. auch; Kata hats händisch dazugeschrieben
    }

    abstract protected void work(); //keine {}-Klammern, weil abstract keinen Body hat
    protected void printStarted() {
        System.out.println(name + " wurde gestartet");
    }
    protected void printStopped(){
        System.out.println(name + " wurde gestoppt");
    }
    public void stopWorker() {
        shouldRun = false;
    } //Methode wird von außen aufgerufen
    abstract protected void run();







     }





