package org.koorye.day4.util;

import java.util.concurrent.*;

/**
 * @author Koorye
 * @title 线程池
 */
public class ThreadPool {

  private static final ExecutorService THREAD_POOL = new ThreadPoolExecutor(
      10,
      20,
      10,
      TimeUnit.SECONDS,
      new LinkedBlockingDeque<>(5),
      Executors.defaultThreadFactory(),
      new ThreadPoolExecutor.AbortPolicy());

  public static void stop() {
    THREAD_POOL.shutdown();
  }

  public static void run(Runnable runnable) {
    THREAD_POOL.execute(runnable);
  }

}
