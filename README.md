# 3577-LC-.-Count-the-Number-of-Computer-Unlocking-Permutations-
Intution -->
--------------
Computer 0 is already unlocked.

To unlock every other computer i, there must exist some j < i such that
complexity[j] < complexity[i].

Step 1: Validate unlocking

If any computer (except 0) has complexity ≤ complexity[0],
unlocking all computers is impossible → return 0.

Step 2: Count permutations

If the condition passes, then:

All computers can be unlocked

Computer 0 is fixed

Remaining (n−1) computers can be unlocked in any order
 Total valid orders = (n − 1)! (mod 10⁹ + 7)
