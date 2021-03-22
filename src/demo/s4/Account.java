package demo.s4;

public class Account {
    int balance;

    public synchronized void napTien(int amount){
        balance+=amount;
        System.out.println("Nap "+amount+" thanh cong");
        try {
            notify();
//            notifyAll();
        }catch (Exception e){}
    }

    public synchronized void rutTien(int amount){
        while (balance<amount){
            System.out.println("Cho ti me dang gui tien..");
            try {
                wait();
            }catch (Exception e){}
        }
        balance -= amount;
        System.out.println("Rut "+amount+" thanh cong");
    }
}
