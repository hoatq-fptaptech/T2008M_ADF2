package demo.s4;

public class Prime {
    int x=0;
    int y=0;
    int z = 0;

    public  void tangXY(){
        x++;
        y++;
    }

    public  void inKetQua(){
        System.out.println(Thread.currentThread().getName()+"---");
        System.out.println("x="+x);
        System.out.println("y="+y);
    }

    public synchronized void thaydoiXY(){
        tangXY();
        inKetQua();
    }

    public synchronized void thaydoiZ(){
        z++;
        System.out.println(Thread.currentThread().getName()+"---");
        System.out.println("z="+z);
    }
}
