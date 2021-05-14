package com.practice.items.concurrency;

import java.util.List;
import java.util.concurrent.CountDownLatch;

public class Worker implements Runnable {

  static int i= 0;

  private final List<String> outputScraper;
  private final CountDownLatch countDownLatch;

  public Worker(List<String> outputScraper, CountDownLatch countDownLatch) {
    this.outputScraper = outputScraper;
    this.countDownLatch = countDownLatch;
  }

  @Override
  public void run() {
    doSomeWork();
    outputScraper.add("Counted down");
    countDownLatch.countDown();
  }

  private void doSomeWork() {
    i = i + 1;
    System.out.println(i);
  }
}