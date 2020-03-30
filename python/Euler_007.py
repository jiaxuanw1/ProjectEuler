def is_prime(n):
    for i in range(2, int(n ** 0.5) + 1):
        if n % i == 0:
            return False
    return True


num = 3
term = 2
while term < 10001:
    num += 2
    if is_prime(num):
        term += 1

print(num)
