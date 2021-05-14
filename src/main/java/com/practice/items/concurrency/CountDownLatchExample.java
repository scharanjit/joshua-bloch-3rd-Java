package com.practice.items.concurrency;

import static java.util.stream.Collectors.toList;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.stream.Stream;


/**
 * CountDownLatch we can cause a thread to block until other
 * threads have completed a given task.
 *
 * Countdown latches are single-use barriers that allow one or more
 * threads to wait for one or more other threads to do something.
 * The sole constructor for CountDownLatch takes an int that is
 * the number of times the countDown method must be invoked on the
 * latch before all waiting threads are allowed to proceed.
 */

public class CountDownLatchExample {


  public static void main(String[] args) throws InterruptedException {
    new CountDownLatchExample().callWorker();
  }

  private void callWorker() throws InterruptedException {

    List<String> outputScraper = Collections.synchronizedList(new ArrayList<>());
    CountDownLatch countDownLatch = new CountDownLatch(5);
    List<Thread> workers = Stream
        .generate(() -> new Thread(new Worker(outputScraper, countDownLatch)))
        .limit(5)
        .collect(toList());

    workers.forEach(Thread::start);
    countDownLatch.await();
    outputScraper.add("Latch released");

//    assertThat(outputScraper)
//        .containsExactly(
//            "Counted down",
//            "Counted down",
//            "Counted down",
//            "Counted down",
//            "Counted down",
//            "Latch released"
//        );

  }

}
