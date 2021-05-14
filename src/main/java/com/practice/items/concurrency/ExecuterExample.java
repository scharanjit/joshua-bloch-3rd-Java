package com.practice.items.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuterExample {

  public static void main(String[] args) {

    ExecutorService exec = Executors.newSingleThreadExecutor();
    ExecutorService exec1 = Executors.newFixedThreadPool(10);


    Runnable runnable = null;
    exec.execute(runnable);


    exec.shutdown();

  }

}
