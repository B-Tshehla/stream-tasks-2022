## Task 1 (package com.enfint.task1)

### Task Setup

Implement a method `findDuplicates` that should return a list of values that are repeated `numberOfDuplicates`
times.

For example:

```java
findDuplicates(asList(-1,1,3,2,2,2,5,6,-1,3,6),2);
```

should return "-1, 3 and 6" because these values are repeated "numberOfDuplicates = 2" times, but not "2", which
is repeated 3 times.

```java.
findDuplicates(asList(-1,-1,2,2,null,null),2);
```

_Null values are not counted:_

should return `-1 and 2`.

_Method must not return `null` value (if null is passed, return an empty list)._

### Task 2 (package com.enfint.task2)

### Task statement

You need to implement the `integerSum` method (in the `ListOperation` class), which should return the sum of integer values from
of a list of strings.

For example:

```java
integerSum(Arrays.asList("1 greater than -1", "today is April 1, 2021"));
```

should return

```java.
2022
```

## Task 3 (package com.enfint.task3)

### Task statement.

You need to implement a method `getThreeMaximum` (in the class `FindTheMaximumElements`) which should return 3
maximum BigDecimal values from a list of strings.

For example:

```java
getThreeMaximum(Arrays.asList("2","15","654","11","94","-200","89","-1","0"));
```

should return 89, 94, 654 - list of ``BigDecimal`` values

_Method must not return `null` value (if null is passed, return an empty list)._
_Null values will not be taken into account.

### Task 4 (package com.enfint.task4)

### Task statement

You need to implement the `findFromCollection` method (in the `EvenAndOddFinder` class) taking `List<Set<String>> input`, 
which should return `Map<CharacterType, Set<String>>` - `Map` with distributed sets consisting of strings with 
even and odd number of characters.

Where:

`CharacterType` is an enumeration of two elements, even(`EVEN`) and odd(`ODD`)

For example:

```java.
Set<String> set1 = initialize ...;

Set<String> set2 = initialization ...;

findFromCollection(Arrays.asList(set1, set2));
```

Should return

```java.
{ODD=[set of strings with odd number of characters], EVEN=[set of strings with even number of characters]}
```
_Method must not return `null` value. If `null` is passed, return:_
``java.
{ODD=[], EVEN=[]}
```
_Method can take `null` instead of `Set<String>` inside the list._
_Method can take `null` and `Set<String>` elements._

