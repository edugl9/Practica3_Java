public class ThreadTester {
    public static void main(String[] arg){
        PrintMe a=new PrintMe();
        PrintMe b=new PrintMe();
        PrintMe c=new PrintMe();

        Thread t1=new Thread(a);
        Thread t2=new Thread(b);
        Thread t3=new Thread(c);

        t1.start();
        t2.start();
        t3.start();
    }
}
