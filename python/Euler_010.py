def is_prime(n):
    for i in range(2, int(n ** 0.5) + 1):
        if n % i == 0:
            return False
    return True


sum_of_primes = 2 + sum(i for i in range(3, 2000000, 2) if is_prime(i))
print(sum_of_primes)
