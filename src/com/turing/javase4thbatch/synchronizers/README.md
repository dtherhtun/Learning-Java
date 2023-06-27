# The Java Synchronizers

## Semaphore

```mermaid
sequenceDiagram
    participant Thread1
    participant Thread2
    participant Semaphore

    Thread1->>Semaphore: acquire()
    Semaphore->>Semaphore: Decrease permit count
    Thread2->>Semaphore: acquire()
    Semaphore->>Semaphore: Decrease permit count

    Note over Semaphore: Only 1 permit available

    alt Critical Section
        Thread1->>Semaphore: release()
        Semaphore->>Semaphore: Increase permit count
    else
        Thread1->>Semaphore: Waiting
    end

    Note over Semaphore: 1 permit available

    alt Critical Section
        Thread2->>Semaphore: release()
        Semaphore->>Semaphore: Increase permit count
    else
        Thread2->>Semaphore: Waiting
    end
```
---
## CountDownLatch
```mermaid
sequenceDiagram
    participant Thread1
    participant Thread2
    participant CountDownLatch

    Thread1->>CountDownLatch: await()
    Thread2->>CountDownLatch: await()

    Note over CountDownLatch: Waiting for count to reach 0

    Thread1->>CountDownLatch: countDown()
    CountDownLatch->>CountDownLatch: Decrease count
    Thread2->>CountDownLatch: countDown()
    CountDownLatch->>CountDownLatch: Decrease count

    alt Resume Execution
        Thread1->>CountDownLatch: resume execution
    else
        Thread1->>CountDownLatch: Waiting
    end

    Note over CountDownLatch: Waiting for count to reach 0

    alt Resume Execution
        Thread2->>CountDownLatch: resume execution
    else
        Thread2->>CountDownLatch: Waiting
    end
```
---
## CyclicBarrier
```mermaid
sequenceDiagram
    participant Thread1
    participant Thread2
    participant CyclicBarrier

    Thread1->>CyclicBarrier: await()
    Thread2->>CyclicBarrier: await()

    Note over CyclicBarrier: Waiting for all parties to arrive

    alt Resume Execution
        CyclicBarrier->>Thread1: resume execution
        CyclicBarrier->>Thread2: resume execution
    else
        CyclicBarrier->>Thread1: Waiting
        CyclicBarrier->>Thread2: Waiting
    end
```
---
## Exchanger
```mermaid
sequenceDiagram
    participant Thread1
    participant Thread2
    participant Exchanger

    Thread1->>Exchanger: exchange(object1)
    Exchanger->>Exchanger: Wait for other thread
    Thread2->>Exchanger: exchange(object2)
    Exchanger->>Thread1: Return object2
    Exchanger->>Thread2: Return object1
```
---
## Phaser
```mermaid
sequenceDiagram
    participant Thread1
    participant Thread2
    participant Thread3
    participant Phaser

    Thread1->>Phaser: register()
    Thread2->>Phaser: register()
    Thread3->>Phaser: register()

    Note over Phaser: Waiting for all threads to register

    Thread1->>Phaser: arriveAndAwaitAdvance()
    Thread2->>Phaser: arriveAndAwaitAdvance()
    Thread3->>Phaser: arriveAndAwaitAdvance()

    Note over Phaser: Waiting for all threads to reach barrier

    alt Resume Execution
        Phaser->>Thread1: resume execution
        Phaser->>Thread2: resume execution
        Phaser->>Thread3: resume execution
    else
        Phaser->>Thread1: Waiting
        Phaser->>Thread2: Waiting
        Phaser->>Thread3: Waiting
    end
```