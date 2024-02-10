package MutiThreading;

public class PrintNumber implements  Runnable{

    private int printNo;
    public PrintNumber(int printNo){
        this.printNo=printNo;
    }

    @Override
    public void run() {
        System.out.println("Printed no is "
                +this.printNo+" Thread running is "
                +Thread.currentThread().getName());

    }
}
