# The Java Synchronizers

## Semaphore
- **Purpose**: Semaphore is used to control access to a shared resource by **limiting the number of threads** that can access it simultaneously.
- **Usage**: It is commonly used in scenarios where you want to **limit concurrent access to a resource** or **protect a critical section** of code.
- **Metaphor**: Think of a nightclub with a limited capacity. The bouncer at the entrance allows a certain number of people to enter at a time. Once the limit is reached, additional people have to wait until others exit.
```mermaid
sequenceDiagram
    participant Thread1
    participant Thread2
    participant Thread3
    participant Thread4
    participant Semaphore
    
    Note over Semaphore: 2 permits available

    Thread1->>Semaphore: acquire()
    Semaphore->>Semaphore: Decrease permit count (Available permits: 1)
    Note over Semaphore: 1 permits available
    Thread2->>Semaphore: acquire()
    Semaphore->>Semaphore: Decrease permit count (Available permits: 0)
    Note over Semaphore: 0 permits available
    Thread3->>Semaphore: acquire()
    Semaphore->>Semaphore: Blocked, waiting for permit
    Thread4->>Semaphore: acquire()
    Semaphore->>Semaphore: Blocked, waiting for permit

    alt Thread1 enters the critical section
        Note over Thread1: Perform critical section operations
        Thread1->>Semaphore: release()
        Semaphore->>Semaphore: Increase permit count 
    end
    Note over Semaphore: 1 permits available

    alt Thread2 enters the critical section
        Note over Thread2: Perform critical section operations
        Thread2->>Semaphore: release()
        Semaphore->>Semaphore: Increase permit count 
    end
    Note over Semaphore: 2 permits available

    alt Thread3 enters the critical section
        Note over Thread3: Perform critical section operations if available permit
        Thread3->>Semaphore: release()
        Semaphore->>Semaphore: Increase permit count 
    else Thread3 waits
        Thread3->>Semaphore: Blocked, waiting for permit if no permit available
    end

    alt Thread4 enters the critical section
        Note over Thread3: Perform critical section operations if available permit
        Thread4->>Semaphore: release()
        Semaphore->>Semaphore: Increase permit count 
    else Thread4 waits
        Thread4->>Semaphore: Blocked, waiting for permit if no permit available
    end
```
---
## CountDownLatch
- **Purpose**: CountDownLatch is used to synchronize multiple threads by **waiting for a fixed number of events or tasks** to complete before proceeding.
- **Usage**: It is commonly used when you have a main thread that needs to **wait for several worker threads** to finish their tasks before continuing.
- **Metaphor**: Imagine a relay race with multiple runners. The anchor leg runner waits at the finish line, and the race can only be considered complete when all runners have crossed the finish line and the anchor leg runner receives the baton.

```mermaid
sequenceDiagram
    participant MainThread
    participant WorkerThread1
    participant WorkerThread2
    participant WorkerThread3
    participant WorkerThread4
    participant CountDownLatch

    MainThread->>WorkerThread1: Execute task
    MainThread->>WorkerThread2: Execute task
    MainThread->>WorkerThread3: Execute task
    MainThread->>WorkerThread4: Execute task

    Note over CountDownLatch: Count = 4

    Note over WorkerThread1: Continue execution
    Note over WorkerThread2: Continue execution
    Note over WorkerThread3: Continue execution
    Note over WorkerThread4: Continue execution

    MainThread->>CountDownLatch: Wait until tasks are completed

    WorkerThread1-->>CountDownLatch: Signal task completion
    WorkerThread2-->>CountDownLatch: Signal task completion
    WorkerThread3-->>CountDownLatch: Signal task completion
    WorkerThread4-->>CountDownLatch: Signal task completion

    Note over CountDownLatch: Count = 0

    CountDownLatch-->>MainThread: Resume execution

    Note over MainThread: All tasks completed.
```
---
## CyclicBarrier
- **Purpose**: CyclicBarrier is used to synchronize a fixed number of threads at a common barrier point, where they must **wait until all threads have arrived** before proceeding together.
- **Usage**: It is commonly used in scenarios where you have **multiple threads performing different parts of a task**, and you want them to **wait for each other** at certain synchronization points.
- **Metaphor**: Picture a team building activity where team members are spread across an obstacle course. They can only move to the next obstacle when all team members have completed the current one. They repeat this cycle until they reach the final obstacle together.

```mermaid
sequenceDiagram
    participant Thread1
    participant Thread2
    participant Thread3
    participant Thread4
    participant CyclicBarrier

    Thread1->>CyclicBarrier: Execute part of the task
    Thread2->>CyclicBarrier: Execute part of the task
    Thread3->>CyclicBarrier: Execute part of the task
    Thread4->>CyclicBarrier: Execute part of the task

    Note over CyclicBarrier: Threads waiting at the barrier

    CyclicBarrier-->>Thread1: Synchronize at the barrier
    CyclicBarrier-->>Thread2: Synchronize at the barrier
    CyclicBarrier-->>Thread3: Synchronize at the barrier
    CyclicBarrier-->>Thread4: Synchronize at the barrier

    Note over CyclicBarrier: All threads reached the barrier. Continuing execution.

    Note over Thread1: Execute remaining part of the task
    Note over Thread2: Execute remaining part of the task
    Note over Thread3: Execute remaining part of the task
    Note over Thread4: Execute remaining part of the task
```
---
## Exchanger
- **Purpose**: Exchanger provides a synchronization point where **two threads can exchange data**, allowing them to **coordinate and communicate** with each other.
- **Usage**: It is commonly used in scenarios where two threads need to **exchange information or pass data** between each other.
- **Metaphor**: Think of a secret message exchange between two agents. They meet at a predetermined location, exchange their information, and then go their separate ways.

```mermaid
sequenceDiagram
    participant Thread1
    participant Thread2
    participant Thread3
    participant Thread4
    participant Exchanger

    Thread1->>Exchanger: exchange(data1)
    Exchanger->>Exchanger: Wait for another thread
    Thread2->>Exchanger: exchange(data2)
    Exchanger->>Thread1: Return exchanged data2
    Exchanger->>Thread2: Return exchanged data1
    Thread3->>Exchanger: exchange(data3)
    Exchanger->>Exchanger: Wait for another thread
    Thread4->>Exchanger: exchange(data4)
    Exchanger->>Thread3: Return exchanged data4
    Exchanger->>Thread4: Return exchanged data3
    
```
---
## Phaser
- **Purpose**: Phaser is a more flexible synchronization construct that allows synchronization of a **variable number of threads in multiple phases**, providing a more dynamic synchronization mechanism.
- **Usage**: It is commonly used in scenarios where the **number of participating threads can change dynamically**, and synchronization needs to be performed in **multiple stages or phases**.
- **Metaphor**: Imagine a music concert with multiple performances and intermissions. The audience waits for each phase of the concert to complete before moving on to the next, allowing for variations in the number of performers and acts.

```mermaid
sequenceDiagram
    participant MainThread
    participant Thread1
    participant Thread2
    participant Thread3
    participant Thread4
    participant Phaser

    MainThread->>Phaser: register()
    Thread1->>Phaser: register()
    Thread2->>Phaser: register()
    Thread3->>Phaser: register()
    Thread4->>Phaser: register()

    Note over Phaser: Total registered parties: 5

    MainThread->>Phaser: arriveAndAwaitAdvance()
    Thread1->>Phaser: arriveAndAwaitAdvance()
    Thread2->>Phaser: arriveAndAwaitAdvance()
    Thread3->>Phaser: arriveAndAwaitAdvance()
    Thread4->>Phaser: arriveAndAwaitAdvance()

    Note over MainThread: Starting phase 1
    Note over Thread1: Starting phase 1
    Note over Thread2: Starting phase 1
    Note over Thread3: Starting phase 1
    Note over Thread4: Starting phase 1

    Note over Phaser: All threads have arrived

    MainThread->>Phaser: arriveAndAwaitAdvance()
    Thread1->>Phaser: arriveAndAwaitAdvance()
    Thread2->>Phaser: arriveAndAwaitAdvance()
    Thread3->>Phaser: arriveAndAwaitAdvance()
    Thread4->>Phaser: arriveAndAwaitAdvance()

    Note over MainThread: Starting phase 2
    Note over Thread3: Starting phase 2
    Note over Thread2: Starting phase 2
    Note over Thread1: Starting phase 2
    Note over Thread4: Starting phase 2

    Note over Phaser: All threads have arrived

    MainThread->>Phaser: arriveAndAwaitAdvance()
    Thread1->>Phaser: arriveAndAwaitAdvance()
    Thread2->>Phaser: arriveAndAwaitAdvance()
    Thread3->>Phaser: arriveAndAwaitAdvance()
    Thread4->>Phaser: arriveAndAwaitAdvance()

    Note over MainThread: Starting phase 3
    Note over Thread4: Starting phase 3
    Note over Thread1: Starting phase 3
    Note over Thread2: Starting phase 3
    Note over Thread3: Starting phase 3
    
    Thread1->>Phaser: arriveAndDeregister()
    Thread2->>Phaser: arriveAndDeregister()
    Thread3->>Phaser: arriveAndDeregister()
    Thread4->>Phaser: arriveAndDeregister()
    MainThread->>Phaser: arriveAndDeregister()

    Note over Phaser: All threads completed. Main thread continues.

```