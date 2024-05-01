# Problem Solving Basic

## Math

### absolute value

The absolute value |x| of a real number x is the non-negative value of x without regard to its sign.
if x is negative

```
x = x * -1;
```

### power

```java
    static int pow(int base, int pow) {
    int result = 1;
    while (pow != 0) {
        result = result * base;
        pow--;
    }
    return result;
}
```

### isPrime

```java
    static boolean isPrime(int n) {
    // Corner case
    if (n <= 1)
        return false;

    // Check from 2 to n-1
    for (int i = 2; i < n; i++)
        if (n % i == 0)
            return false;

    return true;
}
```

### is square

```java
    static int isSquare(int n) {
    int temp = 0;
    while (temp * temp < n) {
        temp++;
    }
    return temp * temp == n ? 1 : 0;
}
```

```java
    static int isSquare(int n) {
    for (int i = 0; i <= n / 2; i++) {
        if (i * i == n) {
            return 1;
        }
    }
    return 0;
}
```

### isPerfectNumber

```java
    static boolean isPerfectN(int n) {
    if (n < 1 && n % 2 != 0) return false;
    int start = 1;
    int end = n / 2;
    int sum = 0;

    while (start <= end) {
        if (n % start == 0) {
            sum += start;
        }
        start++;
    }
    return sum == n;
}
```

### digit

```java
    static boolean findDigit(int number, int n) {
    while (number != 0) {
        if (number % 10 == n) { // compare by each digit
            return true;
        }
        number = number / 10; // reduce by each digit
    }
    return false;
}
```

### refund money

```java
    static int countRepresentation(int numRupees) {
    int count = 0;
    for (int rupee20 = 0; rupee20 <= (numRupees) / 20; rupee20++) {
        for (int rupee10 = 0; rupee10 <= (numRupees - (rupee20 * 20)) / 10; rupee10++) {
            for (int rupee5 = 0; rupee5 <= (numRupees - (rupee10 * 10 + rupee20 * 20)) / 5; rupee5++) {
                for (int rupee2 = 0; rupee2 <= (numRupees - (rupee5 * 5 + rupee10 * 10 + rupee20 * 20)) / 2; rupee2++) {
                    for (int rupee1 = 0; rupee1 <= numRupees - (rupee2 * 2 + rupee5 * 5 + rupee10 * 10 + rupee20 * 20); rupee1++) {
                        time++;
                        if ((rupee1 + rupee2 * 2 + rupee5 * 5 + rupee10 * 10 + rupee20 * 20) == numRupees) {
                            count++;
                        }
                    }
                }
            }
        }
    }
    return count;
}
```

### prime factor

                 6936
                  /\
                 2 3468
                    /\
                   2  1734
                       /\
                      2  867
                         /\
                        3  289
                            /\
                           17 17

```java
static int[] primeFactor(int n) {
    if (n <= 1) return null;
    int i = 0;
    int k = n;
    int size = 0;
    while (i <= n) {
        while (isPrime(i) && k % i == 0) {
            size++;
            k = k / i;
            System.out.println(k + " " + i);
        }
        i++;
    }
}
```

### N Integer Rounding

the largest multiple of n(base) less than or equal to number = (number/base) * base

```java
    static void IntegerBasedRounding(int[] a, int n) {
    if (a.length < 1 || n <= 0) return;

    float mid = ((float) n / 2);

    for (int i = 0; i < a.length; i++) {
        if (a[i] > n) {
            int j = n * (a[i] / n); // Find the largest multiple of n less than or equal to a[i]
            int remainder = a[i] % n; // Calculate the remainder
            if (remainder >= mid) {
                a[i] = j + n; // If the remainder is greater than or equal to mid, round up to the next multiple of n
            } else {
                a[i] = j; // Otherwise, round down to the current multiple of n
            }
        } else if (a[i] >= mid) {
            a[i] = n; // If a[i] is greater than or equal to mid and less than n, set it to n
        } else if (a[i] > 0) {
            a[i] = 0; // If a[i] is less than mid, set it to 0
        }
    }
}
```

```java
    static void IntegerBasedRounding(int[] a, int n) {
    if (a.length < 1 || n <= 0) return;

    int mid = n / 2;

    for (int i = 0; i < a.length; i++) {
        if (a[i] >= 0) {
            a[i] = ((a[i] + mid) / n) * n;
        }
    }
}
```

### digit Increase || Concat digit

```
product = 0;
product = (product * 10) + i;
```

```
product = 1;
product *= digit
```

```
result = result * 10 + count;
```

### Total Sum from 1 to n

same as total = 1+2+3+4+6+7+etc....

```bash
total = n(n+1)/2
```