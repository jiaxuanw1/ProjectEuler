import math


def choose(n, k):
    perm = 1
    for i in range(n, n - k, -1):
        perm *= i
    return perm / math.factorial(k)


print(choose(40, 20))
