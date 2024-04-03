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
        for (int i = 0; i <= n/2; i++) {
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
        if (n < 1 && n%2 != 0) return false;
        int start = 1;
        int end = n/2;
        int sum = 0;

        while (start <= end){
            if (n%start == 0) {
                sum += start;
            }
            start++;
        }
        return sum == n;
    }
```

### digit
```java
    static boolean findDigit(int number, int n){
    while (number != 0) {
        if (number%10 == n) { // compare by each digit
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