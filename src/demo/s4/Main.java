package demo.s4;

public class Main {
    public static void main(String[] args){
        Prime p = new Prime();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<20;i++){
                  // synchronized (p){
//                       System.out.println("T1----");
//                       p.tangXY();
//                       p.inKetQua();
                    p.thaydoiXY();
                  // }
                    try {
                        Thread.sleep(1000);
                    }catch (Exception e){}
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<20;i++){
                    //synchronized (p){

//                        p.tangXY();
//                        p.inKetQua();
                        p.thaydoiXY();
                  //  }
                    try {
                        Thread.sleep(1000);
                    }catch (Exception e){}
                }
            }
        });

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<20;i++){
                   // synchronized (p){
                        p.thaydoiZ();
                   // }
                    try {
                        Thread.sleep(1000);
                    }catch (Exception e){}
                }
            }
        });
        t1.setName("T1");
        t2.setName("T2");
        t3.setName("T3");
        t1.start();
//        t2.setDaemon(true);
        t2.start();
//        try {
//            t1.join();
//        }catch (Exception e){}
        t3.start();
    }
}
