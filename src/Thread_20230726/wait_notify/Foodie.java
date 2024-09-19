package Thread_20230726.wait_notify;

public class Foodie extends java.lang.Thread {
    @Override
    public void run() {
      while (true){
          synchronized (Desk.lock){
              if(Desk.count==0){
                  break;
              }else{
                  //判断桌子上是否有面条
                  if(Desk.footFlag==0){
                      //如果没有就等待
                      try {
                          Desk.lock.wait();
                      } catch (InterruptedException e) {
                         e.printStackTrace();
                      }
                  }else{
                      //把吃的总数减一
                      Desk.count--;
                      //如果有就开吃
                      System.out.println("吃货在吃面条,还能再吃+"+Desk.count+"碗！！");
                      //吃完之后,唤醒厨师就行做
                      Desk.lock.notifyAll();
                      //修改桌子上的面条状态
                      Desk.footFlag=0;
                  }
              }
          }
      }
    }
}
