package Thread_20230726.callable_runnable_02.lock;

import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.Condition;

/**
 * 实现独占锁
 */
public class SimpleLock
{
	private static class Sync extends AbstractQueuedSynchronizer
	{

		//尝试已独占模式获取同步状态。由子类实现,返回true代表获取成功
		@Override
		protected boolean tryAcquire(int arg)
		{
			if (compareAndSetState(0, 1))
			{
				setExclusiveOwnerThread(Thread.currentThread());
				return true;
			}
			return false;
		}

		//独占模式释放同步状态
		@Override
		protected boolean tryRelease(int arg)
		{
			return super.tryRelease(arg);
		}

		//共享模式获取同步状态
		@Override
		protected int tryAcquireShared(int arg)
		{
			return super.tryAcquireShared(arg);
		}

		//共享模式释放同步状态
		@Override
		protected boolean tryReleaseShared(int arg)
		{
			return super.tryReleaseShared(arg);
		}

		//判断当前线程是否已独占模式持有同步状态  true代表当前线程持有同步状态
		@Override
		protected boolean isHeldExclusively()
		{
			return super.isHeldExclusively();
		}

		final ConditionObject newCondition()
		{
			return new ConditionObject();
		}
	}


		private final Sync sync = new Sync();

		public void lock(){
			sync.tryAcquire(1);
		}

		public void unlock(){
			sync.tryRelease(1);
		}

		public Condition newCondition(){
			return sync.newCondition();

	   }


}
