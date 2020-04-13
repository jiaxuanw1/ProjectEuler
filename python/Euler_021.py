def sum_proper_divisors(n):
    return sum(i for i in range(1, n) if n % i == 0)


def is_amicable(a):
    b = sum_proper_divisors(a)
    return b != a and sum_proper_divisors(b) == a


amicable_sum = sum(i for i in range(2, 10000) if is_amicable(i))
print(amicable_sum)
