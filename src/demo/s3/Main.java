package demo.s3;

public class Main {
    public static void main(String[] args){
        DemoThread dt = new DemoThread();
        dt.setName("Demo Thread 01");
        dt.start();
//        DemoThread dt2 = new DemoThread();
//        dt2.setName("Demo Thread 02");
//        dt2.start();
//        for (int i=0;i<20;i++){
//            System.out.println(Thread.currentThread().getName()+" i = "+i);
//            try{
//                Thread.sleep(500);
//            }catch (Exception e){}
//
//        }
    }
    // tao 1 thread dem nguoc thoi gian ve 0
    // gia su ban dau chay tu 10 phut
}
