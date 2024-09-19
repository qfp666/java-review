package Thread_20230726.wait_notify;

public class Desk {
    /**
     * 控制生产者和消费者的执行
     */
    //是否有面条 0 没有面条     1有面条
    public static int footFlag = 0;

    //总个数
    public static int count = 10;

    //锁对象
    public static  Object lock = new Object();
}
