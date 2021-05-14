## The synchronized keyword ensures that only a single thread can execute a method or block at one time.

### mutual exclusion means to prevent an object from being seen in an inconsistent state by one 
### thread while it’s being modified by another.


```when multiple threads share mutable data, each 
thread that reads or writes the data must perform synchronization. 
In the absence of synchronization, there is no guarantee 
that one thread’s changes will be visible to another thread. 

```



```
To avoid liveness and safety failures, never cede control 
to the client within a synchronized method or block. 

In other words, inside a synchronized region, 
do not invoke a method that is designed to be overridden,
 or one provided by a client in the form of a function object

```



```
StringBuffer instances are almost always used by a
 single thread, yet they per- form internal synchronization.

 It is for this reason that StringBuffer was sup- planted by 
StringBuilder, which is just an unsynchronized StringBuffer.

```



```
Prefer executors,tasks,and streams to threads

```


```
Mutual Exclusion: It means that only one thread or
 process can execute a block of code (critical section) at a time.

Visibility: It means that changes made by one 
thread to shared data are visible to other threads.


Java’s synchronized keyword guarantees both mutual
 exclusion and visibility. 


In some cases we may only desire the visibility
 and not atomicity. Use of synchronized in such
 situation is an overkill and may cause scalability problems. 
Here volatile comes to the rescue. Volatile variables 
have the visibility
 features of synchronized but not the atomicity features.

```