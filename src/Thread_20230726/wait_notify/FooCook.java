package Thread_20230726.wait_notify;

public class FooCook extends java.lang.Thread {
    @Override
    public void run() {
        while(true){
            synchronized (Desk.lock){
                if(Desk.count==0){
                    break;
                }else {
                    if(Desk.footFlag==1){
                        try {
                            Desk.lock.wait();//lock是Object类    wait()是object的方法
                        } catch (InterruptedException e) {
                           e.printStackTrace();
                        }
                    }else{
                        //如果没有就开始做面条
                        System.out.println("厨师正在做面条,还能再做"+Desk.count+"碗！！");
                        //修改面条状态
                        Desk.footFlag=1;
                        //做完后提醒消费者，可以吃面条了
                        Desk.lock.notifyAll();
                    }

                }
            }
        }
    }
}
