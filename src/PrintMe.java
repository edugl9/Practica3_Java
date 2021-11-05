public class PrintMe implements Runnable{
    @Override
    public void run() {
        try {
            for(int i=1;i<10;i++)
                System.out.println("Número "+i);
            Thread.sleep(2000);
        }catch (InterruptedException e){
            System.out.println("error");
        }
    }
}
