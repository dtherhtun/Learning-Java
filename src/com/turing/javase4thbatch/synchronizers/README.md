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

    Thread1->>Semaphore: acquire()
    Semaphore->>Semaphore: Decrease permit count (Available permits: 1)
    Thread2->>Semaphore: acquire()
    Semaphore->>Semaphore: Decrease permit count (Available permits: 0)
    Thread3->>Semaphore: acquire()
    Semaphore->>Semaphore: Blocked, waiting for permit
    Thread4->>Semaphore: acquire()
    Semaphore->>Semaphore: Blocked, waiting for permit

    Note over Semaphore: 2 permits available

    alt Thread1 enters the critical section
        Thread1->>Semaphore: release()
        Semaphore->>Semaphore: Increase permit count (Available permits: 1)
    else Thread1 waits
        Thread1->>Semaphore: Waiting
    end

    alt Thread2 enters the critical section
        Thread2->>Semaphore: release()
        Semaphore->>Semaphore: Increase permit count (Available permits: 2)
    else Thread2 waits
        Thread2->>Semaphore: Waiting
    end

    alt Thread3 enters the critical section
        Thread3->>Semaphore: release()
        Semaphore->>Semaphore: Increase permit count (Available permits: 3)
    else Thread3 waits
        Thread3->>Semaphore: Waiting
    end

    alt Thread4 enters the critical section
        Thread4->>Semaphore: release()
        Semaphore->>Semaphore: Increase permit count (Available permits: 4)
    else Thread4 waits
        Thread4->>Semaphore: Waiting
    end

```
---
## CountDownLatch
- **Purpose**: CountDownLatch is used to synchronize multiple threads by **waiting for a fixed number of events or tasks** to complete before proceeding.
- **Usage**: It is commonly used when you have a main thread that needs to **wait for several worker threads** to finish their tasks before continuing.
- **Metaphor**: Imagine a relay race with multiple runners. The anchor leg runner waits at the finish line, and the race can only be considered complete when all runners have crossed the finish line and the anchor leg runner receives the baton.

```mermaid
sequenceDiagram
    participant Thread1
    participant Thread2
    participant Thread3
    participant Thread4
    participant CountDownLatch

    Thread1->>CountDownLatch: await()
    Thread2->>CountDownLatch: await()
    Thread3->>CountDownLatch: await()
    Thread4->>CountDownLatch: await()

    Note over CountDownLatch: Waiting for count to reach 0

    Thread1->>CountDownLatch: countDown()
    CountDownLatch->>CountDownLatch: Decrease count (Current count: 3)
    Thread2->>CountDownLatch: countDown()
    CountDownLatch->>CountDownLatch: Decrease count (Current count: 2)
    Thread3->>CountDownLatch: countDown()
    CountDownLatch->>CountDownLatch: Decrease count (Current count: 1)
    Thread4->>CountDownLatch: countDown()
    CountDownLatch->>CountDownLatch: Decrease count (Current count: 0)

    alt Thread1 resumes execution
        Thread1->>CountDownLatch: Resumed
    else Thread1 waits
        Thread1->>CountDownLatch: Waiting
    end

    alt Thread2 resumes execution
        Thread2->>CountDownLatch: Resumed
    else Thread2 waits
        Thread2->>CountDownLatch: Waiting
    end

    alt Thread3 resumes execution
        Thread3->>CountDownLatch: Resumed
    else Thread3 waits
        Thread3->>CountDownLatch: Waiting
    end

    alt Thread4 resumes execution
        Thread4->>CountDownLatch: Resumed
    else Thread4 waits
        Thread4->>CountDownLatch: Waiting
    end

```
---
## CyclicBarrier
**Purpose**: CyclicBarrier is used to synchronize a fixed number of threads at a common barrier point, where they must **wait until all threads have arrived** before proceeding together.
**Usage**: It is commonly used in scenarios where you have **multiple threads performing different parts of a task**, and you want them to **wait for each other** at certain synchronization points.
**Metaphor**: Picture a team building activity where team members are spread across an obstacle course. They can only move to the next obstacle when all team members have completed the current one. They repeat this cycle until they reach the final obstacle together.

```mermaid
sequenceDiagram
    participant Thread1
    participant Thread2
    participant Thread3
    participant Thread4
    participant CyclicBarrier

    Thread1->>CyclicBarrier: await()
    Thread2->>CyclicBarrier: await()
    Thread3->>CyclicBarrier: await()
    Thread4->>CyclicBarrier: await()

    Note over CyclicBarrier: Waiting for all threads to arrive

    CyclicBarrier->>CyclicBarrier: Increment arrival count (Current count: 1)
    CyclicBarrier->>CyclicBarrier: Check if all threads arrived

    alt All threads arrived
        CyclicBarrier->>CyclicBarrier: Reset arrival count to 0
        Thread1->>CyclicBarrier: Resumed
        Thread2->>CyclicBarrier: Resumed
        Thread3->>CyclicBarrier: Resumed
        Thread4->>CyclicBarrier: Resumed
    else Threads still arriving
        Thread1->>CyclicBarrier: Waiting
    end

```
---
## Exchanger
**Purpose**: Exchanger provides a synchronization point where **two threads can exchange data**, allowing them to **coordinate and communicate** with each other.
**Usage**: It is commonly used in scenarios where two threads need to **exchange information or pass data** between each other.
**Metaphor**: Think of a secret message exchange between two agents. They meet at a predetermined location, exchange their information, and then go their separate ways.

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
**Purpose**: Phaser is a more flexible synchronization construct that allows synchronization of a **variable number of threads in multiple phases**, providing a more dynamic synchronization mechanism.
**Usage**: It is commonly used in scenarios where the **number of participating threads can change dynamically**, and synchronization needs to be performed in **multiple stages or phases**.
**Metaphor**: Imagine a music concert with multiple performances and intermissions. The audience waits for each phase of the concert to complete before moving on to the next, allowing for variations in the number of performers and acts.

```mermaid
sequenceDiagram
    participant Thread1
    participant Thread2
    participant Thread3
    participant Thread4
    participant Phaser

    Thread1->>Phaser: register()
    Thread2->>Phaser: register()
    Thread3->>Phaser: register()
    Thread4->>Phaser: register()

    Note over Phaser: Waiting for all threads to register

    Thread1->>Phaser: arriveAndAwaitAdvance()
    Thread2->>Phaser: arriveAndAwaitAdvance()
    Thread3->>Phaser: arriveAndAwaitAdvance()
    Thread4->>Phaser: arriveAndAwaitAdvance()

    Note over Phaser: Waiting for all threads to reach barrier

    alt All threads reached barrier
        Thread1->>Phaser: Resumed
        Thread2->>Phaser: Resumed
        Thread3->>Phaser: Resumed
        Thread4->>Phaser: Resumed
    else Threads still reaching barrier
        Thread1->>Phaser: Waiting
    end

```